require('file?name=[name].[ext]!../node_modules/neo4j-driver/lib/browser/neo4j-web.min.js');
var Person = require('./models/Person');
var _ = require('lodash');

$.getJSON('./config.json', function(data) {         
  config = data;
});

var neo4j = window.neo4j.v1;
var driver = neo4j.driver("bolt://" + config.DB_HOST, neo4j.auth.basic(config.DB_USER, config.DB_PASSWD));

function getCompanyGraph(queryString) {
  var session = driver.session();
  var q = 'MATCH (c:COMPANY) \
  WHERE c.name =~ {name} OR c.UIC = {uic} \
  OPTIONAL MATCH (c)<-[r]-(p:PERSON) \
  return collect(c) AS companies, r, collect(p) AS people LIMIT 100'; 
  return session.run(q, {name: '(?iu).*' + queryString + '.*', uic: queryString})
    .then(results => {
      console.log(results);
      session.close();
      var nodes = [], rels = [], target = 0;
      results.records.forEach(res => {
        res.get("companies").forEach(company => {
          var li = _.findIndex(nodes, {uic: company.properties.UIC});
          if (li == -1) {
            nodes.push({name: company.properties.name, uic: company.properties.UIC, legal_form: company.properties.legalForm, label: 'company'}); //
            target = nodes.length - 1;
          } else {
            target = li;  
          }
          
          res.get('people').forEach(person => {
            var source = _.findIndex(nodes, {ucn: person.properties.EGN});
            if (source == -1) {
              nodes.push({name: person.properties.name, ucn: person.properties.EGN, label: 'person'});
              source = nodes.length - 1;
            }
            rels.push({source, target})
          });
        });
      });
      return {nodes, links: rels};
    });
}

function getPersonGraph(queryString) {
  var session = driver.session();
  var q = 'MATCH (p:PERSON)-[r]->(c:COMPANY) \
  WHERE p.name =~ {name} OR p.EGN = {egn} \
  return collect(p) AS people, r, collect(c) AS companies LIMIT 100'; 
  return session.run(q, {name: '(?iu).*' + queryString + '.*', egn: queryString})
    .then(results => {
      session.close();
      var nodes = [], rels = [], target = 0;
      results.records.forEach(res => {
        res.get("people").forEach(person => {
          var li = _.findIndex(nodes, {ucn: person.properties.EGN});
          if (li == -1) {
            nodes.push({name: person.properties.name, ucn: person.properties.EGN, label: 'person'}); //
            target = nodes.length - 1;
          } else {
            target = li;  
          }
          
          res.get('companies').forEach(company => {
            var source = _.findIndex(nodes, {ucn: company.properties.UIC});
            if (source == -1) {
              nodes.push({name: company.properties.name, uic: company.properties.UIC, legal_form: company.properties.legalForm, label: 'company'}); //
              source = nodes.length - 1;
            }
            rels.push({source, target})
          });
        });
      });
      return {nodes, links: rels};
    });
}

exports.getPersonGraph = getPersonGraph;
exports.getCompanyGraph = getCompanyGraph;
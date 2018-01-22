var _ = require('lodash');

function Company(_node) {
  _.extend(this, _node.properties);
}

module.exports = Company;

var _ = require('lodash');

function Foreigner(_node) {
  _.extend(this, _node.properties);
}

module.exports = Foreigner;

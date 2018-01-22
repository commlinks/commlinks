var _ = require('lodash');

function PermanentForeigner(_node) {
  _.extend(this, _node.properties);
}

module.exports = PermanentForeigner;

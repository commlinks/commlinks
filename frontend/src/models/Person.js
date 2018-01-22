var _ = require('lodash');

function Person(_node) {
  _.extend(this, _node.properties);

  if (this.id) {
    this.id = this.id.toNumber();
  }
}

module.exports = Person;

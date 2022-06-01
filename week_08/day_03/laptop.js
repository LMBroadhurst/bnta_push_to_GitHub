// Laptop Constructor

const Laptop = function(manufacturer, model, OS) {
    this.manufacturer = manufacturer;
    this.model = model;
    this.OS = OS;
}

Laptop.prototype.install = function(program) {
    console.log(`${this.model} installed ${program}`)
}

module.exports = Laptop;
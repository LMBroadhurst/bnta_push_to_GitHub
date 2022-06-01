const { Dealership } = require("./Dealership");
const { Car } = require("./Car");

class Customer {

    constructor(wallet) {
        this.wallet = wallet;
        this.car = null;
    }

    buyCar(Dealership, Car) {

        if (this.wallet >= Car.price) {
            this.car = Car;
            this.wallet -= Car.price;
        } 

        Dealership.sellCar(Car);
    }
}

const lewis = new Customer(900);

// const mini = new Car("Mini", 1000, "1.4L");
// const tesla = new Car("Tesla", 12500, "Electric");

const bhx = new Dealership("BHX", 10);

bhx.addCarToStock(mini);
bhx.addCarToStock(tesla);

// lewis.buyCar(bhx, mini);

console.log(lewis);
console.log(bhx);

module.exports = {
    Customer
}
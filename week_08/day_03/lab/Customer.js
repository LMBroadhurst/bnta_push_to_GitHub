
class Customer {

    constructor(name, wallet) {
        this.name = name;
        this.wallet = wallet;
        this.car = null;
        this.dealer = dealer
    }

    buyCar(car) {

        if (this.wallet >= Car.price && this.dealer != null) {
            this.car = Car;
            this.wallet -= Car.price;
        } 

        this.dealer.remove(car)
    }
}


module.exports = {
    Customer
}
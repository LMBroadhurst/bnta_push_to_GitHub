// Constructor functions

import Laptop from "./laptop";

class Student {
    constructor(name) {
        this.name = name;
        this.laptop = null;
    }
    greet() {
        console.log(`Hello, my name is ${this.name}`);
    }
    greetWithParam(name) {
        console.log(`Hello, my name is ${name}`);
    }
    buyLaptop(newLaptop) {
        this.laptop = newLaptop;
    }
}


const alice = new Student("Alice");

const newIMac = new Laptop("Apple", "iMac", "MacOS");

console.log(alice);
alice.buyLaptop(newIMac);
console.log(alice);



// alice.greet();
// alice.greetWithParam("Sir Quentin");

// const bob = new Student("Bob")
// bob.greet();


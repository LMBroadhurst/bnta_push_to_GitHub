// Constructor functions

const Student = function(name) {
    this.name = name;

    this.greet = function() {
        console.log(`Hello, my name is ${this.name}`);
    }
}

const alice = new Student("Alice");
alice.greet();

const bob = new Student("Bob")
bob.greet();

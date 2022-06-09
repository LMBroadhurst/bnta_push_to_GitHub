// Example of asynchronous coding

// let button = document.querySelector("#item1");

// button.addEventListener("click", () => {

// });

// Foofoo

const foo = () => console.log("First");
const bar = () => setTimeout(() => console.log("Second"), 500);
const baz = () => console.log("Third");

bar();
foo();
baz();



emptyArray = []
nums = [1, 2, 3, 4, 5]
strings = ["a", "b", "c"]
badIdea = [1, "a", true]
// push, pop, shift, unshift + length
badIdea
badIdea.push("A new element")
badIdea.pop()
badIdea
badIdea.shift()
badIdea.unshift();
badIdea.unshift("Yes")
badIdea.shift("No")
badIdea.length
alice = {
name: "Alice",
age: 25,
favouriteColour: "Blue"
}
alice.age
alice.favouriteColour
alice["name"]
alice.extraProperty = "Extra value"
alice.extraProperty
shoppingList = ["Milk", "Water", "Beer", "Coffee"]
for(item in shoppingList) {
console.log(item);
}
for(item of shoppingList) {
console.log(item.toUpperCase());
}
for (i = 0; i < shoppingList.length; i++) {
console.log(shoppingList[i]);
}
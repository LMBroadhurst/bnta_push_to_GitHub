const button = document.querySelector("#btn");
const box = document.querySelector("#box");

const handleButtonClick = () => {
    box.style.backgroundColor = "blue";
}

button.addEventListener('click', handleButtonClick);

const input = document.querySelector("#user-input");
const message = document.querySelector("#user-message")

input.addEventListener("input", (event) => {
    message.innerText = event.target.value;
})

const list = document.querySelector("ul");
const form = document.querySelector("#new-student-form");

form.addEventListener("submit", (event) => {
    event.preventDefault();
    const newListItem = document.createElement("li");
    newListItem.innerText = event.target["new-student"].value;
    console.log(event);
    list.appendChild(newListItem);
});
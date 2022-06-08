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
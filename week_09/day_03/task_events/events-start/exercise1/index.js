function displayDate() {
    document.getElementById("date").innerHTML = Date();
  }

const button = document.querySelector("button");

button.addEventListener('click', displayDate);


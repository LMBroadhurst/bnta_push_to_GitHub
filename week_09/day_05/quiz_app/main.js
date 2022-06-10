const questionContainer = document.querySelector("#question");
const questionButton = document.querySelector("#question-button");
const form = document.querySelector("#player-guess");
const resultContainer = document.querySelector("#result-container");
const scoreContainer = document.querySelector("#score-container");

let currentquestion;
// let currentScore = 0;

const loadQuestion = () => {
    fetch('https://opentdb.com/api.php?amount=1&type=boolean')
    .then( (response) => response.json() )
    .then( data =>  {
        questionContainer.innerText = data.results[0].question;
        currentquestion = data.results[0];
    })
}

const handlePlayerGuess = (event) => {
    event.preventDefault();

    const resultText = document.createElement("p");

    if (event.target.guess.value === currentquestion.correct_answer) {
        resultText.innerText = "Congrats!";
        const currentScore = scoreContainer.innerText;
        currentScore += 1;
        scoreContainer.innerText = currentScore;
    } else {
        resultText.innerText = "Incorrect!"
    }

    resultContainer.appendChild(resultText);
}

questionButton.addEventListener("click", loadQuestion);
form.addEventListener("submit", handlePlayerGuess)
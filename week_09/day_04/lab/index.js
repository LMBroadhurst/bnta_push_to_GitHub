console.log("Hi");

async function getCountryByName(countryName) {
    let url = `https://restcountries.com/v2/name/${countryName}`;
    await fetch(url)
        .then(response => response.json())
        .then(data => console.log(data))
        .then((data) => {
            const h1 = document.querySelector("h1");
            h1.innerHTML = data.name;
        });
};

let countryObject = getCountryByName("France");





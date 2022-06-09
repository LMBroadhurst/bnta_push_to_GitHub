const fetchPromise = fetch("https://catfact.ninja/breeds");
fetchPromise.then(response => {
 return response.json();
}).then(breed => {
 console.log(breed);
});
const myPromise = new Promise((resolve) => {
    setTimeout(() => {
     resolve(null); // Run the code, then replace the string with null
    }, 3000);
   });
   myPromise
    .then(value => { return value.toUpperCase(); })
    .then(value => { return `Hello, ${value}!`; })
    .then(value => { console.log(value) })
    .catch(err => { console.log("We have an issue!: " + err) });
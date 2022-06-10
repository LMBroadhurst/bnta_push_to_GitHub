
const loadData = async() => {
    const fetchResult = await fetch('https://opefntdb.com/api.php?amount=1&type=boolean');
    
    const json = await fetchResult.json();
    console.log(json);
}

loadData();
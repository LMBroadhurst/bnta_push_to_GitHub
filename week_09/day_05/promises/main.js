const doubleNumberAfter2Seconds = (number) => {
    return new Promise ((resolve, reject) => {
        setTimeout(() => {
            if (number % 2 === 0) {
                resolve(number * 2);
            } else {
                reject("number must be even");
            }
            
        }, 2000)
    })
}

const asyncPrinting = async (number) => {
    try {
        const result = await doubleNumberAfter2Seconds(number);
        console.log(`Result is: ${result}`);
    } catch (error) {
        console.error(error);
    }
    
}

// Await makes the function wait... until the previous line is completed before carrying on with the block of code

asyncPrinting(25);
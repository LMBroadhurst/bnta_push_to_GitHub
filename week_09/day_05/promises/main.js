const doubleNumberAfter2Seconds = (number) => {
    return new Promise ((resolve, reject) => {
        setTimeout(() => {
            resolve(number * 2)
        }, 2000)
    })
}

const asyncPrinting = async (number) => {
    const result = await doubleNumberAfter2Seconds(number);
    console.log(`Result is: ${result}`);
}

// Await makes the function wait... until the previous line is completed before carrying on with the block of code

asyncPrinting(5);
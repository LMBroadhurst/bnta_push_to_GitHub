function resizedImage() {
    /* 
        TODO change width and size of the element
    */

        const img = document.querySelector("img").style.width = "600px";
    
    
}

function defaultImage(el) {
    /* 
        TODO change width and size of the element
    */

        const img = document.querySelector("img").style.width = "300px";
}

const image = document.querySelector("img");

image.addEventListener('mouseenter', resizedImage());
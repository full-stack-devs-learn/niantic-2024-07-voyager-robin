let categoryId = 1;


document.addEventListener("DOMContentLoaded", () => {
    const category = document.getElementById("category");

    category.addEventListener("change", () => {
        categoryId = category.value;
        loadPage();

    })
    loadPage();

});

function loadPage()
{
    const container = document.getElementById("product-container");
    container.innerHTML = "";

    const url = `/products/category/${categoryId}`;

// asynchronous
    fetch(url).then(response => {
        if(response.status === 200)
        {
            return response.text();
        }
        throw new Error(response);
    }).then(data => {
        container.innerHTML = data;
    }).catch(error => {
        console.log(error)
    });
}
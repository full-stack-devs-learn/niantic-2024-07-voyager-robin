document.addEventListener("DOMContentLoaded", () => {

    const productForm = document.getElementById("addProductForm");
    const productName = document.getElementById("productName");
    const quantityPerUnit = document.getElementById("quantityPerUnit");
    const unitPrice = document.getElementById("unitPrice");
    const unitsInStock = document.getElementById("unitsInStock");
    const unitsOnOrder = document.getElementById("unitsOnOrder");
    const reorderLevel = document.getElementById("reorderLevel");


    productName.addEventListener("input", () => {
            productForm.classList.remove("was-validated");
    });
    quantityPerUnit.addEventListener("input", () => {
            productForm.classList.remove("was-validated");
    });
    unitPrice.addEventListener("input", () => {
            productForm.classList.remove("was-validated");
    });
    unitsInStock.addEventListener("input", () => {
            productForm.classList.remove("was-validated");
    });
    unitsOnOrder.addEventListener("input", () => {
            productForm.classList.remove("was-validated");
    });
    reorderLevel.addEventListener("input", () => {
            productForm.classList.remove("was-validated");
    });

    productForm.addEventListener("submit", (event) => {


        if(!productForm.checkValidity())
        {
            event.preventDefault();
            productForm.classList.add("was-validated");
        }
    })
});
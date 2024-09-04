let service;
let list = []

let allItemsIncomplete = true;


function displayListTitle() {
    const title = document.getElementById("title")
    title.textContent = service.getListName();
}


function displayShoppingList() {
    const parent = document.getElementById("shopping-list")

    list.forEach(item => {
        addListItem(item, parent);
    })
}

function addListItem(item, parent)
{
    const div = document.createElement("div")
    div.classList.add("list-item");
    if(item.isComplete)
    {
        div.classList.add("complete")
    }

    addItemTitle(item, div);
    addQuantity(item, div)

    div.addEventListener("click", () => {
        div.classList.add("complete");
    })
    div.addEventListener("dblclick", () => {
        div.classList.remove("complete");
    })

    parent.appendChild(div)
}

function addItemTitle(item, parent)
{
    const div = document.createElement("div")
    div.textContent = item.title;

    parent.appendChild(div);
}

function addQuantity(item, parent)
{
    const div = document.createElement("div");
    div.classList.add("quantity-container");

    const span = document.createElement("span");
    span.textContent = "quantity"
    span.classList.add("super");

    const text = document.createTextNode(item.quantity)

    div.appendChild(span)
    div.appendChild(text)

    parent.appendChild(div);
}

function submitItem(event)
{
    event.preventDefault();

    // create a new item object with name and quantity
    const itemName  = document.getElementById("itemName").value;
    const itemQuant = document.getElementById("quantity").value;
    const parent    = document.getElementById("shopping-list");

    const newItem = {
      title: itemName,
      quantity: itemQuant,
      isComplete: false
    }

    addListItem(newItem, parent);
    clearForm();
}

function clearForm()
{
document.getElementById("itemName").value = "";
document.getElementById("quantity").value = "";
}


function markCompleted() {
    const listItems = document.querySelectorAll(".list-item");

    listItems.forEach(item => {
        item.classList.add("complete");
    })
}

// create the page load event here

document.addEventListener("DOMContentLoaded", () => {
    service = new ShoppingService();
    list = service.getShoppingList();


    displayListTitle();
    displayShoppingList();


    // create functionality for the all-completed button:

   completeButton = document.getElementById("allCompleteButton");
   completeButton.addEventListener('click', () => {
        markCompleted()});

    // create functionality for adding an item:
    addButton = document.getElementById("addItemBtn");
    addButton.addEventListener('click', event => {
        submitItem(event)});


   
});


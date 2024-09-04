// add pageTitle
function displayPageTitle()
{
    newList = new ShoppingService;
    pageTitle = newList.getListName();
    document.title = pageTitle;
}
// add groceries

/**
 * This function will get a reference to the title and set its text to the value
 * of the pageTitle variable that was set above.
 */
function displayListTitle() {
    document.getElementById('title').innerHTML = pageTitle;
}

/**
 * This function will loop over the array of groceries that was set above and add them to the DOM.
 */
function displayGroceries()
{
    // get the list of all groceries
    const groceries = newList.getShoppingList();
    // get the parent container
    const groceryListContainer = document.getElementById("shopping-list");
    // create new div for grocery item
    groceries.forEach(item => {
        createGroceryItem(item, groceryListContainer);
    });
}

function createGroceryItem(child, parent)
{
    // Create the new divs and assign the correct classes:
    const listItemDiv = document.createElement("div");
    const itemDiv     = document.createElement("div");
    const quantityDiv = document.createElement("div");
    
    listItemDiv.classList.add("list-item")
    itemDiv.classList.add("shopping-list");
    quantityDiv.classList.add("quantity-container");


    itemDiv.textContent     = child.title;
    quantityDiv.textContent = child.quantity;

    parent.appendChild(listItemDiv)

    listItemDiv.appendChild(itemDiv);
    listItemDiv.appendChild(quantityDiv);
}

/**
 * This function will be called when the button is clicked. You will need to get a reference
 * to every list item and add the class completed to each one
 */
function markCompleted() {
}

displayPageTitle();
displayListTitle();
displayGroceries();


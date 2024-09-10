function displayPageTitle()
{
    newList = new ShoppingService;
    pageTitle = newList.getListName();
    document.title = pageTitle;
}

/*
 * This function will get a reference to the title and set its text to the value
 * of the pageTitle variable that was set above.
 */
function displayListTitle() {
    document.getElementById('title').innerHTML = pageTitle;
}

/*
 * This function will loop over the array of groceries that was set above and add them to the DOM.
 */
function displayGroceries()
{
    const groceries = newList.getShoppingList();
    const groceryListContainer = document.getElementById("shopping-list");
    groceries.forEach(item => 
    {
        createGroceryItem(item, groceryListContainer);
    });
}

function createGroceryItem(child, parent)
{
    const listItemDiv  = document.createElement("div");
    const itemDiv      = document.createElement("div");
    const quantityDiv  = document.createElement("div");
    const quantitySpan = document.createElement("span");
    
    listItemDiv.classList.add("list-item");
    itemDiv.classList.add("shopping-list");
    quantityDiv.classList.add("quantity-container");
    quantitySpan.classList.add("super");

    if (child.isComplete)
    {
        listItemDiv.classList.add("complete")
    }

    itemDiv.textContent      = child.title;
    quantitySpan.innerText = 'quantity';
    quantityDiv.textContent  = child.quantity;
   
    parent.appendChild(listItemDiv)

    listItemDiv.appendChild(itemDiv);
    listItemDiv.appendChild(quantityDiv);
    quantityDiv.appendChild(quantitySpan);
}

/*
 * This function will be called when the button is clicked. You will need to get a reference
 * to every list item and add the class completed to each one
 */
function markCompleted() 
{
    const listItems = document.querySelectorAll(".list-item");

    listItems.forEach(listItem => 
    {
        listItem.classList.add("complete");
    })
}

displayPageTitle();
displayListTitle();
displayGroceries();


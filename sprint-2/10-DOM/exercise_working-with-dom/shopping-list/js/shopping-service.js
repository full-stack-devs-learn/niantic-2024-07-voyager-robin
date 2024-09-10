class ShoppingService {

    getListName() 
    {
        return "Shopping List";
    }

    getShoppingList() {
        return [
            {
                id: 1,
                title: '5 lb sack of potatoes',
                quantity: 1,
                isComplete: true
            },
            {
                id: 2,
                title: 'Frozen Pizza',
                quantity: 4,
                isComplete: false
            },
            {
                id: 3,
                title: 'Bagels',
                quantity: 6,
                isComplete: true
            },
            {
                id: 4,
                title: 'Sourdough',
                quantity: 4,
                isComplete: false
            },
            {
                id: 5,
                title: 'Chickpeas',
                quantity: 5,
                isComplete: false
            },
            {
                id: 6,
                title: 'Thyme',
                quantity: 15,
                isComplete: false
            },
            {
                id: 7,
                title: 'Pasta',
                quantity: 5,
                isComplete: false
            },
            {
                id: 8,
                title: 'Tomatoes',
                quantity: 4,
                isComplete: false
            },
            {
                id: 9,
                title: 'Cherries',
                quantity: 4,
                isComplete: false
            },
            {
                id: 10,
                title: 'Orange Juice',
                quantity: 4,
                isComplete: false
            },
        ];
    }
}
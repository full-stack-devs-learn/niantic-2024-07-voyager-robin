package com.niantic.exercises;

import com.niantic.models.LineItem;

import java.util.ArrayList;
import java.util.List;

public class Filters
{

    /*
    1) using Java Stream functions, filter the *lineItems* list to include only line items for the given company name

    hint: the company name should not be required to be the full name, but could be a partial name
     */
    public List<LineItem> filterByCompanyName(List<LineItem> lineItems, String companyName)
    {
        var filteredItems = lineItems.stream()
                                     .filter(item -> item.getCompanyName().toLowerCase().contains(companyName.toLowerCase()))
                                     .toList();
        return filteredItems;
    }

    /*
    2) using Java Stream functions, filter the *lineItems* list to include only line items for the given category name

    hint: the user may search by only a partial category name
     */
    public List<LineItem> filterByCategory(List<LineItem> lineItems, String categoryName)
    {
        var filteredItems = lineItems.stream()
                .filter(item -> item.getCategoryName().toLowerCase().contains(categoryName.toLowerCase()))
                .toList();
        return filteredItems;
    }

    /*
    3) using Java Stream functions, filter the *lineItems* list to include only line items for the given product name

    hint: the user may search by only a partial product name
     */
    public List<LineItem> filterByProduct(List<LineItem> lineItems, String productName)
    {
        var filteredItems = lineItems.stream()
                .filter(item -> item.getProductName().toLowerCase().contains(productName.toLowerCase()))
                .toList();
        return filteredItems;
    }

    /*
    4) using Java Stream functions, filter the *lineItems* list to include only line items for the given order year

     */
    public List<LineItem> filterByYear(List<LineItem> lineItems, int year)
    {
        var filteredItems = lineItems.stream()
                .filter(item -> item.getOrderDate().getYear() == year)
                .toList();
        return filteredItems;
    }


    /*
    5) using Java Stream functions, filter the *lineItems* list to include only line items for the given order id

     */
    public List<LineItem> filterByOrderId(List<LineItem> lineItems, int orderId)
    {
        var filteredItems = lineItems.stream()
                .filter(item -> item.getOrderId() == orderId)
                .toList();
        return filteredItems;
    }
}

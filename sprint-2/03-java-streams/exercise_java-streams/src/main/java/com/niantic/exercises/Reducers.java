package com.niantic.exercises;

import com.niantic.models.LineItem;

import java.util.Comparator;
import java.util.List;

public class Reducers
{

    /*
    1) using one or more Java Stream functions calculate the total sales amount
       for all line items in the given list.

       hint: use the getLineTotal() method to calculate the sales total

     */
    public double totalSales(List<LineItem> lineItems)
    {
        double salesSum = lineItems.stream()
                                   .map(item -> item.getLineTotal())
                                   .reduce(0.0, (currentSum, nextItem)
                                           -> currentSum + nextItem);
        return salesSum;
    }

    /*
    2) using one or more Java Stream functions calculate the average sales amount
       per line items in the given list.

     */
    public double averageSalesPerLineItem(List<LineItem> lineItems)
    {
        double salesSum = lineItems.stream()
                                   .map(item -> item.getLineTotal())
                                   .reduce(0.0, (currentSum, nextItem)
                                           -> currentSum + nextItem);

        double salesAverage = salesSum / lineItems.size();

        return salesAverage;
    }

    /*
    3) using one or more Java Stream functions calculate the average sales amount
       per items in the given list.

       hint: unlike problem number 2, we are not looking for the average of line totals
       we are looking for the average of each item (line items can have multiple quantities
       of a single item)

     */
    public double averageSalesPerItem(List<LineItem> lineItems)
    {
        // Determine total sales:
        double salesSum = lineItems.stream()
                                    .map(item -> item.getLineTotal())
                                    .reduce(0.0, (currentSum, nextItem)
                                            -> currentSum + nextItem);

        // Determine total number of items:
        int itemsQuantity = lineItems.stream()
                                .map(item -> item.getQuantity())
                                .reduce(0, (currentSum, nextItem)
                                        -> currentSum + nextItem);

        double salesAverage = salesSum / itemsQuantity;

        return salesAverage;
    }

    /*
    4) using one or more Java Stream functions calculate the total number
       of items that were purchased.

       hint: line items can have multiple quantities of an item

     */
    public int totalItemCount(List<LineItem> lineItems)
    {
        int itemsQuantity = lineItems.stream()
                                     .map(item -> item.getQuantity())
                                     .reduce(0, (currentSum, nextItem)
                                             -> currentSum + nextItem);
        return itemsQuantity;
    }

    /*
    5) using one or more Java Stream functions calculate the average number
       of items that were purchased per line item.

     */
    public double averageItemCount(List<LineItem> lineItems)
    {
        // Determine total number of items:
        double itemsQuantity = lineItems.stream()
                                        .map(item -> item.getQuantity())
                                        .reduce(0, (currentSum, nextItem)
                                                -> currentSum + nextItem);

        double itemsAverage = itemsQuantity / lineItems.size();

        return itemsAverage;
    }

    /*
    6) using one or more Java Stream functions find the most expensive line item.

     */
    public double maxLineItem(List<LineItem> lineItems)
    {
        double maxPrice = lineItems.stream()
                                   .map(item -> item.getLineTotal())
                                   .max(Double::compare).get();
        return maxPrice;
    }

    /*
    7) using one or more Java Stream functions find the least expensive line item.

        hint: the least expensive line item is not $0.00

     */
    public double minLineItem(List<LineItem> lineItems)
    {
        double minPrice = lineItems.stream()
                                   .map(item -> item.getLineTotal())
                                   .min(Double::compare).get();

        return minPrice;
    }

}

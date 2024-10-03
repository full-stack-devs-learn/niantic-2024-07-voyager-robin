package com.niantic.models;

public class Product
{
    private int     productId;
    private String  productName;
    private int     supplierId;
    private int     categoryId;
    private String  quantityPerUnit;
    private double  unitPrice;
    private int     unitsInStock;
    private int     unitsOnOrder;
    private int     reorderLevel;
    private boolean discontinued;

    public Product()
    {}

    public Product(boolean discontinued, int reorderLevel, int unitsOnOrder, int unitsInStock,
                   double unitPrice, String quantityPerUnit, int categoryId, int supplierId,
                   String productName, int productId)
    {
        this.discontinued    = discontinued;
        this.reorderLevel    = reorderLevel;
        this.unitsOnOrder    = unitsOnOrder;
        this.unitsInStock    = unitsInStock;
        this.unitPrice       = unitPrice;
        this.quantityPerUnit = quantityPerUnit;
        this.categoryId      = categoryId;
        this.supplierId      = supplierId;
        this.productName     = productName;
        this.productId       = productId;
    }

    public int getProductId()
    {
        return productId;
    }

    public void setProductId(int productId)
    {
        this.productId = productId;
    }

    public String getProductName()
    {
        return productName;
    }

    public void setProductName(String productName)
    {
        this.productName = productName;
    }

    public int getSupplierId()
    {
        return supplierId;
    }

    public void setSupplierId(int supplierId)
    {
        this.supplierId = supplierId;
    }

    public int getCategoryId()
    {
        return categoryId;
    }

    public void setCategoryId(int categoryId)
    {
        this.categoryId = categoryId;
    }

    public String getQuantityPerUnit()
    {
        return quantityPerUnit;
    }

    public void setQuantityPerUnit(String quantityPerUnit)
    {
        this.quantityPerUnit = quantityPerUnit;
    }

    public double getUnitPrice()
    {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice)
    {
        this.unitPrice = unitPrice;
    }

    public int getUnitsInStock()
    {
        return unitsInStock;
    }

    public void setUnitsInStock(int unitsInStock)
    {
        this.unitsInStock = unitsInStock;
    }

    public int getUnitsOnOrder()
    {
        return unitsOnOrder;
    }

    public void setUnitsOnOrder(int unitsOnOrder)
    {
        this.unitsOnOrder = unitsOnOrder;
    }

    public int getReorderLevel()
    {
        return reorderLevel;
    }

    public void setReorderLevel(int reorderLevel)
    {
        this.reorderLevel = reorderLevel;
    }

    public boolean isDiscontinued()
    {
        return discontinued;
    }

    public void setDiscontinued(boolean discontinued)
    {
        this.discontinued = discontinued;
    }
}

package Exam_2;

import java.util.ArrayList;

public class ShoppingCart
{
    private ArrayList<Product> products;

    public ShoppingCart()
    {
        products = new ArrayList<Product>();
    }

    // Method to add product to the shopping cart
    public void addProduct(Product product)
    {
        products.add(product);
    }

    // Method to get all products in the shopping cart
    public ArrayList<Product> getProducts()
    {
        return products;
    }
}

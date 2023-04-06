package Exam_2;
public class Product {
    private String name;
    private float price;
    private int quantity;

    public Product(String name, float price, int quantity)
    {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Getter methods
    public String getName()
    {
        return name;
    }

    public float getPrice()
    {
        return price;
    }

    public int getQuantity()
    {
        return quantity;
    }

    // Setter methods
    public void setName(String name)
    {
        this.name = name;
    }

    public void setPrice(float price)
    {
        this.price = price;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    // toString method
    public String toString() {
        return "Name: " + name + "\nPrice: $" + price + "\nQuantity: " + quantity;
    }
}




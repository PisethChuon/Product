package Exam_2;

import Exam_2.Product;

public class Electronics extends Product {
    private String manufacturer;

    public Electronics(String name, float price, int quantity, String manufacturer)
    {
        super(name, price, quantity);
        this.manufacturer = manufacturer;
    }

    // Getter and setter methods for manufacturer
    public String getManufacturer()
    {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer)
    {
        this.manufacturer = manufacturer;
    }

    // toString method
    public String toString() {
        return super.toString() + "\nManufacturer: " + manufacturer;
    }
}


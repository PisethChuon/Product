package Exam_2;

import Exam_2.Product;
import Exam_2.Shipping;

import java.util.ArrayList;

public class Book implements Shipping {
    @Override
    public float calculateShipping() {
        float shippingCost = weight * pricePerPound;
        return shippingCost;
    }

    private float weight;
    private float pricePerPound;

    public Book(float weight, float pricePerPound)
    {
        this.weight = weight;
        this.pricePerPound = pricePerPound;
    }

    // Getter and setter methods for weight and pricePerPound
    public float getWeight()
    {
        return weight;
    }

    public void setWeight(float weight)
    {
        this.weight = weight;
    }

    public float getPricePerPound()
    {
        return pricePerPound;
    }

    public void setPricePerPound(float pricePerPound)
    {
        this.pricePerPound = pricePerPound;
    }

    // Implementing calculateShipping method from Shipping interface
    public float calculateShipping(float weight)
    {
        return weight * pricePerPound;
    }
}


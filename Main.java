package Exam_2;

public class Main {
    public static void main(String[] args)
    {
        Product product = new Product("Phone",200f,1);
        Book book = new Book(1.5F,2);
        Electronics electronics = new Electronics("MacBook",2.0F,1,"FE");
        System.out.println(product.toString());
        System.out.println(book.calculateShipping());
        System.out.println(electronics.toString());
    }
}

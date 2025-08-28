package Generics.LambdaExpression;


import java.util.*;

class Product {
    String name; double price; double rating; double discount;
    Product(String n, double p, double r, double d){ name=n; price=p; rating=r; discount=d; }
    public String toString(){ return name+" - Price:"+price+" Rating:"+rating+" Discount:"+discount; }
}

class ProductSorting {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Laptop",50000,4.5,10),
            new Product("Phone",30000,4.7,20),
            new Product("Tablet",20000,4.3,15)
        );

        System.out.println("Sort by Price:");
        products.stream().sorted((a,b)->Double.compare(a.price,b.price)).forEach(System.out::println);

        System.out.println("Sort by Rating:");
        products.stream().sorted((a,b)->Double.compare(b.rating,a.rating)).forEach(System.out::println);

        System.out.println("Sort by Discount:");
        products.stream().sorted((a,b)->Double.compare(b.discount,a.discount)).forEach(System.out::println);
    }
}

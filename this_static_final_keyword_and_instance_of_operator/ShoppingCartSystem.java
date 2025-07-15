package OOPS.this_static_final_keyword_and_instance_of_operator;

class Product {
    static double discount = 10.0; // in percentage

    final int productID;
    String productName;
    double price;
    int quantity;

    Product(String productName, int productID, double price, int quantity) {
        this.productName = productName;
        this.productID = productID;
        this.price = price;
        this.quantity = quantity;
    }

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    void printDetails() {
        if (this instanceof Product) {
            System.out.println("Product Name: " + productName);
            System.out.println("Product ID: " + productID);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
        }
    }
}

public class ShoppingCartSystem {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 201, 50000, 2);
        Product p2 = new Product("Phone", 202, 25000, 1);

        p1.printDetails();
        System.out.println();
        Product.updateDiscount(15.0);
        p2.printDetails();
    }
}

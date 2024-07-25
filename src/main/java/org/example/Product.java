package org.example;

public class Product {
    private String productName;
    private double productPrice;
    private int productQuantity;

    public Product(String productName, double productPrice, int productQuantity) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
    }

    public void printProduct(int quantity) {
        if (this.productQuantity >= quantity) {
            System.out.println(this.productName + " costs " + this.productPrice + " and " + this.productQuantity +
                    " units were purchased");
        } else {
            System.out.println("Product " + this.productName + " does not have enough quantity");
        }
    }

    public void totalCost(int quantity) {
        if (this.productQuantity >= quantity) {
            double totalCost = this.productPrice * quantity;
            System.out.println("The total cost is " + String.format("%.2f", totalCost));
        } else {
            System.out.println("Product " + this.productName + " does not have enough quantity");
        }
    }


}

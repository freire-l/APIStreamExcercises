

package org.luisf.streamSum;

public class Product {
    private int quantity;
    private Double price;

    public Product(int quantity, double price) {
        this.quantity = quantity;
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}

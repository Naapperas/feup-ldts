package pt.up.fe.ldts.example3;

public class SimpleOrder {
    private Discount discount = new Discount();
    private double price;

    public SimpleOrder(double price) {
        this.price = price;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public double getTotal() {
        return discount.applyDiscount(price);
    }
}

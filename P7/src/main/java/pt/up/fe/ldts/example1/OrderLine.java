package pt.up.fe.ldts.example1;

public class OrderLine {
    private Product product;
    private int quantity;

    public OrderLine(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return this.product;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public double getTotal() {
        return this.getQuantity() * this.getProduct().getPrice();
    }

    @Override
    public String toString() {
        return this.getProduct().getName() + "(x" + this.getQuantity() + "): " + this.getTotal() + "\n";
    }
}

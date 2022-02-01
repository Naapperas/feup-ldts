package pt.up.fe.ldts.example3;

public class PercentageDiscount extends Discount {

    private double percentage;

    public PercentageDiscount(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public double applyDiscount(double price) {
        return price * (1-percentage);
    }
}

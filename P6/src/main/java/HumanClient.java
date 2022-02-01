public class HumanClient implements Client {

    private final OrderingStrategy os;

    public HumanClient(OrderingStrategy os) {
        this.os = os;
    }

    @Override
    public void happyHourStarted(Bar bar) {
        os.happyHourStarted((StringBar) bar);
    }

    @Override
    public void happyHourEnded(Bar bar) {
        os.happyHourEnded((StringBar) bar);
    }

    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        os.wants(drink, recipe, bar);
    }
}

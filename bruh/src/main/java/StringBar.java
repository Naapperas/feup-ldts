public class StringBar extends Bar {

    @Override
    public boolean isHappyHour() {
        return this.happyHourStarted;
    }

    @Override
    public void startHappyHour() {
        this.happyHourStarted = true;
        this.notifyObservers();
    }

    @Override
    public void endHappyHour() {
        this.happyHourStarted = false;
        this.notifyObservers();
    }

    public void order(StringDrink drink, StringRecipe recipe) {
        recipe.mix(drink);
    };
}

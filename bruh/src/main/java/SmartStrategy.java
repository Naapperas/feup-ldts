import java.util.ArrayList;
import java.util.List;

public class SmartStrategy implements OrderingStrategy {

    private List<StringDrink> drinks = new ArrayList<>();
    private List<StringRecipe> drinkRecipes = new ArrayList<>();

    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        if (bar.isHappyHour())
            bar.order(drink, recipe);
        else {
            drinks.add(drink);
            drinkRecipes.add(recipe);
        }
    }

    @Override
    public void happyHourStarted(StringBar bar) {
        assert drinkRecipes.size() == drinks.size();
        for (int i = 0; i < drinks.size(); ++i) {
            var drink = this.drinks.get(i);
            var drinkRecipe = this.drinkRecipes.get(i);

            bar.order(drink, drinkRecipe);
        }
    }

    @Override
    public void happyHourEnded(StringBar bar) {
    }
}

public class StringInverter implements StringTransformer {

    @Override
    public void execute(StringDrink drink) {
        StringBuilder sb = new StringBuilder(drink.getText());

        drink.setText(sb.reverse().toString());
    }
}

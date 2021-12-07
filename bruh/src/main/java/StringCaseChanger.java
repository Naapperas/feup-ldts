public class StringCaseChanger implements StringTransformer {

    @Override
    public void execute(StringDrink drink) {
        var text = drink.getText();
        var sb = new StringBuilder();
        for (int i = 0; i < drink.getText().length(); ++i) {
            var c = text.charAt(i);
            if (Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(Character.toLowerCase(c));
            }
        }
        drink.setText(sb.toString());
    }
}

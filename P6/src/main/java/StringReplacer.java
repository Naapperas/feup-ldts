public class StringReplacer implements StringTransformer {

    private final char replaced, replacement;

    public StringReplacer(char replaced, char replacement) {
        this.replaced = replaced;
        this.replacement = replacement;
    }

    @Override
    public void execute(StringDrink drink) {
        var sb = new StringBuilder();

        var text = drink.getText();

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == replaced) sb.append(replacement);
            else sb.append(text.charAt(i));
        }

        drink.setText(sb.toString());
    }

    @Override
    public void undo(StringDrink drink) {

        var sr = new StringReplacer(replacement, replaced);
        sr.execute(drink);

    }
}

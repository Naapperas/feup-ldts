import java.util.List;

public class StringTransformerGroup implements StringTransformer {

    private final List<StringTransformer> transformers;

    public StringTransformerGroup(List<StringTransformer> transformerList) {
        this.transformers = transformerList;
    }

    @Override
    public void execute(StringDrink drink) {
        for (var transformer : this.transformers)
            transformer.execute(drink);
    }

    @Override
    public void undo(StringDrink drink) {
        for (var transformer : this.transformers)
            transformer.undo(drink);
    }
}

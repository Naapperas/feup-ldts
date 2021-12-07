public interface StringTransformer {

    void execute(StringDrink drink);
    default void undo(StringDrink drink) {
        this.execute(drink);
    };
}

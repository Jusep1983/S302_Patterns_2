package level1.model.enums;

public enum PizzaTopping {
    MOZZARELLA("Soft creamy Italian cheese"),
    PEPPERONI("Spicy Italian sausage slices"),
    PROSCIUTTO("Thin Italian dry-cured ham"),
    TOMATO_SAUCE("Homemade tomato sauce"),
    MUSHROOMS("Sliced fresh mushrooms"),
    PINEAPPLE("Sweet pineapple chunks"),
    VEGAN_CHEESE("Plant-based mozzarella-style cheese"),
    EGGPLANT("Oven-roasted eggplant slices"),
    TOFU_CRUMBLE("Seasoned tofu as meat substitute"),
    BLACK_OLIVES("Kalamata olives sliced"),
    ROASTED_RED_PEPPERS("Fire-roasted red pepper strips"),
    GREEN_PESTO("Green pesto");

    private final String description;

    PizzaTopping(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "\n\t" + this.description;
    }

}

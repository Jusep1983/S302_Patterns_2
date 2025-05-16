package level1.model.enums;

public enum PizzaDough {
    THIN_DOUGH("thin dough"),
    THICK_DOUGH("thick dough"),
    CLASSIC_DOUGH("classic dough");

    private final String description;

    PizzaDough(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}

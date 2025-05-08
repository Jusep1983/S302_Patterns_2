package level1.model.enums;

public enum PizzaDough {
    THIN_DOUGH("Thin and crispy crust, Italian-style"),
    THICK_DOUGH("Thick and chewy deep-dish style"),
    CLASSIC_DOUGH("Traditional hand-tossed dough");

    private final String description;

    PizzaDough(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}

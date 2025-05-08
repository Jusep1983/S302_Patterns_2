package level1.model.enums;

public enum PizzaSize {
    SMALL("20cm"),
    MEDIUM("30cm"),
    LARGE("40cm");

    private final String cm;

    PizzaSize(String cm) {
        this.cm = cm;
    }

    public String getCm() {
        return cm;
    }

}

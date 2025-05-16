package level1.model.enums;

public enum PizzaSize {
    SMALL("small"),
    MEDIUM("medium"),
    LARGE("large");

    private final String size;

    PizzaSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

}

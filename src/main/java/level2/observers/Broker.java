package level2.observers;

/**
 * This interface represents the abstract observer within the pattern
 */
public interface Broker {
    String getName();
    void update(String indexName, double lastValue, double percentageChange);

}

package level2.subjects;

import level2.observers.Broker;

/**
 * This interface represents the abstract subject within the pattern
 */
public interface StockExchange {
    void addBroker (Broker broker);
    void removeBroker(Broker broker);
    void notifyBrokers(String indexName, double lastValue,double percentageChange);
}

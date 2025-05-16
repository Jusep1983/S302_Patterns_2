package level2.subjects;

import level2.observers.Broker;
import level2.utils.ChangeSymbolFormatter;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete subject in the Observer pattern.
 * Manages a list of brokers and notifies them of index updates.
 */
public class ConcreteStockExchange implements StockExchange {
    String name;
    List<Broker> brokers;

    public ConcreteStockExchange(String name) {
        this.name = name;
        this.brokers = new ArrayList<>();
    }

    @Override
    public void addBroker(Broker broker) {
        this.brokers.add(broker);
        System.out.println("Subscribe " + broker.getName() + " to " + this.name + " real-time alerts\n");
    }

    @Override
    public void removeBroker(Broker broker) {
        this.brokers.remove(broker);
        System.out.println("Unsubscribe " + broker.getName() + " from " + this.name + " real-time alerts\n");
    }

    @Override
    public void notifyBrokers(String indexName, double lastValue, double percentageChange) {
        System.out.println(indexName + " updated to " + lastValue
                           + " (" + ChangeSymbolFormatter.changeSymbol(percentageChange) + percentageChange + "%)\n"
        );
        //this.brokers.forEach(broker ->broker.update(indexName, lastValue, percentageChange));
        for (Broker broker : this.brokers) {
            broker.update(indexName, lastValue, percentageChange);
        }
    }

}

package level2;

import level2.observers.ConcreteBroker;
import level2.subjects.ConcreteStockExchange;

/**
 * Demonstrates the Observer pattern using brokers and stock exchanges.
 */
public class Main {

    public static void main(String[] args) {

        ConcreteStockExchange wallStreet = new ConcreteStockExchange("Wall Street");
        ConcreteBroker brokerJohn = new ConcreteBroker("John Wick");
        ConcreteBroker brokerMarie = new ConcreteBroker("Marie Jane");

        wallStreet.addBroker(brokerJohn);
        wallStreet.addBroker(brokerMarie);

        wallStreet.notifyBrokers("S&P 500", 5354.22, -3.22);

        wallStreet.removeBroker(brokerMarie);

        wallStreet.notifyBrokers("NASDAQ", 4988.75, +5.37);

    }
}

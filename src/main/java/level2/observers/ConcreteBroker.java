package level2.observers;

import level2.utils.ChangeSymbolFormatter;

/**
 * Concrete implementation of Broker.
 * Receives and displays updates from a stock exchange.
 */
public class ConcreteBroker implements Broker {
    private final String name;

    public ConcreteBroker(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void update(String indexName, double lastValue, double percentageChange) {
        System.out.println(this.name + " has received an update:" + "\n\t" + indexName + ": " + lastValue + " %Chg: "
                           + ChangeSymbolFormatter.changeSymbol(percentageChange) + percentageChange + "%"
        );
    }

}

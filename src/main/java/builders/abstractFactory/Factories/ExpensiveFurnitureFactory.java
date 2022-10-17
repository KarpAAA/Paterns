package builders.abstractFactory.Factories;

import builders.abstractFactory.Furniture.*;

public class ExpensiveFurnitureFactory extends AbstractFactory{
    @Override
    public Chair createChair() {
        return new ExpensiveChair();
    }

    @Override
    public Table createTable() {
        return new ExpensiveTable();
    }
}

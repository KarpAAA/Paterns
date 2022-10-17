package builders.abstractFactory.Factories;

import builders.abstractFactory.Furniture.Chair;
import builders.abstractFactory.Furniture.Table;

public abstract class AbstractFactory {
    public abstract Chair createChair();
    public abstract Table createTable();
}

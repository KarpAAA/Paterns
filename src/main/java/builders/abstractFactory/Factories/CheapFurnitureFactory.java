package builders.abstractFactory.Factories;

import builders.abstractFactory.Furniture.Chair;
import builders.abstractFactory.Furniture.CheapChair;
import builders.abstractFactory.Furniture.CheapTable;
import builders.abstractFactory.Furniture.Table;

public class CheapFurnitureFactory extends AbstractFactory{
    @Override
    public Chair createChair() {
        return new CheapChair();
    }

    @Override
    public Table createTable() {
        return new CheapTable();
    }
}

package builders.abstractFactory;

import builders.abstractFactory.Factories.AbstractFactory;

import builders.abstractFactory.Factories.ExpensiveFurnitureFactory;
import builders.abstractFactory.Furniture.Chair;
import builders.abstractFactory.Furniture.Table;

public class AbstractFactoryMain {
    static AbstractFactory factory;
    public static void main(String[] args) {
        createFactory();
        Chair chair = factory.createChair();
        Table table = factory.createTable();

        chair.sitOn();
        chair.myPrice();

        System.out.println("");

        table.sitAt();
        table.myPrice();
    }
    private static void createFactory(){
        //conditional creation of factory
        //factory = new CheapFurnitureFactory();
        factory = new ExpensiveFurnitureFactory();
    }
}

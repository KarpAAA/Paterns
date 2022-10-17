package builders.abstractFactory.Furniture;

public class ExpensiveTable extends Table{
    @Override
    public void sitAt() {
        System.out.println("Tou sit at expensive table");
    }

    @Override
    public void myPrice() {
        System.out.println("My price is 255$");
    }
}

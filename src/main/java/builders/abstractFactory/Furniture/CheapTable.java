package builders.abstractFactory.Furniture;

public class CheapTable extends Table{
    @Override
    public void sitAt() {
        System.out.println("Tou sit at cheap table");
    }

    @Override
    public void myPrice() {
        System.out.println("My price is 25$");
    }
}

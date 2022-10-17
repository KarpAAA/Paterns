package builders.abstractFactory.Furniture;

public class ExpensiveChair extends Chair{
    @Override
    public void sitOn() {
        System.out.println("Tou sit on expensive chair");
    }

    @Override
    public void myPrice() {
        System.out.println("Im a cheap my price is 100$");
    }

}

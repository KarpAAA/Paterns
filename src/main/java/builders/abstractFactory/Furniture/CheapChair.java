package builders.abstractFactory.Furniture;

public class CheapChair extends Chair{
    @Override
    public void sitOn() {
        System.out.println("Tou sit on cheap chair");
    }

    @Override
    public void myPrice() {
        System.out.println("Im a cheap my price is 10$");
    }
}

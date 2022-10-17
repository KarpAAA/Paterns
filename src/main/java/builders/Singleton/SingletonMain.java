package builders.Singleton;

public class SingletonMain {
    public static void main(String[] args) {
        Database db = Database.getInstance();
        db = Database.getInstance();
        db = Database.getInstance();
        db = Database.getInstance();
    }
}

package builders.Singleton;

public class Database {
    private static  Database INSTANCE;
    public static int counter = 0;
    private Database(){}

    public static synchronized Database getInstance(){
        if(INSTANCE == null){
            INSTANCE = new Database();
            counter++;
        }
        System.out.println("Im an instance number" + counter);
        return INSTANCE;
    }
}

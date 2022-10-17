package builders.Builder;

public class StBuilder {
    String string;

    public StBuilder(){
        string = "";
    }
    public StBuilder append(String str){
        string+=str;
        return this;
    }

}

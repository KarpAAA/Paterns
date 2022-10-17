package builders.factoryMethod;


import builders.factoryMethod.Buttons.ButtonClass;
import builders.factoryMethod.Fabriks.Fabrik;
import builders.factoryMethod.Fabriks.HtmlFabrik;

public class FactoryMethod {
    static Fabrik fabrik;

    public static void main(String[] args) {
        chooseFabrik();
        ButtonClass b = fabrik.createButton();
        b.onClick();
    }

    private static void chooseFabrik(){
        //fabrik = new CommonFabrik();
        fabrik = new HtmlFabrik();
    }

}

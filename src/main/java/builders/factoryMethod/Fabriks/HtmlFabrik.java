package builders.factoryMethod.Fabriks;


import builders.factoryMethod.Buttons.ButtonClass;
import builders.factoryMethod.Buttons.HtmlButton;

public class HtmlFabrik extends Fabrik{
    @Override
    public  ButtonClass createButton() {
        return new HtmlButton();
    }
}
package builders.factoryMethod.Fabriks;

import builders.factoryMethod.Buttons.ButtonClass;
import builders.factoryMethod.Buttons.CommonButton;

public class CommonFabrik extends Fabrik{
    @Override
    public ButtonClass createButton() {
        return new CommonButton();
    }
}

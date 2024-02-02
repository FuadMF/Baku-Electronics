package StepDefinitions;

import Pom.FavoritlerPom;

public class FavoritlerSteps extends BaseMethods{

    FavoritlerPom favoritlerPom;

    public FavoritlerSteps(){
        favoritlerPom = FavoritlerPom.getInstance();
    }
}

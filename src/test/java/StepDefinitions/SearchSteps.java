package StepDefinitions;

import Pom.SearchPom;

public class SearchSteps extends BaseMethods{

    SearchPom searchPom;

    public SearchSteps(){
        searchPom = SearchPom.getInstance();
    }
}

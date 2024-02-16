package StepDefinitions;

import Pom.MagazalarPom;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class MagazalarSteps extends BaseMethods{

    MagazalarPom magazalarPom;

    public MagazalarSteps(){
        magazalarPom = MagazalarPom.getInstance();
    }


    @When("Click Magazalar button")
    public void clickMagazalarButton() {
        getElement(magazalarPom.getMagazalar()).click();
    }

    @Then("User should be navigated to the Magazalar page")
    public void userShouldBeNavigatedToTheMagazalarPage() {
        WebElement element =getElement(magazalarPom.getMagazalarNavigate());
        Assert.assertTrue(element.isDisplayed());
    }

    @Then("User should see Branches  list in Baku")
    public void userShouldSeeBranchesListInBaku() {
        String actual = getElement(magazalarPom.getMagazalarlist()).getText();
        String expectedText = "20 Yanvar filialı (Bravo hiрermarket)";
        Assert.assertEquals(actual,expectedText);
    }
}


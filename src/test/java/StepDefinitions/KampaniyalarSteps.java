package StepDefinitions;

import Pom.KampaniyalarPom;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class KampaniyalarSteps extends BaseMethods{
    KampaniyalarPom kampaniyalarPom;

    public KampaniyalarSteps(){
        kampaniyalarPom = KampaniyalarPom.getInstance();
    }



    @When("Click to Kampaniyalar button")
    public void clickToKampaniyalarButton() {
        getElement(kampaniyalarPom.getKampaniyalar()).click();
    }

    @Then("User should be navigated to the Kampaniyalar page")
    public void userShouldBeNavigatedToTheKampaniyalarPage() {
        String actualText = getElement(kampaniyalarPom.getNavigateKampaniya()).getText();
        String expectedText = "Kampaniyalar";
        Assert.assertEquals(actualText,expectedText);
    }

    @And("Click to Endirim filter")
    public void clickToEndirimFilter() {
        getElement(kampaniyalarPom.getEndirim()).click();

    }

    @Then("User should see Endirim items on the page")
    public void userShouldSeeEndirimItemsOnThePage() {
        List<WebElement> elements = getElements(kampaniyalarPom.getItems());
        boolean flag = false;
        for (WebElement element:elements) {
            if (element.getText().contains("Endirim")) {
                flag = true;
            }
        }
        Assert.assertTrue(flag);
    }

    @And("Click to Hədiyyə filter")
    public void clickToHədiyyəFilter() {
        getElement(kampaniyalarPom.getHediyye()).click();
    }

    @Then("User should see Hədiyyə items on the page")
    public void userShouldSeeHədiyyəItemsOnThePage() {
        List<WebElement> elements =getElements(kampaniyalarPom.getItems());
        boolean flag = false;
        for (WebElement element:elements) {
            if (element.getText().contains("Hədiyyə")) {
                flag = true;
            }
        }
        Assert.assertTrue(flag);
    }

    @And("Click to Nisyə alış filter")
    public void clickToNisyəAlısFilter() {
        getElement(kampaniyalarPom.getNisyeAlis()).click();
    }

    @Then("User should see Nisyə alış items on the page")
    public void userShouldSeeNisyəAlısItemsOnThePage() {
        List<WebElement>elements = getElements(kampaniyalarPom.getItems());
        boolean flag = false;
        for (WebElement element:elements) {
            if (element.getText().contains("Nisyə alış")) {
                flag = true;
            }
        }
        Assert.assertTrue(flag);
    }
}

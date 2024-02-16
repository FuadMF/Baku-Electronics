package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.List;

public class BaseSteps extends BaseMethods{
    @Given("User is in {string} page")
    public void userWantTo(String arg0)  {
    }
    @And("User click popup")
    public void userClickPopup() {
        try {
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            executor.executeScript("arguments[0].click();", getElement(By.className("seg-popup-close")));
        }catch (Exception e) {

        }


    }
    @When("Move to Telefonlar,plansetler ve qadcetler element")
    public void moveToTelefonlarPlansetlerVeQadcetlerElement() {
        WebElement element = driver.findElement(By.linkText("Telefonlar, planşetlər və qadcetlər"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }

    @And("Click to Smartfonlar,mobil telefonlar button")
    public void clickToSmartfonlarMobilTelefonlarButton() {
        driver.findElement(By.linkText("Smartfonlar, mobil telefonlar")).click();
    }


}

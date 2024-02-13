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
        driver.findElement(By.linkText("Mağazalar")).click();
    }

    @Then("User should be navigated to the Magazalar page")
    public void userShouldBeNavigatedToTheMagazalarPage() {
        WebElement element = driver.findElement(By.className("static-header__title"));
        Assert.assertTrue(element.isDisplayed());
    }

    @Then("User should see Branches  list in Baku")
    public void userShouldSeeBranchesListInBaku() {
        String actual = driver.findElement(By.xpath("//*[@class = 'static-text']/div[1]/div[2]/div[1]/h3[1]/button[1]")).getText();
        String expectedText = "20 Yanvar filialı (Bravo hiрermarket)";
        Assert.assertEquals(actual,expectedText);
    }
}


package StepDefinitions;

import Pom.AlisVerisSebetiPom;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class AlisVerisSebetiSteps extends BaseMethods{
    AlisVerisSebetiPom alisVerisSebetiPom;


    public AlisVerisSebetiSteps(){
        alisVerisSebetiPom = AlisVerisSebetiPom.getInstance();
    }

    @When("Click to alis veris sebeti button")
    public void clickToAlisVerisSebetiButton() {
        getElement(alisVerisSebetiPom.getAlisVerisSebetiBtn()).click();
    }


    @Then("User should be navigated to alis veris sebeti page")
    public void userShouldBeNavigatedToAlisVerisSebetiPage() {
        WebElement element = getElement(alisVerisSebetiPom.getSebetinizBosdurElem());
        String actual = element.getText();
        String expected = "Səbətiniz boşdur";
        Assert.assertEquals(actual,expected);
    }


    @When("Click to almaq button for four elements")
    public void clickToAlmaqButtonForFourElements() throws InterruptedException {
        Thread.sleep(5000);
        List<WebElement> elements = getElements(alisVerisSebetiPom.getAlmaqBtn());
        int expected = 4;
        for (int i = 0;i<expected;i++){
            elements.get(i).click();
        }
    }

    @Then("Alis veris sebeti should be matched with added elements")
    public void alisVerisSebetiShouldBeMatchedWithAddedElements() throws InterruptedException {
        Thread.sleep(3000);
        WebElement element = getElement(alisVerisSebetiPom.getCartTotalCountElem());
        String s = element.getText();
        int actual = Integer.parseInt(s);
        int expected = 4;
        Assert.assertEquals(actual,expected);
    }


    @And("Click minus button for two of them")
    public void clickMinusButtonForTwoOfThem() {
        List<WebElement> elements = getElements(alisVerisSebetiPom.getMinusBtn());
        int expected = 2;
        for (int i = 0;i<expected;i++){
            elements.get(i).click();
        }
    }

    @Then("Alis veris sebeti should be decreased")
    public void alisVerisSebetiShouldBeDecreased() throws InterruptedException {
        Thread.sleep(3000);
        int expected = 4-2;
        WebElement element = getElement(alisVerisSebetiPom.getCartTotalCountElem());
        String s = element.getText();
        int actual = Integer.parseInt(s);
        Assert.assertEquals(actual,expected);
    }

    @When("Click to any element")
    public void clickToAnyElement() {
        List<WebElement> elements = getElements(alisVerisSebetiPom.getProductsLoc());
        int expected = 1;
        for (int i = 0;i<expected;i++){
            elements.get(i).click();
        }
    }

    @Then("User should see that item on the Alis veris sebeti page")
    public void userShouldSeeThatItemOnTheAlisVerisSebetiPage() {
        WebElement element = getElement(alisVerisSebetiPom.getOrderLoc());
        String actual = element.getText();
        String expected = "Smartfon";
        Assert.assertTrue(actual.contains(expected));
    }


    @And("Click minus button")
    public void clickMinusButton() throws InterruptedException {
        getElement(alisVerisSebetiPom.getMinusBtn()).click();
    }


    @Then("Item should be deleted from the alis veris sebeti")
    public void itemShouldBeDeletedFromTheAlisVerisSebeti() throws InterruptedException {
        Thread.sleep(3000);
        List<WebElement> elements = getElements(alisVerisSebetiPom.getOrderLoc());
        Assert.assertTrue(elements.isEmpty());
    }


}

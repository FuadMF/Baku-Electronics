package StepDefinitions;

import Pom.SearchPom;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SearchSteps extends BaseMethods{

    SearchPom searchPom;

    public SearchSteps(){
        searchPom = SearchPom.getInstance();
    }

    @When("User clicks search input")
    public void UserClicksSearchInput() throws InterruptedException {
        Thread.sleep(2000);
      getElement(searchPom.getSearchInput()).click();
    }

    @And("User hover {string} category")
    public void userHoverCategory(String text) throws InterruptedException {
        Thread.sleep(2000);
        Actions actions = new Actions(driver);
        List<WebElement> elements = getElements(searchPom.getHover());
        for(WebElement element: elements){
          if(element.getText().equals(text)){
              actions.moveToElement(element).perform();
          }
        }
    }

    @Then("User should see {string} product on the right side")
    public void userShouldSeeProductOnTheRightSide(String text) throws InterruptedException {
        Thread.sleep(2000);
        List<WebElement> product =  getElements(searchPom.getProductSmallWindow());
        boolean flag = false;
        for(WebElement element: product){
            System.out.println(element.getText());
            if(element.getText().contains(text)) {
                System.out.println(element.getText());
                flag = true ;
            }
        }
        Assert.assertTrue(flag);
    }

    @And("User inputs {string}")
    public void userClicksEnter(String text) {
        WebElement element = getElement(searchPom.getSearchInput());
        element.sendKeys(text);
    }

    @Then("User should see {string} products on the page")
    public void userShouldSeeProductsOnThePage(String text) throws InterruptedException {
        Thread.sleep(2000);
        List<WebElement> products = getElements(searchPom.getProduct());
        boolean flag=false;
        for(WebElement element: products){
            if(element.getText().toLowerCase().contains(text.toLowerCase())){
                flag=true;
            }
        }
        Assert.assertTrue(flag);
    }




    @And("User clicks enter")
    public void userClicksEnter() {
        WebElement element = getElement(searchPom.getSearchInput());
        element.sendKeys(Keys.ENTER);
    }

    @And("User  random click product items")
    public void userRandomClickProductItems() throws InterruptedException {
        Thread.sleep(2000);
        List<WebElement> elements = getElements(searchPom.getSeachProduct());
        int randomNum = (int) (Math.random()*elements.size());
        Actions actions = new Actions(driver);
        actions.moveToElement(elements.get(randomNum)).click().perform();
    }

    @Then("User should see  product {string} details on the page")
    public void userShouldSeeProductDetailsOnThePage(String expectedText) throws InterruptedException {
        Thread.sleep(2000);
        String[] arr = expectedText.split("&");
        WebElement element = getElement(searchPom.getProductDetails());
        boolean flag = false;
        for(String a:arr){
           element.getText().toLowerCase().contains(a.toLowerCase());
           flag=true;
        }

        Assert.assertTrue(flag);
    }

    @Then("User shouldn't see {string} products on the page")
    public void userShouldnTSeeProductsOnThePage(String expectedText) {
        WebElement element = getElement(searchPom.getHeading());
        String actualText = element.getText();
        Assert.assertEquals(actualText, expectedText);
    }

}

package StepDefinitions;

import Pom.FavoritlerPom;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class FavoritlerSteps extends BaseMethods{
    FavoritlerPom favoritlerPom;
    public FavoritlerSteps(){
        favoritlerPom = FavoritlerPom.getInstance();
    }
    @When("Click to favoritler sebeti button")
    public void ClickToFavoritlerSebetiButton(){
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", getElement(favoritlerPom.getBigHeart()));

    }

    @Then("User should be navigated to favoritler page")
    public void userShouldBeNavigatedToFavoritlerPage() {
        WebElement element = getElement(favoritlerPom.getTable());
        String actual = element.getText();
        String expected = "";
        Assert.assertEquals(actual,expected);
    }

    @When("Click to favoritler button for four elements")
    public void clickToFavoritlerButtonForFourElements() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        List<WebElement> elements = getElements(favoritlerPom.getClickHeart());
        int expected = 4;
        for (int i = 0;i<expected;i++){
            elements.get(i).click();
        }
    }

    @Then("favoritler sebeti should be matched with added elements")
    public void favoritlerSebetiShouldBeMatchedWithAddedElements() throws InterruptedException {
        Thread.sleep(3000);
        WebElement element = getElement(favoritlerPom.getCountHeart());
        String s = element.getText();
        int actual = Integer.parseInt(s);
        int expected = 4;
        Assert.assertEquals(actual,expected);
    }



    @And("Click favoritler button for two of them")
    public void clickFavoritlerButtonForTwoOfThem() {
        List<WebElement> element = getElements(favoritlerPom.getFavoritlerIcon());
        int expected=2;
        for(int i=0; i<expected;i++){
            element.get(i).click();
        }
    }

    @Then("favoritler sebeti should be decreased")
    public void favoritlerSebetiShouldBeDecreased() throws InterruptedException {
        Thread.sleep(3000);
        int expected = 2;
        WebElement element = getElement(favoritlerPom.getCountHeart());
        String s = element.getText();
        int actual = Integer.parseInt(s);
        Assert.assertEquals(actual,expected);
    }

    @Then("User should see that item on the favoritler sebeti page")
    public void userShouldSeeThatItemOnTheFavoritlerSebetiPage() {
        List<WebElement> elements = getElements(favoritlerPom.getProductCard());
        boolean flag= false;
        for(WebElement element: elements){
            String actual = element.getText();
            String expected = "Soyuducu";
            if(actual.contains(expected)){
                flag=true;
            }
        }
        Assert.assertTrue(flag);
    }

    @Then("Item should be deleted from the favoritler sebeti")
    public void itemShouldBeDeletedFromTheFavoritlerSebeti() throws InterruptedException {
        Thread.sleep(2000);
        WebElement element = getElement(favoritlerPom.getTable());
        String actual = element.getText();
        String expected = "";
        Assert.assertEquals(actual,expected);
    }


    @And("Click favoritler button for four of them")
    public void clickFavoritlerButtonForFourOfThem() {
        List<WebElement> elements = getElements(favoritlerPom.getClickHeartBasket());
        for(WebElement element:elements){
            element.click();
        }
    }

    @And("Click to home page logo")
    public void clickToHomePageLogo() {
        getElement(favoritlerPom.getClickLogo()).click();
    }
}

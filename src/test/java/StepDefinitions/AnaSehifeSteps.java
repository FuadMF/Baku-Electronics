package StepDefinitions;

import Pom.AnaSehifePom;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class AnaSehifeSteps extends BaseMethods{
    AnaSehifePom anaSehifePom;

    public AnaSehifeSteps(){
        anaSehifePom = AnaSehifePom.getInstance();

    }



    @When("Click to {string} button")
    public void clickToButton(String element) {
          String loc = "product";
          loc = loc.replace("product",element);
          driver.findElement(By.linkText(loc)).click();
    }

    @Then("User should be navigated to {string} wep page")
    public void userShouldBeNavigatedToWepPage(String text) {
        WebElement element = getElement(anaSehifePom.getCatHeading());
        Assert.assertTrue(element.isDisplayed());
    }


    @When("Click to any items")
    public void clickToAnyItems() throws InterruptedException {
        List<WebElement> elements = getElements(anaSehifePom.getProductLoc());
        int k = 1;
        for (int i = 0;i<k;i++){
            elements.get(i).click();
        }

    }

    @Then("User should see product details page")
    public void userShouldSeeProductDetailsPage() {
        WebElement element = getElement(anaSehifePom.getProductsDetail());
        Assert.assertTrue(element.isDisplayed());
    }

    @When("Click to slider button")
    public void clickToSliderButton() throws InterruptedException {
        Actions actions = new Actions(driver);
        WebElement element = getElement(anaSehifePom.getSliderBtn());
        actions.moveToElement(element).click().perform();
    }

    @Then("User should see smart phones on the page")
    public void userShouldSeeSmartPhonesOnThePage() throws InterruptedException {
        List<WebElement> elements = getElements(anaSehifePom.getSmartfonsLoc());
        boolean flag = false;
        for (WebElement element:elements){
            if (element.getText().contains("Smartfon")){
                flag = true;
            }
        }
        Assert.assertTrue(flag);
    }



    @When("Click to {string} buttons")
    public void clickToButtons(String element) {
        String loc = "news";
        loc = loc.replace("news",element);
        Actions actions = new Actions(driver);
        WebElement element1 = driver.findElement(By.linkText(loc));
        actions.moveToElement(element1).click().perform();
    }

    @Then("Users should see {string} on the page")
    public void usersShouldSeeOnThePage(String text) throws InterruptedException {
        Thread.sleep(2000);
        List<WebElement> elements = getElements(anaSehifePom.getNewsLoc());
        boolean flag = false;
        for (WebElement element:elements){
            if (element.getText().contains(text)){
                flag = true;
            }
        }
        Assert.assertTrue(flag);
    }

    @When("Click to Musteri karti button")
    public void clickToMusteriKartiButton() {
        getElement(anaSehifePom.getMusteriKartiBtn()).click();
    }

    @Then("User should be navigated to Musteri karti page")
    public void userShouldBeNavigatedToMusteriKartiButton() {
        WebElement element = getElement(anaSehifePom.getMusteriKartiHeader());
        Assert.assertTrue(element.isDisplayed());
    }

    @When("Click to Sirket haqqinda button")
    public void clickToSirketHaqqindaButton() {
        getElement(anaSehifePom.getSirketHaqBtn()).click();
    }

    @Then("User should be navigated to Sirket haqqinda page")
    public void userShouldBeNavigatedToSirketHaqqindaPage() {
        WebElement element = getElement(anaSehifePom.getSirketHaqHeader());
        Assert.assertTrue(element.isDisplayed());
    }

    @When("Click to Zemanet button")
    public void clickToZemanetButton() {
        getElement(anaSehifePom.getZemanetBtn()).click();
    }

    @Then("User should be navigated to Zemanet page")
    public void userShouldBeNavigatedToZemanetPage() {
        WebElement element = getElement(anaSehifePom.getZemanetHeader());
        Assert.assertTrue(element.isDisplayed());
    }

    @When("Click to Arxayin al button")
    public void clickToArxayinAlButton() {
        getElement(anaSehifePom.getArxayinAlBtn()).click();
    }

    @Then("User should be navigated to Arxayin al page")
    public void userShouldBeNavigatedToArxayinAlPage() throws InterruptedException {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        String actualText = getElement(anaSehifePom.getArxayinAlHeader()).getText();
        String expectedText = "Arxayın al";
        Thread.sleep(3000);
        Assert.assertTrue(actualText.contains(expectedText));

    }

    @When("Clicks to {string} button")
    public void clicksToButton(String element) {
        String loc = "icon-socialMedia";
        loc = loc.replace("socialMedia",element);
        driver.findElement(By.className(loc)).click();
    }

    @Then("User should be navigated to {string} page")
    public void userShouldBeNavigatedToPage(String text) throws InterruptedException {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        String currenturl = driver.getCurrentUrl();
        Assert.assertTrue(currenturl.contains(text));
        Thread.sleep(5000);
    }



}

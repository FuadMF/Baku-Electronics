package StepDefinitions;

import Pom.SmartfonlarMobilTelefonlarPom;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SmartfonlarMobilTelefonlarSteps extends BaseMethods {

    SmartfonlarMobilTelefonlarPom smartfonlarMobilTelefonlarPom;

    public SmartfonlarMobilTelefonlarSteps() {
        smartfonlarMobilTelefonlarPom = SmartfonlarMobilTelefonlarPom.getInstance();
    }

    @When("Click to {string} checkbox")
    public void clickToCheckbox(String brend) {
        String[] array = brend.split("&");
        List<WebElement> elements = getElements(smartfonlarMobilTelefonlarPom.getBrendLoc());
        for (WebElement element : elements) {
            for (int i = 0; i < array.length; i++) {
                if (element.getText().toLowerCase().contains(array[i].toLowerCase())) {
                    element.click();
                }
            }
        }
    }

    @Then("User should see {string} phones on the page")
    public void userShouldSeePhonesOnThePage(String text) throws InterruptedException {
        Thread.sleep(3000);
        String[] array = text.split("&");
        List<WebElement> elements = getElements(smartfonlarMobilTelefonlarPom.getProductTitle());
        for (WebElement element : elements) {
            boolean flag = false;
            for (int i = 0; i < array.length; i++) {
                if (element.getText().toLowerCase().contains(array[i].toLowerCase())) {
                    flag = true;
                }
            }
            Assert.assertTrue(flag);
        }
    }


    @When("Click to {string} sistemi checkbox")
    public void clickToSistemiCheckbox(String emeliyyat) {
        String[] array = emeliyyat.split("&");
        List<WebElement> elements = getElements(smartfonlarMobilTelefonlarPom.getEmeliyyatSistemiCheckbox());
        for (WebElement element : elements) {
            for (int i = 0; i < array.length; i++) {
                if (element.getText().equals(array[i])) {
                    element.click();
                }
            }
        }
    }

    @And("Click to any item")
    public void clickToAnyItem() throws InterruptedException {
        Thread.sleep(3000);
        List<WebElement> elements = driver.findElements(By.className("product__title"));
        int randomNum = (int) (Math.random() * elements.size());
        Actions actions = new Actions(driver);
        actions.moveToElement(elements.get(randomNum)).click().perform();
    }


    @Then("User should see {string} about of the phones details")
    public void userShouldSeeAboutOfThePhonesDetails(String text) throws InterruptedException {
        Thread.sleep(3000);
        List<WebElement> elements = getElements(smartfonlarMobilTelefonlarPom.getProductDetails());
        boolean flag = false;
        for (WebElement element : elements) {
            if (element.getText().contains(text)){
                flag = true;
            }
        }
        Assert.assertTrue(flag);
    }


    @When("Click to {string} tipi checkbox")
    public void clickToTipiCheckbox(String prosessor) {
        String[] array = prosessor.split("&");
        List<WebElement> elements = getElements(smartfonlarMobilTelefonlarPom.getProsessorCheckbox());
        for (WebElement element : elements) {
            for (int i = 0; i < array.length; i++) {
                if (element.getText().equals(array[i])) {
                    element.click();
                }
            }
        }
    }

    @When("Click to {string} yaddas checkbox")
    public void clickToYaddasCheckbox(String operativ) {
        String[] array = operativ.split("&");
        List<WebElement> elements = getElements(smartfonlarMobilTelefonlarPom.getOperativYaddasCheckbox());
        for (WebElement element : elements) {
            for (int i = 0; i < array.length; i++) {
                if (element.getText().equals(array[i])) {
                    element.click();
                }
            }
        }
    }

    @When("Click to {string} yaddass checkbox")
    public void clickToYaddassCheckbox(String qurasdirilmis) {
        String[] array = qurasdirilmis.split("&");
        List<WebElement> elements = getElements(smartfonlarMobilTelefonlarPom.getQurasdirilmisYaddasCheckbox());
        for (WebElement element : elements) {
            for (int i = 0; i < array.length; i++) {
                if (element.getText().equals(array[i])) {
                    element.click();
                }
            }
        }
    }

    @When("Click to {string} sayi checkbox")
    public void clickToSayiCheckbox(String nuvelerin) {
        String[] array = nuvelerin.split("&");
        List<WebElement> elements = getElements(smartfonlarMobilTelefonlarPom.getNuvelerinSayiCheckbox());
        for (WebElement element : elements) {
            for (int i = 0; i < array.length; i++) {
                if (element.getText().equals(array[i])) {
                    element.click();
                }
            }
        }
    }

    @When("Click to {string} kamera checkbox")
    public void clickToKameraCheckbox(String esasKamera) {
        String[] array = esasKamera.split("&");
        List<WebElement> elements = getElements(smartfonlarMobilTelefonlarPom.getEsasKameraCheckbox());
        for (WebElement element : elements) {
            for (int i = 0; i < array.length; i++) {
                if (element.getText().equals(array[i])) {
                    element.click();
                }
            }
        }
    }

    @When("Click to {string} frontal checkbox")
    public void clickToFrontalCheckbox(String frontalKamera) {
        String[] array = frontalKamera.split("&");
        List<WebElement> elements = getElements(smartfonlarMobilTelefonlarPom.getFrontalKameraCheckbox());
        for (WebElement element : elements) {
            for (int i = 0; i < array.length; i++) {
                if (element.getText().equals(array[i])) {
                    element.click();
                }
            }
        }
    }


    @When("Click to {string} icazesi checkbox")
    public void clickToIcazesiCheckbox(String ekranIcazesi) {
        String[] array = ekranIcazesi.split("&");
        List<WebElement> elements = getElements(smartfonlarMobilTelefonlarPom.getEkranIcazesiCheckbox());
        for (WebElement element : elements) {
            for (int i = 0; i < array.length; i++) {
                if (element.getText().equals(array[i])) {
                    element.click();
                }
            }
        }
    }

    @When("Click to {string} tezliyi checkbox")
    public void clickToTezliyiCheckbox(String prosessorTezliyi) {
        String[] array = prosessorTezliyi.split("&");
        List<WebElement> elements = getElements(smartfonlarMobilTelefonlarPom.getProsessorTezliyiCheckbox());
        for (WebElement element : elements) {
            for (int i = 0; i < array.length; i++) {
                if (element.getText().equals(array[i])) {
                    element.click();
                }
            }
        }
    }

    @When("Click to {string} tipii checkbox")
    public void clickToTipiiCheckbox(String ekranTipi) {
        String[] array = ekranTipi.split("&");
        List<WebElement> elements = getElements(smartfonlarMobilTelefonlarPom.getEkranTipiCheckbox());
        for (WebElement element : elements) {
            for (int i = 0; i < array.length; i++) {
                if (element.getText().equals(array[i])) {
                    element.click();
                }
            }
        }
    }

    @When("Click to {string} olcusu checkbox")
    public void clickToOlcusuCheckbox(String ekranOlcusu) {
        String[] array = ekranOlcusu.split("&");
        List<WebElement> elements = getElements(smartfonlarMobilTelefonlarPom.getEkranOlcusuCheckbox());
        for (WebElement element : elements) {
            for (int i = 0; i < array.length; i++) {
                if (element.getText().contains(array[i])) {
                    element.click();
                }
            }
        }
    }


    @When("Click to {string} tip checkbox")
    public void clickToTipCheckbox(String reng) {
        String[] array = reng.split("&");
        List<WebElement> elements = getElements(smartfonlarMobilTelefonlarPom.getRengCheckbox());
        for (WebElement element : elements) {
            for (int i = 0; i < array.length; i++) {
                if (element.getText().equals(array[i])) {
                    element.click();
                }
            }
        }
    }

    @When("Click to Endirim button")
    public void clickToEndirimButton() {
        getElement(smartfonlarMobilTelefonlarPom.getEndirimBtn()).click();
    }

    @Then("User Should see Endirim items on the page")
    public void userShouldSeeEndirimItemsOnThePage() throws InterruptedException {
        Thread.sleep(3000);
        List<WebElement> elements = getElements(smartfonlarMobilTelefonlarPom.getEndirimliProduct());
        boolean flag = false;
        for (WebElement element:elements){
            if (element.getText().contains("ENDİRİM")){
                flag = true;
            }
        }
        Assert.assertTrue(flag);
    }

    @When("Click Ucuzdan bahaya button")
    public void clickUcuzdanBahayaButton() {
        getElement(smartfonlarMobilTelefonlarPom.getUcuzdanBahayaBtn()).click();
    }

    @Then("Items should be listed ucuzdan bahaya")
    public void itemsShouldBeListedUcuzdanBahaya() throws InterruptedException {
        Thread.sleep(4000);
        List<WebElement> elements = getElements(smartfonlarMobilTelefonlarPom.getProductPrice());
        List<Double> text = new ArrayList<>();
        for (WebElement element:elements){
            String s = element.getText();
            double d = Double.parseDouble(s);
            text.add(d);
        }

        List<Double> sortedItem = new ArrayList<>();
        sortedItem.addAll(text);
        Collections.sort(sortedItem);
        Assert.assertTrue(text.equals(sortedItem));
    }

    @When("Click Bahadan ucuza button")
    public void clickBahadanUcuzaButton() {
        getElement(smartfonlarMobilTelefonlarPom.getBahadanUcuzaBtn()).click();
    }

    @Then("Items should be listed bahadan ucuza")
    public void itemsShouldBeListedBahadanUcuza() throws InterruptedException {
        Thread.sleep(7000);
        List<WebElement> elements = getElements(smartfonlarMobilTelefonlarPom.getProductOldPrice());
        List<Double> actualText = new ArrayList<>();
        for (WebElement element:elements){
            String s = element.getText();
            double d = Double.parseDouble(s);
            actualText.add(d);
        }

        List<Double> sortedItems = new ArrayList<>();
        sortedItems.addAll(actualText);
        sortedItems.sort(Comparator.reverseOrder());
        Assert.assertTrue(actualText.equals(sortedItems));
    }
}
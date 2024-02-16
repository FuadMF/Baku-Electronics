package StepDefinitions;

import Pom.NotbuklarPom;
import com.beust.ah.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class NotbuklarSteps extends BaseMethods {

    NotbuklarPom notbuklarPom;

    public NotbuklarSteps() {
        notbuklarPom = NotbuklarPom.getInstance();
    }


    @When("User hover notbuklar ve komputer texnikasi")
    public void userHoverNotbuklarVeKomputerTexnikasi() {
        Actions actions = new Actions(driver);
        actions.moveToElement(getElement(notbuklarPom.getNotbokAllflt())).perform();
    }

    @And("User clicks notbuklar")
    public void userClicksNotbuklar() {
        getElement(notbuklarPom.getNotebook()).click();
    }


    @And("User clicks {string} filters")
    public void userClicksFilters(String brend) {
        String [] array = brend.split("&");
        List<WebElement> elements = getElements(notbuklarPom.getBrendFltr());
        for(WebElement element:elements){
            for (String s : array) {
                if (element.getText().equals(s)) {
                    element.click();
                }
            }

        }
    }

    @Then("User should see {string} notebooks on the page")
    public void userShouldSeeNotebooksOnThePage(String brend) throws InterruptedException {
        Thread.sleep(2000);
        List<WebElement> products = getElements(notbuklarPom.getProductTitle());
        boolean flag = false;
        for(WebElement element: products){
            if(element.getText().contains(brend)){
                flag=true;
            }
        }
        Assert.assertTrue(flag);
    }


    @And("User clicks {string} emeliyyat sistemi filters")
    public void userClicksEmeliyyatSistemiFilters(String c) {
        String [] array = c.split("&");
        List<WebElement> elements = getElements(notbuklarPom.getEmlyatSist());
        for(WebElement element:elements){
            for (String s : array) {
                if (element.getText().equals(s)) {
                    element.click();
                }
            }

        }
    }
    @And("User clicks {string} ekranin olcusu filters")
    public void userClicksEkraninOlcusuFilters(String size) {
        String[] array = size.split("&");
        List<WebElement> elements = getElements(notbuklarPom.getEkranSize());
        for (WebElement element : elements) {
            for (String s : array) {
                if (element.getText().contains(s)) {
                    element.click();
                }
            }
        }
    }
    @And("User clicks {string}  prosessor tipi filters")
    public void userClicksProsessorTipiFilters(String a) {
        String[] array= a.split("&");
        List<WebElement> elements = getElements(notbuklarPom.getProsessorTipi());
        for(WebElement element:elements){
            for (String s : array) {
                if (element.getText().equals(s)) {
                    element.click();
                }
            }

        }
    }
    @And("User clicks {string} notbuklar videokart modeli filters")
    public void userClicksNotbuklarVideokartModeliFilters(String card) {
        String[] array = card.split("&");
        List<WebElement> elements = getElements(notbuklarPom.getVideoKart());
        for(WebElement element:elements){
            for (String s : array) {
                if (element.getText().equals(s)) {
                    element.click();
                }
            }

        }
    }

    @And("User clicks {string} operativ yaddas notbuklar filters")
    public void userClicksOperativYaddasNotbuklarFilters(String i) {
        String[] array = i.split("&");
        List<WebElement> elements = getElements(notbuklarPom.getOperativYaddas());
        for(WebElement element:elements){
            for (String s : array) {
                if (element.getText().equals(s)) {
                    element.click();
                }
            }

        }
    }

    @And("User click product items")
    public void userClickProductItems() throws InterruptedException {
        Thread.sleep(3000);
        List<WebElement> elements = getElements(notbuklarPom.getProductTitle());
        int randomNum = (int) (Math.random()*elements.size());
        Actions actions = new Actions(driver);
        actions.moveToElement(elements.get(randomNum)).click().perform();
    }

    @And("User clicks {string} yaddas novu notbuklar filters")
    public void userClicksYaddasNovuNotbuklarFilters(String memory) {
        String[] array = memory.split("&");
        List<WebElement> elements = getElements(notbuklarPom.getYaddasNovu());
        for(WebElement element:elements){
            for (String s : array) {
                if (element.getText().equals(s)) {
                    element.click();
                }
            }

        }
    }

    @And("User clicks {string} qurasdirilmis yaddas notbuklar filters")
    public void userClicksQurasdirilmisYaddasNotbuklarFilters(String v) {
        String [] array = v.split("&");
        List<WebElement> elements = getElements(notbuklarPom.getQurasdirilmisYaddas());
        for(WebElement element:elements){
            for (String s : array) {
                if (element.getText().equals(s)) {
                    element.click();
                }
            }

        }
    }

    @And("User clicks {string} nuvelerin sayi notbuklar filters")
    public void userClicksNuvelerinSayiNotbuklarFilters(String nuve) {
        String[] array = nuve.split("&");
        List<WebElement> elements = getElements(notbuklarPom.getNuvelerinSayi());
        for(WebElement element:elements){
            for (String s : array) {
                if (element.getText().equals(s)) {
                    element.click();
                }
            }

        }
    }

    @And("User clicks {string} ekran icazesi notbuklar filters")
    public void userClicksEkranIcazesiNotbuklarFilters(String permit) {
        String [] array = permit.split("&");
        List<WebElement> elements = getElements(notbuklarPom.getEkranIcazesi());
        for(WebElement element:elements){
            for (String s : array) {
                if (element.getText().equals(s)) {
                    element.click();
                }
            }

        }
    }

    @And("User clicks {string} prosessor tezliyi notbuklar filters")
    public void userClicksProsessorTezliyiNotbuklarFilters(String c) {
        String [] array = c.split("&");
        List<WebElement> elements = getElements(notbuklarPom.getProsessorTezliyi());
        for(WebElement element:elements){
            for (String s : array) {
                if (element.getText().equals(s)) {
                    element.click();
                }
            }

        }
    }

    @And("User clicks {string} ekran tipi notbuklar filters")
    public void userClicksEkranTipiNotbuklarFilters(String j) {
        String[] array = j.split("&");
        List<WebElement> elements = getElements(notbuklarPom.getEkranTipi());
        for(WebElement element:elements){
            for (String s : array) {
                if (element.getText().equals(s)) {
                    element.click();
                }
            }

        }
    }

    @And("User clicks {string} reng notbuklar filters")
    public void userClicksRengNotbuklarFilters(String color) {
        String[] array = color.split("&");
        List<WebElement> elements = getElements(notbuklarPom.getColor());
        for(WebElement element:elements){
            for (String s : array) {
                if (element.getText().equals(s)) {
                    element.click();

                }
            }

        }
    }

    @Then("User should see {string} notebooks on the page table")
    public void userShouldSeeNotebooksOnThePageTable(String expected) throws InterruptedException {
        Thread.sleep(3000);
        String[] array = expected.split("&");
        List<WebElement> products = getElements(notbuklarPom.getTableText());
        boolean flag = false;
        for(WebElement element: products){
            System.out.println("Product Text: " + element.getText());
            for(String s:array){
                System.out.println("Expected:" + s);
                if(element.getText().toLowerCase().contains(s.toLowerCase())){
                    flag=true;
                    break;
            }
            }
            System.out.println("Actual: " + element.getText());
            System.out.println("Expected: " + Arrays.toString(array));


        }

        Assert.assertTrue(flag);
    }


    @Then("User should see Endirim products on the page")
    public void userShouldSeeEndirimProductsOnThePage() throws InterruptedException {
        Thread.sleep(2000);
        List<WebElement> elements = getElements(notbuklarPom.getEndirim());
        boolean flag=false;
        for(WebElement element: elements){
            if(element.isDisplayed()) flag=true;
        }
        Assert.assertTrue(flag);
    }


    @Then("User should see Ucuzdan bahaya products on the page")
    public void userShouldSeeUcuzdanBahayaProductsOnThePage() throws InterruptedException {
        Thread.sleep(2000);
        List<WebElement> elements = getElements(notbuklarPom.getProductPrice());
       List<Double> listText = new ArrayList<>();
       for(WebElement element: elements){
           Double a = Double.valueOf(element.getText());
           listText.add(a);
       }
        List<Double> sortedPrice = new ArrayList<>();
       sortedPrice.addAll(listText);
      Collections.sort(sortedPrice);
       Assert.assertEquals(sortedPrice, listText);
    }


    @Then("User should see Bahadan ucuza products on the page")
    public void userShouldSeeBahadanUcuzaProductsOnThePage() throws InterruptedException {
        Thread.sleep(2000);
        List<WebElement> elements = getElements(notbuklarPom.getProductPrice());
        List<Double> listText = new ArrayList<>();
        for(WebElement element: elements){
            Double a = Double.valueOf(element.getText());
            listText.add(a);
        }
        List<Double> sortedPrice = new ArrayList<>(listText);
        sortedPrice.sort(Comparator.reverseOrder());


        Collections.sort(listText, Comparator.reverseOrder());
        Assert.assertEquals(sortedPrice, listText);

    }

    @And("User click {string} category button")
    public void userClickCategoryButton(String text) {
        List<WebElement> elements = getElements(notbuklarPom.getCatalogSort());
        for(WebElement element: elements){
            if (element.getText().equals(text)) element.click();
        }
    }

    @Then("User should see {string} on the page")
    public void userShouldSeeNotebuksOnThePage(String text) throws InterruptedException {
        Thread.sleep(2000);
        WebElement element = getElement(notbuklarPom.getHeading());
        String actualText = element.getText().toLowerCase();
        Assert.assertTrue(actualText.contains(text));
    }

    @Then("User should see notbuklar on the page")
    public void userShouldSeeNotbuklarOnThePage() throws InterruptedException {
        Thread.sleep(2000);
        List<WebElement> elements = getElements(notbuklarPom.getProductTitle());
        boolean flag=false;
        String expectedText ="Apple MacBook 13";
        for(WebElement element:elements){
            if(element.getText().toLowerCase().contains(expectedText.toLowerCase())){
                flag=true;
            }
        }
        Assert.assertTrue(flag);
    }

}
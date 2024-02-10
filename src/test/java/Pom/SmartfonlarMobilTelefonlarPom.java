package Pom;

import lombok.Data;
import org.openqa.selenium.By;

@Data
public class SmartfonlarMobilTelefonlarPom {
    private final By brendLoc = By.xpath("//*[@id = 'mse2_filters']/div[1]/div[2]/div[1]//*[@class = 'filters__link']");
    private final By productTitle = By.className("product__title");
    private final By emeliyyatSistemiCheckbox = By.xpath("//*[@id = 'mse2_filters']/div[3]/div[2]/div[1]//*[@class = 'filters__link']");
    private final By productDetails = By.className("specs-table__list");
    private final By prosessorCheckbox = By.xpath("//*[@id = 'mse2_filters']/div[5]/div[2]/div[1]//*[@class = 'filters__link']");
    private final By operativYaddasCheckbox = By.xpath("//*[@id = 'mse2_filters']/div[6]/div[2]/div[1]//*[@class = 'filters__link']");
    private final By qurasdirilmisYaddasCheckbox = By.xpath("//*[@id = 'mse2_filters']/div[7]/div[2]/div[1]//*[@class = 'filters__link']");
    private final By nuvelerinSayiCheckbox = By.xpath("//*[@id = 'mse2_filters']/div[8]/div[2]/div[1]//*[@class = 'filters__link']");
    private final By esasKameraCheckbox = By.xpath("//*[@id = 'mse2_filters']/div[9]/div[2]/div[1]//*[@class = 'filters__link']");
    private final By frontalKameraCheckbox = By.xpath("//*[@id = 'mse2_filters']/div[10]/div[2]/div[1]//*[@class = 'filters__link']");
    private final By ekranIcazesiCheckbox = By.xpath("//*[@id = 'mse2_filters']/div[11]/div[2]/div[1]//*[@class = 'filters__link']");
    private final By prosessorTezliyiCheckbox = By.xpath("//*[@id = 'mse2_filters']/div[12]/div[2]/div[1]//*[@class = 'filters__link']");
    private final By ekranTipiCheckbox = By.xpath("//*[@id = 'mse2_filters']/div[13]/div[2]/div[1]//*[@class = 'filters__link']");
    private final By ekranOlcusuCheckbox = By.xpath("//*[@id = 'mse2_filters']/div[4]/div[2]/div[1]//*[@class = 'filters__link']");
    private final By rengCheckbox = By.xpath("//*[@id = 'mse2_filters']/div[14]/div[2]/div[1]//*[@class = 'filters__link']");
    private final By endirimBtn = By.linkText("Endirim");
    private final By endirimliProduct = By.className("product__price--discount-info");
    private final By ucuzdanBahayaBtn = By.linkText("Ucuzdan bahaya");
    private final By productPrice = By.className("product__price--cur");
    private final By bahadanUcuzaBtn = By.linkText("Bahadan ucuza");
    private final By productOldPrice = By.className("old_price");


    

    private SmartfonlarMobilTelefonlarPom(){

    }

    private static SmartfonlarMobilTelefonlarPom Instance;


    public static SmartfonlarMobilTelefonlarPom getInstance(){
        if (Instance == null){
            Instance = new SmartfonlarMobilTelefonlarPom();
            return Instance;
        }
        return Instance;
    }
}

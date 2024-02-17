package Pom;

import lombok.Data;
import org.openqa.selenium.By;

@Data
public class NotbuklarPom {
    private final By notbokAllflt = By.linkText("Notbuklar və kompüter texnikası");
    private final By notebook = By.linkText("Notbuklar");
    private final By brendFltr = By.xpath("//*[@id = 'mse2_filters']/div[1]/div[2]/div[1]//*[@class = 'filters__link']");
    private final By productTitle = By.className("product__title");
    private final By emlyatSist = By.xpath("//*[@id = 'mse2_filters']/div[3]/div[2]/div[1]//*[@class = 'filters__link']");
    private final By ekranSize = By.xpath("//*[@id = 'mse2_filters']/div[4]/div[2]/div[1]//*[@class = 'filters__link']");
    private final By prosessorTipi = By.xpath("//*[@id = 'mse2_filters']/div[5]/div[2]/div[1]//*[@class = 'filters__link']");
    private final By videoKart = By.xpath("//*[@id = 'mse2_filters']/div[6]/div[2]/div[1]//*[@class = 'filters__link']");
    private final By operativYaddas = By.xpath("//*[@id = 'mse2_filters']/div[7]/div[2]/div[1]//*[@class = 'filters__link']");
    private final By yaddasNovu = By.xpath("//*[@id = 'mse2_filters']/div[8]/div[2]/div[1]//*[@class = 'filters__link']");
    private final By qurasdirilmisYaddas = By.xpath("//*[@id = 'mse2_filters']/div[9]/div[2]/div[1]//*[@class = 'filters__link']");
    private final By nuvelerinSayi = By.xpath("//*[@id = 'mse2_filters']/div[10]/div[2]/div[1]//*[@class = 'filters__link']");
    private final By ekranIcazesi = By.xpath("//*[@id = 'mse2_filters']/div[11]/div[2]/div[1]//*[@class = 'filters__link']");
    private final By prosessorTezliyi = By.xpath("//*[@id = 'mse2_filters']/div[12]/div[2]/div[1]//*[@class = 'filters__link']");
    private final By ekranTipi = By.xpath("//*[@id = 'mse2_filters']/div[13]/div[2]/div[1]//*[@class = 'filters__link']");
    private final By color = By.xpath("//*[@id = 'mse2_filters']/div[14]/div[2]/div[1]//*[@class = 'filters__link']");
    private final By clickProduct = By.xpath("//*[@class='flex__row--start js_pagination_container']//*[@class='product__card']");
    private final By tableText = By.className("specs-table__text");
    private final By endirim= By.className("product__price--discount");
    private final By catalogSort =By.className("catalog__sort-item");
    private final By productPrice = By.className("product__price.price_discount_list");
    private final By heading = By.className("catalog__heading");


    private NotbuklarPom(){
    }
    private static NotbuklarPom Instance;
    public static NotbuklarPom getInstance(){
        if (Instance == null){
            Instance = new NotbuklarPom();
            return Instance;
        }
        return Instance;
    }
}

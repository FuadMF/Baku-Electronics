package Pom;

import lombok.Data;
import org.openqa.selenium.By;

@Data
public class SearchPom {
   private final By searchInput =  By.xpath("/html/body/div[1]/header/div[2]/div/div[2]/div[1]/div[1]/div/form/input");
    private final By product =      By.className("product__title");
    private final By sort =         By.className("js-btn-sort");
    private final By sortFilter =   By.className("btn__sort");
    private final By seachProduct = By.xpath("//*[@data-group='products']//li");
    private final By heading = By.className("catalog__heading");
    private final By hover = By.xpath("//*[@class='sgm-search-sidebar']//ul//li");
    private final By productSmallWindow = By.xpath("//*[@data-group='products']//a");
    private final By productDetails =By.cssSelector(".product__heading.product__heading_desk");
    private SearchPom(){

    }

    private static SearchPom Instance;

    public static SearchPom getInstance(){
        if (Instance == null){
            Instance = new SearchPom();
            return Instance;
        }
        return Instance;
    }
}

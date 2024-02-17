package Pom;

import lombok.Data;
import org.openqa.selenium.By;

@Data
public class AnaSehifePom {

    private final By catHeading = By.className("catalog__heading");
    private final By productLoc = By.xpath("//*[@class = 'wrapper']/main/section[4]//*[@class = 'product__title']");
    private final By productsDetail = By.className("specs-table__title");
    private final By sliderBtn = By.xpath("/html/body/div[1]/main/section[2]/div/div/div/span[2]");
    private final By smartfonsLoc = By.xpath("//*[@class = 'wrapper']/main/section[2]//*[@class = 'product__title']");
    private final By newsLoc = By.className("sub-title");
    private final By musteriKartiBtn = By.linkText("Müştəri kartı");
    private final By musteriKartiHeader = By.className("static-header__title");
    private final By sirketHaqBtn = By.linkText("Şirkət haqqında");
    private final By sirketHaqHeader = By.className("static-header__title");
    private final By zemanetBtn = By.linkText("Zәmanәt");
    private final By zemanetHeader = By.className("static-header__title");
    private final By arxayinAlBtn = By.linkText("Arxayın al");
    private final By arxayinAlHeader = By.className("article-title");
    private final String socialMedia = "icon-socialMedia";




    private AnaSehifePom(){

    }

    private static AnaSehifePom Instance;


    public static AnaSehifePom getInstance(){
        if (Instance == null){
            Instance = new AnaSehifePom();
            return Instance;
        }
        return Instance;
    }
}

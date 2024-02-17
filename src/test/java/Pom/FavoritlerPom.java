package Pom;

import lombok.Data;
import org.openqa.selenium.By;

@Data
public class FavoritlerPom {
    private final By bigHeart=By.xpath("//div[@class='header__user']//i[@class='icon-heart']");
private final By favoritlerIcon = By.xpath("//div[@class='flex__row--start']//div[1]//div[1]//div[2]//div[2]//button[2]//i[1]");
private final By table = By.className("personal");
private final By clickHeartBasket = By.xpath("//*[@class='product__card']//*[@class='icon-heart']");
private final By clickHeart = By.xpath("/html/body/div[1]/main/section[6]/div/div/div//*[@class='icon-heart']");
private final By countHeart = By.xpath("/html/body/div[1]/header/div[2]/div/div[2]/div[2]/ul/li[2]/a/span");
private final By productCard = By.className("product__card");
private final By click1 =By.xpath("/html/body/div[1]/main/section[4]/div/div/div/div/div/div[1]/div/div/div/div/div/div[2]/div[2]/button/i");
private final By clickLogo = By.cssSelector(".logo__img.logo__img.logo__img_desktop");
private final By productsName = By.className("product__title");
private FavoritlerPom(){

    }

    private static FavoritlerPom Instance;

    public static FavoritlerPom getInstance(){
        if (Instance == null){
            Instance = new FavoritlerPom();
            return Instance;
        }
        return Instance;
    }
}

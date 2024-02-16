package Pom;

import lombok.Data;
import org.openqa.selenium.By;

@Data
public class AlisVerisSebetiPom {

    private final By alisVerisSebetiBtn = By.className("icon-cart");
    private final By sebetinizBosdurElem = By.className("order-wrap__empty");
    private final By almaqBtn = By.xpath("//*[@class = 'wrapper']/main/section[2]/div/div//*[@class = 'btn__main']");
    private final By cartTotalCountElem = By.className("ms2_total_count");
    private final By minusBtn = By.className("js_minus");
    private final By productsLoc = By.xpath("//*[@class = 'wrapper']/main/section[2]/div/div//*[@class = 'btn__main']");
    private final By orderLoc = By.className("order-card");












    private AlisVerisSebetiPom(){

    }

    private static AlisVerisSebetiPom Instance;

    public static AlisVerisSebetiPom getInstance(){
        if (Instance == null){
            Instance = new AlisVerisSebetiPom();
            return Instance;
        }
        return Instance;
    }
}

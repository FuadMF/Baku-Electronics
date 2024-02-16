package Pom;

import lombok.Data;
import org.openqa.selenium.By;

@Data
public class MagazalarPom {
    private final By magazalar = By.linkText("Mağazalar");
    private final By magazalarNavigate = By.className("static-header__title");
    private final By magazalarlist = By.xpath("//*[@class = 'static-text']/div[1]/div[2]/div[1]/h3[1]/button[1]");
    private MagazalarPom(){

    }

    private static MagazalarPom Instance;

    public static MagazalarPom getInstance(){
        if (Instance == null){
            Instance = new MagazalarPom();
            return Instance;
        }
        return Instance;
    }
}

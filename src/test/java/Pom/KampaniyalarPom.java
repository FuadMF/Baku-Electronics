package Pom;

import lombok.Data;
import org.openqa.selenium.By;

@Data
public class KampaniyalarPom {
    private final By kampaniyalar = By.linkText("Kampaniyalar");
    private final By navigateKampaniya = By.className("blog__title-wrap");
    private final By endirim = By.linkText("Endirim");
    private final By Items = By.className("blog__item-label");
    private final By hediyye = By.linkText("Hədiyyə");
    private final By nisyeAlis = By.linkText("Nisyə alış");
    private KampaniyalarPom(){

    }

    private static KampaniyalarPom Instance;


    public static KampaniyalarPom getInstance(){
        if (Instance == null){
            Instance = new KampaniyalarPom();
            return Instance;
        }
        return Instance;
    }
}

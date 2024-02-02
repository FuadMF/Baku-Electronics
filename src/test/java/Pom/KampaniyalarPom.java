package Pom;

import lombok.Data;

@Data
public class KampaniyalarPom {
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

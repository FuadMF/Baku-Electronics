package Pom;

import lombok.Data;

@Data
public class SmartfonlarMobilTelefonlarPom {

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

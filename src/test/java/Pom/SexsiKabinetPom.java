package Pom;

import lombok.Data;

@Data
public class SexsiKabinetPom {
    private SexsiKabinetPom(){

    }
    private static SexsiKabinetPom Instance;


    public static SexsiKabinetPom getInstance(){
        if (Instance == null){
            Instance = new SexsiKabinetPom();
            return Instance;
        }
        return Instance;
    }
}

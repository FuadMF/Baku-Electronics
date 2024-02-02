package Pom;

import lombok.Data;

@Data
public class MagazalarPom {
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

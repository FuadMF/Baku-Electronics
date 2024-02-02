package Pom;

import lombok.Data;

@Data
public class FavoritlerPom {

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

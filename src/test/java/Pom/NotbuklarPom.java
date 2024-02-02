package Pom;

import lombok.Data;

@Data
public class NotbuklarPom {
    private NotbuklarPom(){

    }

    private static NotbuklarPom Instance;

    public static NotbuklarPom getInstance(){
        if (Instance == null){
            Instance = new NotbuklarPom();
            return Instance;
        }
        return Instance;
    }
}

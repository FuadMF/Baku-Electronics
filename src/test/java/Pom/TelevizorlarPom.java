package Pom;

import lombok.Data;

@Data
public class TelevizorlarPom {

    private TelevizorlarPom(){

    }

    private static TelevizorlarPom Instance;


    public static TelevizorlarPom getInstance(){
        if (Instance == null){
            Instance = new TelevizorlarPom();
            return Instance;
        }
        return Instance;
    }
}

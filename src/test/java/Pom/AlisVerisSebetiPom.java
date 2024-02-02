package Pom;

import lombok.Data;

@Data
public class AlisVerisSebetiPom {











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

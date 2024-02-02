package Pom;

import lombok.Data;

@Data
public class AnaSehifePom {
    private AnaSehifePom(){

    }

    private static AnaSehifePom Instance;


    public static AnaSehifePom getInstance(){
        if (Instance == null){
            Instance = new AnaSehifePom();
            return Instance;
        }
        return Instance;
    }
}

package Pom;

import lombok.Data;

@Data
public class SearchPom {
    private SearchPom(){

    }

    private static SearchPom Instance;

    public static SearchPom getInstance(){
        if (Instance == null){
            Instance = new SearchPom();
            return Instance;
        }
        return Instance;
    }
}

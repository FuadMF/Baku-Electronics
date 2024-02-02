package Pom;

import lombok.Data;

@Data
public class KondisionerlerPom {

    private KondisionerlerPom(){

    }

    private static KondisionerlerPom Instance;

    public static KondisionerlerPom getInstance(){
        if (Instance == null){
            Instance = new KondisionerlerPom();
            return Instance;
        }
        return Instance;
    }
}

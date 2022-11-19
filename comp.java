import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class comp {
    Integer id;
    String compModel;
    String ozy;
    String hardDisk;
    String os;

    public comp(Integer id, String compModel, String ozy, String hardDisk, String os ){
        this.id = id;
        this.compModel = compModel;
        this.ozy = ozy;
        this.os = os;
    }

    public void String comp(HashMap<String,String> map,  String ozy) {
        for (var item : map.entrySet())
        {
            if(item.getValue().equals(ozy))
            {
                System.out.printf("[%d, %s]", item.getKey(), item.getValue());
            }
        }
        return ozy;
    }    
     @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("%d, %s, %s, %s, %s", id,compModel, ozy, hardDisk, os);
    }
}
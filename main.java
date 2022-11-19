
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        ArrayList<comp> data = new ArrayList<comp>();
        comp comp1= new comp(1, "hp", "ddr2", "128 Гб", "64 бит");
        comp comp2= new comp(2, "dell", "ddr", "256 Гб", "64 бит");
        comp comp3= new comp(3, "macbook", "ddr2", "64 Гб", "32 бит");

        HashMap<String, String> map = new HashMap<String, String>();
        map.put("comp1", "hp, ddr2, 128 Гб, 64 бит");
        map.put("comp2", "dell, ddr, 256 Гб, 64 бит");
        map.put("comp3", "macbook, ddr2, 64 Гб, 32 бит");
        
       
        System.out.println(data);
        System.out.println(map);
        Scanner cs = new Scanner(System.in);
        System.out.println("enter ozy : ");
        String a = cs.nextLine();
        String ozy = a;
        filterBy(map, ozy);
    
    }


    // public static String filterBy(HashMap<String,String> map,  String ozy) {
    //     for (var item : map.entrySet())
    //     {
    //         if(item.getValue().equals(ozy))
    //         {
    //             System.out.printf("[%d, %s]", item.getKey(), item.getValue());
    //         }
    //     }
    //     return ozy;
    // }    
 
}
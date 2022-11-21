package comp;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {
            List<comp> data = new ArrayList<comp>();
            comp comp = new comp(1, "hp", "ddr2", "128 Гб", "64 бит");
            comp comp2 = new comp(2, "dell", "ddr", "256 Гб", "64 бит");
            comp comp3 = new comp(3, "macbook", "ddr2", "64 Гб", "32 бит");
            data.add(comp);
            data.add(comp2);
            data.add(comp3);
            System.out.println(data);
            // Onlineshop o1 = new Onlineshop(comp);
            // System.out.println(o1);
            // System.out.println(o1.getProductByOzy("ddr"));
            // System.out.println(o1.getProductByhD("256 Гб"));
 
    }

}

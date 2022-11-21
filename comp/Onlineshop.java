package comp;
import java.util.ArrayList;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;
public class Onlineshop {

    public List<comp> comps = new ArrayList<comp>();
    private final static List<comp> initComp = new ArrayList<>();
    static {
        initComp.add(new comp(1, "lenovo", "ddr", "256 Гб", "32 бит"));
    }

    public Onlineshop(){
        this(initComp);
    }

    public Onlineshop(List<comp> comps) {
        this.comps = comps;
    }

    public Onlineshop(Integer id, String compName, String ozy, String hDisk, String os){
        this.comps = new ArrayList<>();
        comps.add(new comp(id, compName, ozy, hDisk, os));
    }

    public comp getProductByOzy(String inpName){
        for (comp comp : comps) {
            if (comp.getOzy().contains(inpName)){
                return comp;
            }
        }
        return null;
    }
    
    public comp getProductByhD(String inpName){
        for (comp comp : comps) {
           
            if (comp.getHDisk().contains(inpName)){
                return comp; 
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String result = "";
        for (comp comp : comps) {
            result = result.concat(comp.toString() + "\n");
        }
        return result;
    }
}



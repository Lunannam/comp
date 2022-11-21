package comp;

public class comp {

Integer id;
String compModel;
String ozy;
String hDisk;
String os;
public comp(int i, String compModel, String ozy, String hDisk, String os ){
    this.id = i;
    this.compModel = compModel;
    this.ozy = ozy;
    this.hDisk = hDisk;
    this.os = os;
}

public String getOzy(){
    return this.ozy;
}
public String getHDisk(){
    return this.hDisk;
}
public String getOs(){
    return this.os;
}
@Override
public String toString() {
    // TODO Auto-generated method stub
    return String.format("%d, %s, %s, %s, %s", id, compModel, ozy, hDisk, os);
}
}
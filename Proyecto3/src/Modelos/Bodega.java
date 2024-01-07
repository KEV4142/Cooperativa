package Modelos;

/**
 *
 * @author root4142
 */
public class Bodega {
    private int BodegaID;
    private String Nombre;

    public Bodega() {
        this.BodegaID = -1;
        this.Nombre = "";
    }

    public Bodega(int BodegaID, String Nombre) {
        this.BodegaID = BodegaID;
        this.Nombre = Nombre;
    }
    public Bodega(Object data[][]) {
        this.BodegaID = Integer.parseInt(data[0][2].toString());
        this.Nombre = data[1][2].toString();
    }

    public int getBodegaID() {
        return BodegaID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setBodegaID(int BodegaID) {
        this.BodegaID = BodegaID;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    //ssssssssssss
    public Object[][] getVectorData(){
        Object data[][]=new Object[2][3];
        data[0][0]="BodegaID";data[0][1]="int";data[0][2]=this.getBodegaID();
        data[1][0]="Nombre";data[1][1]="string";data[1][2]=this.getNombre();
        return data;
    }
}

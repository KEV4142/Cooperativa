package Modelos;

/**
 *
 * @author root4142
 */
public class Tienda {
    private int TiendaID;
    private String Nombre;
    private String Encargado;
    private String Direccion;

    public Tienda() {
        this.TiendaID = -1;
        this.Nombre = "";
        this.Encargado = "";
        this.Direccion = "";
    }

    public Tienda(int TiendaID, String Nombre, String Encargado, String Direccion) {
        this.TiendaID = TiendaID;
        this.Nombre = Nombre;
        this.Encargado = Encargado;
        this.Direccion = Direccion;
    }
    public Tienda(Object data[][]) {
        this.TiendaID = Integer.parseInt(data[0][2].toString());
        this.Nombre = data[1][2].toString();
        this.Encargado = data[2][2].toString();
        this.Direccion = data[3][2].toString();
    }

    public String getDireccion() {
        return Direccion;
    }

    public String getEncargado() {
        return Encargado;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getTiendaID() {
        return TiendaID;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public void setEncargado(String Encargado) {
        this.Encargado = Encargado;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setTiendaID(int TiendaID) {
        this.TiendaID = TiendaID;
    }
    //ssssssssssss
    public Object[][] getVectorData(){
        Object data[][]=new Object[4][3];
        data[0][0]="TiendaID";data[0][1]="int";data[0][2]=this.getTiendaID();
        data[1][0]="Nombre";data[1][1]="string";data[1][2]=this.getNombre();
        data[2][0]="Encargado";data[2][1]="string";data[2][2]=this.getEncargado();
        data[3][0]="Direccion";data[3][1]="string";data[3][2]=this.getDireccion();
        return data;
    }
}
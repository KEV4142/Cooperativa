package Modelos;

/**
 *
 * @author root4142
 */
public class Articulo {
    private int ArticuloID;
    private String Nombre;
    private int ISV;
    private float Precio;
    private float Utilidad;

    public Articulo() {
        this.ArticuloID = -1;
        this.Nombre = "";
        this.ISV = -1;
        this.Precio = -1;
        this.Utilidad = -1;
    }

    public Articulo(int ArticuloID, String Nombre, int ISV, float Precio, float Utilidad) {
        this.ArticuloID = ArticuloID;
        this.Nombre = Nombre;
        this.ISV = ISV;
        this.Precio = Precio;
        this.Utilidad = Utilidad;
    }
    
    public Articulo(Object data[][]) {
        this.ArticuloID = Integer.parseInt(data[0][2].toString());
        this.Nombre = data[1][2].toString();
        this.ISV = Integer.parseInt(data[2][2].toString());
        this.Precio = Float.parseFloat(data[3][2].toString());
        this.Utilidad = Float.parseFloat(data[4][2].toString());;
    }

    public int getArticuloID() {
        return ArticuloID;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getISV() {
        return ISV;
    }

    public float getPrecio() {
        return Precio;
    }

    public float getUtilidad() {
        return Utilidad;
    }

    public void setArticuloID(int ArticuloID) {
        this.ArticuloID = ArticuloID;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setISV(int ISV) {
        this.ISV = ISV;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }

    public void setUtilidad(float Utilidad) {
        this.Utilidad = Utilidad;
    }
    
    //ssssssssssss
    public Object[][] getVectorData(){
        Object data[][]=new Object[5][3];
        data[0][0]="ArticuloID";data[0][1]="int";data[0][2]=this.getArticuloID();
        data[1][0]="Nombre";data[1][1]="string";data[1][2]=this.getNombre();
        data[2][0]="ISV";data[2][1]="int";data[2][2]=this.getISV();
        data[3][0]="Precio";data[3][1]="float";data[3][2]=this.getPrecio();
        data[4][0]="Utilidad";data[4][1]="float";data[4][2]=this.getUtilidad();
        return data;
    }
}
package Modelos;

/**
 *
 * @author root4142
 */
public class Detalle {
    private int FacturaID;
    private int ArticuloID;
    private int TiendaID;
    private int Cantidad;
    private float Precio;
    private float Impuesto;

    public Detalle() {
        this.FacturaID = -1;
        this.ArticuloID = -1;
        this.TiendaID = -1;
        this.Cantidad = -1;
        this.Precio = -1;
        this.Impuesto = -1;
    }

    public Detalle(int TiendaID,int FacturaID, int ArticuloID, int Cantidad, float Precio, float Impuesto) {
        this.FacturaID = FacturaID;
        this.ArticuloID = ArticuloID;
        this.TiendaID = TiendaID;
        this.Cantidad = Cantidad;
        this.Precio = Precio;
        this.Impuesto = Impuesto;
    }
 
    public Detalle(Object data[][]) {
        this.TiendaID = Integer.parseInt(data[0][2].toString());
        this.FacturaID = Integer.parseInt(data[1][2].toString());
        this.ArticuloID = Integer.parseInt(data[2][2].toString());
        this.Cantidad = Integer.parseInt(data[3][2].toString());
        this.Precio = Float.parseFloat(data[4][2].toString());
        this.Impuesto = Float.parseFloat(data[5][2].toString());
    }

    public int getTiendaID() {
        return TiendaID;
    }

    public int getArticuloID() {
        return ArticuloID;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public int getFacturaID() {
        return FacturaID;
    }

    public float getImpuesto() {
        return Impuesto;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setArticuloID(int ArticuloID) {
        this.ArticuloID = ArticuloID;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public void setFacturaID(int FacturaID) {
        this.FacturaID = FacturaID;
    }

    public void setTiendaID(int TiendaID) {
        this.TiendaID = TiendaID;
    }

    public void setImpuesto(float Impuesto) {
        this.Impuesto = Impuesto;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }
    
    //ssssssssssss
    public Object[][] getVectorData(){
        Object data[][]=new Object[6][3];
        data[0][0]="TiendaID";data[0][1]="int";data[0][2]=this.getTiendaID();
        data[1][0]="FacturaID";data[1][1]="int";data[1][2]=this.getFacturaID();
        data[2][0]="ArticuloID";data[2][1]="int";data[2][2]=this.getArticuloID();
        data[3][0]="Cantidad";data[3][1]="int";data[3][2]=this.getCantidad();
        data[4][0]="Precio";data[4][1]="float";data[4][2]=this.getPrecio();
        data[5][0]="Impuesto";data[5][1]="float";data[5][2]=this.getImpuesto();
        return data;
    }
}
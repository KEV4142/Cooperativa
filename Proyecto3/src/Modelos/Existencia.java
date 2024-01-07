package Modelos;

/**
 *
 * @author root4142
 */
public class Existencia {
    private int ArticuloID;
    private int TiendaID;
    private int Cantidad;
    private int Minimo;

    public Existencia() {
        this.ArticuloID = -1;
        this.TiendaID = -1;
        this.Cantidad = -1;
        this.Minimo = -1;
    }

    public Existencia(int ArticuloID, int TiendaID, int Cantidad, int Minimo) {
        this.ArticuloID = ArticuloID;
        this.TiendaID = TiendaID;
        this.Cantidad = Cantidad;
        this.Minimo = Minimo;
    }
    public Existencia(Object data[][]) {
        this.ArticuloID = Integer.parseInt(data[0][2].toString());
        this.TiendaID = Integer.parseInt(data[1][2].toString());
        this.Cantidad = Integer.parseInt(data[2][2].toString());
        this.Minimo = Integer.parseInt(data[3][2].toString());
    }

    public int getArticuloID() {
        return ArticuloID;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public int getMinimo() {
        return Minimo;
    }

    public int getTiendaID() {
        return TiendaID;
    }

    public void setArticuloID(int ArticuloID) {
        this.ArticuloID = ArticuloID;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public void setMinimo(int Minimo) {
        this.Minimo = Minimo;
    }

    public void setTiendaID(int TiendaID) {
        this.TiendaID = TiendaID;
    }
    //ssssssssssss
    public Object[][] getVectorData(){
        Object data[][]=new Object[4][3];
        data[0][0]="ArticuloID";data[0][1]="int";data[0][2]=this.getArticuloID();
        data[1][0]="TiendaID";data[1][1]="int";data[1][2]=this.getTiendaID();
        data[2][0]="Cantidad";data[2][1]="int";data[2][2]=this.getCantidad();
        data[3][0]="Minimo";data[3][1]="int";data[3][2]=this.getMinimo();
        return data;
    }  
}
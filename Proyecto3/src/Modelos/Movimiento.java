package Modelos;

/**
 *
 * @author root4142
 */
public class Movimiento {
    private int TrasladoID;
    private int ArticuloID;
    private int Cantidad;

    public Movimiento() {
        this.TrasladoID = -1;
        this.ArticuloID = -1;
        this.Cantidad = -1;
    }

    public Movimiento(int TrasladoID, int ArticuloID, int Cantidad) {
        this.TrasladoID = TrasladoID;
        this.ArticuloID = ArticuloID;
        this.Cantidad = Cantidad;
    }
    
    public Movimiento(Object data[][]) {
        this.TrasladoID = Integer.parseInt(data[0][2].toString());
        this.ArticuloID = Integer.parseInt(data[1][2].toString());
        this.Cantidad = Integer.parseInt(data[2][2].toString());
    }

    public int getArticuloID() {
        return ArticuloID;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public int getTrasladoID() {
        return TrasladoID;
    }

    public void setArticuloID(int ArticuloID) {
        this.ArticuloID = ArticuloID;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public void setTrasladoID(int TrasladoID) {
        this.TrasladoID = TrasladoID;
    }
  
    //ssssssssssss
    public Object[][] getVectorData(){
        Object data[][]=new Object[3][3];
        data[0][0]="TrasladoID";data[0][1]="int";data[0][2]=this.getTrasladoID();
        data[1][0]="ArticuloID";data[1][1]="int";data[1][2]=this.getArticuloID();
        data[2][0]="Cantidad";data[2][1]="int";data[2][2]=this.getCantidad();
        return data;
    } 
}
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author root4142
 */
public class CompraDet {
    private int CompraID;
    private int ArticuloID;
    private int Cantidad;
    private float Precio;
    private int ISV;

    public CompraDet() {
        this.CompraID = -1;
        this.ArticuloID = -1;
        this.Cantidad = -1;
        this.Precio = -1;
        this.ISV = -1;
    }

    public CompraDet(int CompraID, int ArticuloID, int Cantidad, float Precio, int ISV) {
        this.CompraID = CompraID;
        this.ArticuloID = ArticuloID;
        this.Cantidad = Cantidad;
        this.Precio = Precio;
        this.ISV = ISV;
    }
    
    public CompraDet(Object data[][]) {
        this.CompraID = Integer.parseInt(data[0][2].toString());
        this.ArticuloID = Integer.parseInt(data[1][2].toString());
        this.Cantidad = Integer.parseInt(data[2][2].toString());
        this.Precio = Float.parseFloat(data[3][2].toString());
        this.ISV = Integer.parseInt(data[4][2].toString());
    }

    public int getArticuloID() {
        return ArticuloID;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public int getISV() {
        return ISV;
    }

    public int getCompraID() {
        return CompraID;
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

    public void setCompraID(int CompraID) {
        this.CompraID = CompraID;
    }

    public void setISV(int ISV) {
        this.ISV = ISV;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }
    
    //ssssssssssss
    public Object[][] getVectorData(){
        Object data[][]=new Object[5][3];
        data[0][0]="CompraID";data[0][1]="int";data[0][2]=this.getCompraID();
        data[1][0]="ArticuloID";data[1][1]="int";data[1][2]=this.getArticuloID();
        data[2][0]="Cantidad";data[2][1]="int";data[2][2]=this.getCantidad();
        data[3][0]="Precio";data[3][1]="float";data[3][2]=this.getPrecio();
        data[4][0]="ISV";data[4][1]="int";data[4][2]=this.getISV();
        return data;
    }
}
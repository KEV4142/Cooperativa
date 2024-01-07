/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author root4142
 */
public class PagoDet {
    private int PagoID;
    private int CompraID;
    private float Valor;

    public PagoDet() {
        this.PagoID = -1;
        this.CompraID = -1;
        this.Valor = -1;
    }

    public PagoDet(int PagoID, int CompraID, float Valor) {
        this.PagoID = PagoID;
        this.CompraID = CompraID;
        this.Valor = Valor;
    }
    
    public PagoDet(Object data[][]) {
        this.PagoID = Integer.parseInt(data[0][2].toString());
        this.CompraID = Integer.parseInt(data[1][2].toString());
        this.Valor = Float.parseFloat(data[4][2].toString());
    }

    public int getCompraID() {
        return CompraID;
    }

    public int getPagoID() {
        return PagoID;
    }

    public float getValor() {
        return Valor;
    }

    public void setCompraID(int CompraID) {
        this.CompraID = CompraID;
    }

    public void setPagoID(int PagoID) {
        this.PagoID = PagoID;
    }

    public void setValor(float Valor) {
        this.Valor = Valor;
    }
    
    //ssssssssssss
    public Object[][] getVectorData(){
        Object data[][]=new Object[3][3];
        data[0][0]="PagoID";data[0][1]="int";data[0][2]=this.getPagoID();
        data[1][0]="CompraID";data[1][1]="int";data[1][2]=this.getCompraID();
        data[2][0]="Valor";data[2][1]="float";data[2][2]=this.getValor();
        return data;
    }
}
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author root4142
 */
public class CompraCab {
    private int CompraID;
    private int ProveedorID;
    private int BodegaID;
    private String Fecha;
    private int Factura;
    private String Estado;
    private String Tipo;

    public CompraCab() {
        this.CompraID = -1;
        this.ProveedorID = -1;
        this.BodegaID = -1;
        this.Fecha = "";
        this.Factura = -1;
        this.Estado = "";
        this.Tipo = "";
    }

    public CompraCab(int CompraID, int ProveedorID,int BodegaID,String Fecha, int Factura, String Estado, String Tipo) {
        this.CompraID = CompraID;
        this.ProveedorID = ProveedorID;
        this.BodegaID = BodegaID;
        this.Fecha = Fecha;
        this.Factura = Factura;
        this.Estado = Estado;
        this.Tipo = Tipo;
    }
    
    public CompraCab(Object data[][]) {
        this.CompraID = Integer.parseInt(data[0][2].toString());
        this.ProveedorID = Integer.parseInt(data[1][2].toString());
        this.BodegaID = Integer.parseInt(data[2][2].toString());
        this.Fecha = data[3][2].toString();
        this.Factura = Integer.parseInt(data[4][2].toString());
        this.Estado = data[5][2].toString();
        this.Tipo = data[6][2].toString();
    }

    public int getCompraID() {
        return CompraID;
    }

    public String getEstado() {
        return Estado;
    }

    public int getBodegaID() {
        return BodegaID;
    }

    public int getFactura() {
        return Factura;
    }

    public String getFecha() {
        return Fecha;
    }

    public int getProveedorID() {
        return ProveedorID;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setCompraID(int CompraID) {
        this.CompraID = CompraID;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public void setBodegaID(int BodegaID) {
        this.BodegaID = BodegaID;
    }

    public void setFactura(int Factura) {
        this.Factura = Factura;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public void setProveedorID(int ProveedorID) {
        this.ProveedorID = ProveedorID;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    
    //ssssssssssss
    public Object[][] getVectorData(){
        Object data[][]=new Object[7][3];
        data[0][0]="CompraID";data[0][1]="int";data[0][2]=this.getCompraID();
        data[1][0]="ProveedorID";data[1][1]="int";data[1][2]=this.getProveedorID();
        data[2][0]="BodegaID";data[2][1]="int";data[2][2]=this.getBodegaID();
        data[3][0]="Fecha";data[3][1]="string";data[3][2]=this.getFecha();
        data[4][0]="Factura";data[4][1]="int";data[4][2]=this.getFactura();
        data[5][0]="Estado";data[5][1]="string";data[5][2]=this.getEstado();
        data[6][0]="Tipo";data[6][1]="string";data[6][2]=this.getTipo();
        return data;
    }
}
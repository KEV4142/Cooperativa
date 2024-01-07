/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author root4142
 */
public class PagoCab {
    private int PagoID;
    private int ProveedorID;
    private int BancoID;
    private String CuentaID;
    private int ChequeID;
    private String Fecha;
    private String Estado;

    public PagoCab() {
        this.PagoID = -1;
        this.ProveedorID = -1;
        this.BancoID = -1;
        this.CuentaID = "";
        this.ChequeID = -1;
        this.Fecha = "";
        this.Estado = "";
    }

    public PagoCab(int PagoID, int ProveedorID, int BancoID, String CuentaID, int ChequeID, String Fecha, String Estado) {
        this.PagoID = PagoID;
        this.ProveedorID = ProveedorID;
        this.BancoID = BancoID;
        this.CuentaID = CuentaID;
        this.ChequeID = ChequeID;
        this.Fecha = Fecha;
        this.Estado = Estado;
    }
    
    public PagoCab(Object data[][]) {
        this.PagoID = Integer.parseInt(data[0][2].toString());
        this.ProveedorID = Integer.parseInt(data[1][2].toString());
        this.BancoID = Integer.parseInt(data[2][2].toString());
        this.CuentaID = data[3][2].toString();
        this.ChequeID = Integer.parseInt(data[4][2].toString());
        this.Fecha = data[5][2].toString();
        this.Estado = data[6][2].toString();
    }

    public int getBancoID() {
        return BancoID;
    }

    public int getChequeID() {
        return ChequeID;
    }

    public String getCuentaID() {
        return CuentaID;
    }

    public String getEstado() {
        return Estado;
    }

    public String getFecha() {
        return Fecha;
    }

    public int getPagoID() {
        return PagoID;
    }

    public int getProveedorID() {
        return ProveedorID;
    }

    public void setBancoID(int BancoID) {
        this.BancoID = BancoID;
    }

    public void setChequeID(int ChequeID) {
        this.ChequeID = ChequeID;
    }

    public void setCuentaID(String CuentaID) {
        this.CuentaID = CuentaID;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public void setPagoID(int PagoID) {
        this.PagoID = PagoID;
    }

    public void setProveedorID(int ProveedorID) {
        this.ProveedorID = ProveedorID;
    }
    
    //ssssssssssss
    public Object[][] getVectorData(){
        Object data[][]=new Object[7][3];
        data[0][0]="PagoID";data[0][1]="int";data[0][2]=this.getPagoID();
        data[1][0]="ProveedorID";data[1][1]="int";data[1][2]=this.getProveedorID();
        data[2][0]="BancoID";data[2][1]="int";data[2][2]=this.getBancoID();
        data[3][0]="CuentaID";data[3][1]="string";data[3][2]=this.getCuentaID();
        data[4][0]="ChequeID";data[4][1]="int";data[4][2]=this.getChequeID();
        data[5][0]="Fecha";data[5][1]="string";data[5][2]=this.getFecha();
        data[6][0]="Estado";data[6][1]="string";data[6][2]=this.getEstado();
        return data;
    } 
}
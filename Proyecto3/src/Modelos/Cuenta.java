/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author root4142
 */
public class Cuenta {
    private String CuentaID;
    private int BancoID;
    private int MonedaID;
    private String Nombre;
    private String Tipo;
    private String Estado;

    public Cuenta() {
        this.CuentaID = "";
        this.BancoID = -1;
        this.MonedaID = -1;
        this.Nombre = "";
        this.Tipo = "";
        this.Estado = "";
    }

    public Cuenta(String CuentaID, int BancoID, int MonedaID, String Nombre, String Tipo, String Estado) {
        this.CuentaID = CuentaID;
        this.BancoID = BancoID;
        this.MonedaID = MonedaID;
        this.Nombre = Nombre;
        this.Tipo = Tipo;
        this.Estado = Estado;
    }
    
    public Cuenta(Object data[][]) {
        this.CuentaID = data[0][2].toString();
        this.BancoID = Integer.parseInt(data[1][2].toString());
        this.MonedaID = Integer.parseInt(data[2][2].toString());
        this.Nombre = data[3][2].toString();
        this.Tipo = data[4][2].toString();
        this.Estado = data[5][2].toString();
    }

    public int getBancoID() {
        return BancoID;
    }

    public String getCuentaID() {
        return CuentaID;
    }

    public String getEstado() {
        return Estado;
    }

    public int getMonedaID() {
        return MonedaID;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setBancoID(int BancoID) {
        this.BancoID = BancoID;
    }

    public void setCuentaID(String CuentaID) {
        this.CuentaID = CuentaID;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public void setMonedaID(int MonedaID) {
        this.MonedaID = MonedaID;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    
    //ssssssssssss
    public Object[][] getVectorData(){
        Object data[][]=new Object[6][3];
        data[0][0]="CuentaID";data[0][1]="string";data[0][2]=this.getCuentaID();
        data[1][0]="BancoID";data[1][1]="int";data[1][2]=this.getBancoID();
        data[2][0]="MonedaID";data[2][1]="int";data[2][2]=this.getMonedaID();
        data[3][0]="Nombre";data[3][1]="string";data[3][2]=this.getNombre();
        data[4][0]="Tipo";data[4][1]="string";data[4][2]=this.getTipo();
        data[5][0]="Estado";data[5][1]="string";data[5][2]=this.getEstado();
        return data;
    } 

}
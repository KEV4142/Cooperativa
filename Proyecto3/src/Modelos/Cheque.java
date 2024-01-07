/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author root4142
 */
public class Cheque {
    private int ChequeID;
    private int BancoID;
    private String CuentaID;
    private String Fecha;
    private String Beneficiario;
    private float Valor;
    private String Estado;
    private String Observacion;

    public Cheque() {
        this.ChequeID = -1;
        this.BancoID = -1;
        this.CuentaID = "";
        this.Fecha = "";
        this.Beneficiario = "";
        this.Valor = -1;
        this.Estado = "";
        this.Observacion = "";
    }

    public Cheque(int ChequeID, int BancoID, String CuentaID, String Fecha, String Beneficiario, float Valor, String Estado, String Observacion) {
        this.ChequeID = ChequeID;
        this.BancoID = BancoID;
        this.CuentaID = CuentaID;
        this.Fecha = Fecha;
        this.Beneficiario = Beneficiario;
        this.Valor = Valor;
        this.Estado = Estado;
        this.Observacion = Observacion;
    }
    
    public Cheque(Object data[][]) {
        this.ChequeID = Integer.parseInt(data[0][2].toString());
        this.BancoID = Integer.parseInt(data[1][2].toString());
        this.CuentaID = data[2][2].toString();
        this.Fecha = data[3][2].toString();
        this.Beneficiario = data[4][2].toString();
        this.Valor = Float.parseFloat(data[5][2].toString());
        this.Estado = data[6][2].toString();
        this.Observacion = data[7][2].toString();
    }

    public int getBancoID() {
        return BancoID;
    }

    public String getBeneficiario() {
        return Beneficiario;
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

    public String getObservacion() {
        return Observacion;
    }

    public float getValor() {
        return Valor;
    }

    public void setBancoID(int BancoID) {
        this.BancoID = BancoID;
    }

    public void setBeneficiario(String Beneficiario) {
        this.Beneficiario = Beneficiario;
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

    public void setObservacion(String Observacion) {
        this.Observacion = Observacion;
    }

    public void setValor(float Valor) {
        this.Valor = Valor;
    }
    
   //ssssssssssss
    public Object[][] getVectorData(){
        Object data[][]=new Object[8][3];
        data[0][0]="ChequeID";data[0][1]="int";data[0][2]=this.getChequeID();
        data[1][0]="BancoID";data[1][1]="int";data[1][2]=this.getBancoID();
        data[2][0]="CuentaID";data[2][1]="string";data[2][2]=this.getCuentaID();
        data[3][0]="Fecha";data[3][1]="string";data[3][2]=this.getFecha();
        data[4][0]="Beneficiario";data[4][1]="string";data[4][2]=this.getBeneficiario();
        data[5][0]="Valor";data[5][1]="float";data[5][2]=this.getValor();
        data[6][0]="Estado";data[6][1]="string";data[6][2]=this.getEstado();
        data[7][0]="Observacion";data[7][1]="string";data[7][2]=this.getObservacion();
        return data;
    }   
}
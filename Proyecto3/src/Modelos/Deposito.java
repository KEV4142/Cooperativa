package Modelos;

/**
 *
 * @author root4142
 */
public class Deposito {
    private String DepositoID;
    private int BancoID;
    private String CuentaID;
    private String Fecha;
    private float Valor;
    private String Estado;
    private String Observacion;
    
    public Deposito() {
        this.DepositoID = "";
        this.BancoID = -1;
        this.CuentaID = "";
        this.Fecha = "";
        this.Valor = -1;
        this.Estado = "";
        this.Observacion = "";
    }

    public Deposito(String DepositoID, int BancoID, String CuentaID, String Fecha, float Valor, String Estado, String Observacion) {
        this.DepositoID = DepositoID;
        this.BancoID = BancoID;
        this.CuentaID = CuentaID;
        this.Fecha = Fecha;
        this.Valor = Valor;
        this.Estado = Estado;
        this.Observacion = Observacion;
    }
    
    public Deposito(Object data[][]) {
        this.DepositoID = data[0][2].toString();
        this.BancoID = Integer.parseInt(data[1][2].toString());
        this.CuentaID = data[2][2].toString();
        this.Fecha = data[3][2].toString();
        this.Valor = Float.parseFloat(data[4][2].toString());
        this.Estado = data[5][2].toString();
        this.Observacion = data[6][2].toString();
    }

    public int getBancoID() {
        return BancoID;
    }

    public String getCuentaID() {
        return CuentaID;
    }

    public String getDepositoID() {
        return DepositoID;
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

    public void setCuentaID(String CuentaID) {
        this.CuentaID = CuentaID;
    }

    public void setDepositoID(String DepositoID) {
        this.DepositoID = DepositoID;
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
        Object data[][]=new Object[7][3];
        data[0][0]="DepositoID";data[0][1]="string";data[0][2]=this.getDepositoID();
        data[1][0]="BancoID";data[1][1]="int";data[1][2]=this.getBancoID();
        data[2][0]="CuentaID";data[2][1]="string";data[2][2]=this.getCuentaID();
        data[3][0]="Fecha";data[3][1]="string";data[3][2]=this.getFecha();
        data[4][0]="Valor";data[4][1]="float";data[4][2]=this.getValor();
        data[5][0]="Estado";data[5][1]="string";data[5][2]=this.getEstado();
        data[6][0]="Observacion";data[6][1]="string";data[6][2]=this.getObservacion();
        return data;
    }
    
}
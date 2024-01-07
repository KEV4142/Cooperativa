package Modelos;

/**
 *
 * @author root4142
 */
public class Prestamo {
    private int PrestamoID;
    private int SocioID;
    private String Fecha;
    private float Valor;
    private int Tiempo;
    private int Interes;
    private int Mora;
    private int BancoID;
    private String CuentaID;
    private int ChequeID;

    public Prestamo() {
        this.PrestamoID = -1;
        this.SocioID = -1;
        this.Fecha = "";
        this.Valor = -1;
        this.Tiempo = -1;
        this.Interes = -1;
        this.Mora = -1;
        this.BancoID = -1;
        this.CuentaID = "";
        this.ChequeID = -1;
    }

    public Prestamo(int PrestamoID, int SocioID, String Fecha, float Valor, int Tiempo, int Interes, int Mora, int BancoID, String CuentaID, int ChequeID) {
        this.PrestamoID = PrestamoID;
        this.SocioID = SocioID;
        this.Fecha = Fecha;
        this.Valor = Valor;
        this.Tiempo = Tiempo;
        this.Interes = Interes;
        this.Mora = Mora;
        this.BancoID = BancoID;
        this.CuentaID = CuentaID;
        this.ChequeID = ChequeID;
    }
    public Prestamo(Object data[][]) {
        this.PrestamoID = Integer.parseInt(data[0][2].toString());
        this.SocioID = Integer.parseInt(data[1][2].toString());
        this.Fecha = data[2][2].toString();
        this.Valor = Float.parseFloat(data[3][2].toString());
        this.Tiempo = Integer.parseInt(data[4][2].toString());
        this.Interes = Integer.parseInt(data[5][2].toString());
        this.Mora = Integer.parseInt(data[6][2].toString());
        this.BancoID = Integer.parseInt(data[7][2].toString());
        this.CuentaID = data[8][2].toString();
        this.ChequeID = Integer.parseInt(data[9][2].toString());
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

    public String getFecha() {
        return Fecha;
    }

    public int getMora() {
        return Mora;
    }

    public int getPrestamoID() {
        return PrestamoID;
    }

    public int getSocioID() {
        return SocioID;
    }

    public int getInteres() {
        return Interes;
    }

    public int getTiempo() {
        return Tiempo;
    }

    public float getValor() {
        return Valor;
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

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public void setInteres(int Interes) {
        this.Interes = Interes;
    }

    public void setMora(int Mora) {
        this.Mora = Mora;
    }

    public void setPrestamoID(int PrestamoID) {
        this.PrestamoID = PrestamoID;
    }

    public void setSocioID(int SocioID) {
        this.SocioID = SocioID;
    }

    public void setTiempo(int Tiempo) {
        this.Tiempo = Tiempo;
    }

    public void setValor(float Valor) {
        this.Valor = Valor;
    }
    //ssssssssssss
    public Object[][] getVectorData(){
        Object data[][]=new Object[10][3];
        data[0][0]="PrestamoID";data[0][1]="int";data[0][2]=this.getPrestamoID();
        data[1][0]="SocioID";data[1][1]="int";data[1][2]=this.getSocioID();
        data[2][0]="Fecha";data[2][1]="string";data[2][2]=this.getFecha();
        data[3][0]="Valor";data[3][1]="float";data[3][2]=this.getValor();
        data[4][0]="Tiempo";data[4][1]="int";data[4][2]=this.getTiempo();
        data[5][0]="Interes";data[5][1]="int";data[5][2]=this.getInteres();
        data[6][0]="Mora";data[6][1]="int";data[6][2]=this.getMora();
        data[7][0]="BancoID";data[7][1]="int";data[7][2]=this.getBancoID();
        data[8][0]="CuentaID";data[8][1]="string";data[8][2]=this.getCuentaID();
        data[9][0]="ChequeID";data[9][1]="int";data[9][2]=this.getChequeID();
        return data;
    }
}
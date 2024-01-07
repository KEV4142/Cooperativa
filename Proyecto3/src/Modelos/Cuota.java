package Modelos;

/**
 *
 * @author root4142
 */
public class Cuota {
    private int CuotaID;
    private int PrestamoID;
    private String FechaVence;
    private String FechaPago;
    private float Capital;
    private float Interes;
    private float Mora;
    private String Estado;

    public Cuota() {
        this.CuotaID = -1;
        this.PrestamoID = -1;
        this.FechaVence = "";
        this.FechaPago = "";
        this.Capital = -1;
        this.Interes = -1;
        this.Mora = -1;
        this.Estado = "";
    }

    public Cuota(int PrestamoID, int CuotaID, String FechaVence, String FechaPago, float Capital, float Interes, float Mora,String estado) {
        this.CuotaID = CuotaID;
        this.PrestamoID = PrestamoID;
        this.FechaVence = FechaVence;
        this.FechaPago = FechaPago;
        this.Capital = Capital;
        this.Interes = Interes;
        this.Mora = Mora;
        this.Estado = estado;
    }
    public Cuota(Object data[][]) {
        this.PrestamoID = Integer.parseInt(data[0][2].toString());
        this.CuotaID = Integer.parseInt(data[1][2].toString());
        this.FechaVence = data[2][2].toString();
        this.FechaPago = data[3][2].toString();
        this.Capital = Float.parseFloat(data[4][2].toString());
        this.Interes = Float.parseFloat(data[5][2].toString());
        this.Mora = Float.parseFloat(data[6][2].toString());
        this.Estado = data[7][2].toString();
    }

    public float getCapital() {
        return Capital;
    }

    public int getCuotaID() {
        return CuotaID;
    }

    public String getFechaVence() {
        return FechaVence;
    }

    public String getFechaPago() {
        return FechaPago;
    }

    public float getInteres() {
        return Interes;
    }

    public float getMora() {
        return Mora;
    }

    public int getPrestamoID() {
        return PrestamoID;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    

    public void setCapital(float Capital) {
        this.Capital = Capital;
    }

    public void setCuotaID(int CuotaID) {
        this.CuotaID = CuotaID;
    }

    public void setFechaPago(String FechaPago) {
        this.FechaPago = FechaPago;
    }

    public void setFechaVence(String FechaVence) {
        this.FechaVence = FechaVence;
    }

    public void setInteres(float Interes) {
        this.Interes = Interes;
    }

    public void setMora(float Mora) {
        this.Mora = Mora;
    }

    public void setPrestamoID(int PrestamoID) {
        this.PrestamoID = PrestamoID;
    }
//ssssssssssss
    public Object[][] getVectorData(){
        Object data[][]=new Object[8][3];
        data[0][0]="PrestamoID";data[0][1]="int";data[0][2]=this.getPrestamoID();
        data[1][0]="CuotaID";data[1][1]="int";data[1][2]=this.getCuotaID();
        data[2][0]="FechaVence";data[2][1]="string";data[2][2]=this.getFechaVence();
        data[3][0]="FechaPago";data[3][1]="string";data[3][2]=this.getFechaPago();
        data[4][0]="Capital";data[4][1]="float";data[4][2]=this.getCapital();
        data[5][0]="Interes";data[5][1]="float";data[5][2]=this.getInteres();
        data[6][0]="Mora";data[6][1]="float";data[6][2]=this.getMora();
        data[7][0]="Estado";data[7][1]="string";data[7][2]=this.getEstado();
        return data;
    }   
}
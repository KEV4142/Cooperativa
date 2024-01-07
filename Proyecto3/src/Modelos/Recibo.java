package Modelos;

/**
 *
 * @author root4142
 */
public class Recibo {
    private int ReciboID;
    private String Fecha;
    private String AnticipoID;
    private String CuotaID;
    private String PrestamoID;
    private String FacturaID;
    private String TiendaID;
    private String Estado;
    private int CargaID;

    public Recibo() {
        this.ReciboID = -1;
        this.Fecha = "";
        this.AnticipoID = "";
        this.CuotaID = "";
        this.PrestamoID = "";
        this.FacturaID = "";
        this.TiendaID = "";
        this.Estado = "";
        this.CargaID = -1;
    }

    public Recibo(int ReciboID, String Fecha, String AnticipoID, String CuotaID, String PrestamoID, String FacturaID, String TiendaID, String Estado, int CargaID) {
        this.ReciboID = ReciboID;
        this.Fecha = Fecha;
        this.AnticipoID = AnticipoID;
        this.CuotaID = CuotaID;
        this.PrestamoID = PrestamoID;
        this.FacturaID = FacturaID;
        this.TiendaID = TiendaID;
        this.Estado = Estado;
        this.CargaID = CargaID;
    }
    
    public Recibo(Object data[][]) {
        this.ReciboID = Integer.parseInt(data[0][2].toString());
        this.Fecha = data[1][2].toString();
        this.AnticipoID = data[2][2].toString();
        this.CuotaID = (data[3][2].toString());
        this.PrestamoID = (data[4][2].toString());
        this.FacturaID = (data[5][2].toString());
        this.TiendaID = (data[6][2].toString());
        this.Estado = data[7][2].toString();
        this.CargaID = Integer.parseInt(data[8][2].toString());
    }

    public String getAnticipoID() {
        return AnticipoID;
    }

    public int getCargaID() {
        return CargaID;
    }

    public String getCuotaID() {
        return CuotaID;
    }

    public String getEstado() {
        return Estado;
    }

    public String getFacturaID() {
        return FacturaID;
    }

    public String getFecha() {
        return Fecha;
    }

    public String getPrestamoID() {
        return PrestamoID;
    }

    public int getReciboID() {
        return ReciboID;
    }

    public String getTiendaID() {
        return TiendaID;
    }

    public void setAnticipoID(String AnticipoID) {
        this.AnticipoID = AnticipoID;
    }

    public void setCargaID(int CargaID) {
        this.CargaID = CargaID;
    }

    public void setCuotaID(String CuotaID) {
        this.CuotaID = CuotaID;
    }

    public void setFacturaID(String FacturaID) {
        this.FacturaID = FacturaID;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public void setPrestamoID(String PrestamoID) {
        this.PrestamoID = PrestamoID;
    }

    public void setReciboID(int ReciboID) {
        this.ReciboID = ReciboID;
    }

    public void setTiendaID(String TiendaID) {
        this.TiendaID = TiendaID;
    }
    //ssssssssssss
    public Object[][] getVectorData(){
        Object data[][]=new Object[9][3];
        data[0][0]="ReciboID";data[0][1]="int";data[0][2]=this.getReciboID();
        data[1][0]="Fecha";data[1][1]="string";data[1][2]=this.getFecha();
        data[2][0]="AnticipoID";data[2][1]="string";data[2][2]=this.getAnticipoID();
        data[3][0]="CuotaID";data[3][1]="string";data[3][2]=this.getCuotaID();
        data[4][0]="PrestamoID";data[4][1]="string";data[4][2]=this.getPrestamoID();
        data[5][0]="FacturaID";data[5][1]="string";data[5][2]=this.getFacturaID();
        data[6][0]="TiendaID";data[6][1]="string";data[6][2]=this.getTiendaID();
        data[7][0]="Estado";data[7][1]="string";data[7][2]=this.getEstado();
        data[8][0]="CargaID";data[8][1]="int";data[8][2]=this.getCargaID();
        return data;
    }
    
    //Vector para guardar con nulos
    public Object[][] getVectorDataInsert(){
        Object data[][]=new Object[9][3];
        data[0][0]="ReciboID";data[0][1]="int";data[0][2]=this.getReciboID();
        data[1][0]="Fecha";data[1][1]="string";data[1][2]=this.getFecha();
        data[2][0]="AnticipoID";data[2][1]="null";data[2][2]=this.getAnticipoID();
        data[3][0]="CuotaID";data[3][1]="null";data[3][2]=this.getCuotaID();
        data[4][0]="PrestamoID";data[4][1]="null";data[4][2]=this.getPrestamoID();
        data[5][0]="FacturaID";data[5][1]="null";data[5][2]=this.getFacturaID();
        data[6][0]="TiendaID";data[6][1]="null";data[6][2]=this.getTiendaID();
        data[7][0]="Estado";data[7][1]="string";data[7][2]=this.getEstado();
        data[8][0]="CargaID";data[8][1]="int";data[8][2]=this.getCargaID();
        return data;
    }
}
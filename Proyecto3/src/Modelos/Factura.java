/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author root4142
 */
public class Factura {
    private int FacturaID;
    private int TiendaID;
    private int SocioID;
    private String Fecha;
    private String Estado;
    private String Observacion;

    public Factura() {
        this.FacturaID = -1;
        this.TiendaID = -1;
        this.SocioID = -1;
        this.Fecha = "";
        this.Observacion = "";
        this.Estado = "";
    }

    public Factura(int TiendaID ,int FacturaID, int SocioID, String Fecha, String Estado, String Observacion) {
        this.FacturaID = FacturaID;
        this.TiendaID = TiendaID;
        this.SocioID = SocioID;
        this.Fecha = Fecha;
        this.Observacion = Observacion;
        this.Estado = Estado;
    }
    
    public Factura(Object data[][]) {
        this.TiendaID = Integer.parseInt(data[0][2].toString());
        this.FacturaID = Integer.parseInt(data[1][2].toString());
        this.SocioID = Integer.parseInt(data[2][2].toString());
        this.Fecha = data[3][2].toString();
        this.Estado = data[4][2].toString();
        this.Observacion = data[5][2].toString();
    }

    public int getTiendaID() {
        return TiendaID;
    }

    public String getEstado() {
        return Estado;
    }

    public int getFacturaID() {
        return FacturaID;
    }

    public String getFecha() {
        return Fecha;
    }

    public int getSocioID() {
        return SocioID;
    }

    public String getObservacion() {
        return Observacion;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public void setTiendaID(int TiendaID) {
        this.TiendaID = TiendaID;
    }

    public void setFacturaID(int FacturaID) {
        this.FacturaID = FacturaID;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public void setSocioID(int SocioID) {
        this.SocioID = SocioID;
    }

    public void setObservacion(String Observacion) {
        this.Observacion = Observacion;
    }
    
    //ssssssssssss
    public Object[][] getVectorData(){
        Object data[][]=new Object[6][3];
        data[0][0]="TiendaID";data[0][1]="int";data[0][2]=this.getTiendaID();
        data[1][0]="FacturaID";data[1][1]="int";data[1][2]=this.getFacturaID();
        data[2][0]="SocioID";data[2][1]="int";data[2][2]=this.getSocioID();
        data[3][0]="Fecha";data[3][1]="string";data[3][2]=this.getFecha();
        data[4][0]="Estado";data[4][1]="string";data[4][2]=this.getEstado();
        data[5][0]="Observacion";data[5][1]="string";data[5][2]=this.getObservacion();
        return data;
    }
}
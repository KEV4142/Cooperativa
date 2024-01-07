package Modelos;

/**
 *
 * @author root4142
 */
public class Anticipo {
    private int AnticipoID;
    private int SocioID;
    private String Fecha;
    private float Valor;
    private String Estado;
    private String Observacion;

    public Anticipo() {
        this.AnticipoID = -1;
        this.SocioID = -1;
        this.Fecha = "";
        this.Valor = -1;
        this.Estado = "";
        this.Observacion = "";
    }

    public Anticipo(int AnticipoID, int SocioID, String Fecha, float Valor, String Estado, String Observacion) {
        this.AnticipoID = AnticipoID;
        this.SocioID = SocioID;
        this.Fecha = Fecha;
        this.Valor = Valor;
        this.Estado = Estado;
        this.Observacion = Observacion;
    }

    public Anticipo(Object data[][]) {
        this.AnticipoID = Integer.parseInt(data[0][2].toString());;
        this.SocioID = Integer.parseInt(data[1][2].toString());;
        this.Fecha = data[2][2].toString();
        this.Valor = Float.parseFloat(data[3][2].toString());;
        this.Estado = data[4][2].toString();
        this.Observacion = data[5][2].toString();
    }

    public int getAnticipoID() {
        return AnticipoID;
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

    public int getSocioID() {
        return SocioID;
    }

    public float getValor() {
        return Valor;
    }

    public void setAnticipoID(int AnticipoID) {
        this.AnticipoID = AnticipoID;
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

    public void setSocioID(int SocioID) {
        this.SocioID = SocioID;
    }

    public void setValor(float Valor) {
        this.Valor = Valor;
    }
    //ssssssssssss
    public Object[][] getVectorData(){
        Object data[][]=new Object[6][3];
        data[0][0]="AnticipoID";data[0][1]="int";data[0][2]=this.getAnticipoID();
        data[1][0]="SocioID";data[1][1]="int";data[1][2]=this.getSocioID();
        data[2][0]="Fecha";data[2][1]="string";data[2][2]=this.getFecha();
        data[3][0]="Valor";data[3][1]="float";data[3][2]=this.getValor();
        data[4][0]="Estado";data[4][1]="string";data[4][2]=this.getEstado();
        data[5][0]="Observacion";data[5][1]="string";data[5][2]=this.getObservacion();
        return data;
    }
}
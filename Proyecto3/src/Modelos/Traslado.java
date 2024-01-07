package Modelos;

/**
 *
 * @author root4142
 */
public class Traslado {
    private int TrasladoID;
    private int BodegaID;
    private int TiendaID;
    private String Fecha;
    private String Tipo;
    private String Estado;

    public Traslado() {
        this.TrasladoID = -1;
        this.BodegaID = -1;
        this.TiendaID = -1;
        this.Fecha = "";
        this.Tipo = "";
        this.Estado = "";
    }

    public Traslado(int TrasladoID, int BodegaID, int TiendaID, String Fecha, String Tipo, String Estado) {
        this.TrasladoID = TrasladoID;
        this.BodegaID = BodegaID;
        this.TiendaID = TiendaID;
        this.Fecha = Fecha;
        this.Tipo = Tipo;
        this.Estado = Estado;
    }
    
    public Traslado(Object data[][]) {
        this.TrasladoID = Integer.parseInt(data[0][2].toString());
        this.BodegaID = Integer.parseInt(data[1][2].toString());
        this.TiendaID = Integer.parseInt(data[2][2].toString());
        this.Fecha = data[3][2].toString();
        this.Tipo = data[4][2].toString();
        this.Estado = data[5][2].toString();
    }

    public int getBodegaID() {
        return BodegaID;
    }

    public String getEstado() {
        return Estado;
    }

    public String getFecha() {
        return Fecha;
    }

    public int getTiendaID() {
        return TiendaID;
    }

    public String getTipo() {
        return Tipo;
    }

    public int getTrasladoID() {
        return TrasladoID;
    }

    public void setBodegaID(int BodegaID) {
        this.BodegaID = BodegaID;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public void setTiendaID(int TiendaID) {
        this.TiendaID = TiendaID;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public void setTrasladoID(int TrasladoID) {
        this.TrasladoID = TrasladoID;
    }
    //ssssssssssss
    public Object[][] getVectorData(){
        Object data[][]=new Object[6][3];
        data[0][0]="TrasladoID";data[0][1]="int";data[0][2]=this.getTrasladoID();
        data[1][0]="BodegaID";data[1][1]="int";data[1][2]=this.getBodegaID();
        data[2][0]="TiendaID";data[2][1]="int";data[2][2]=this.getTiendaID();
        data[3][0]="Fecha";data[3][1]="string";data[3][2]=this.getFecha();
        data[4][0]="Tipo";data[4][1]="string";data[4][2]=this.getTipo();
        data[5][0]="Estado";data[5][1]="string";data[5][2]=this.getEstado();
        return data;
    }
}
package Modelos;

/**
 *
 * @author root4142
 */
public class Ahorro {
    private int Item;
    private int SocioID;
    private String Fecha;
    private String Tipo;
    private float Valor;
    private int CargaID;
    
    public Ahorro() {
        this.Item = -1;
        this.SocioID = -1;
        this.Fecha = "";
        this.Tipo = "";
        this.Valor = -1;
        this.CargaID = -1;
    }

    public Ahorro(int SocioID, int AhorroID, String Fecha, String Tipo, float Valor, int CargaID) {
        this.Item = AhorroID;
        this.SocioID = SocioID;
        this.Fecha = Fecha;
        this.Tipo = Tipo;
        this.Valor = Valor;
        this.CargaID = CargaID;
    }
    
    public Ahorro(Object data[][]) {
        this.SocioID = Integer.parseInt(data[0][2].toString());
        this.Item = Integer.parseInt(data[1][2].toString());
        this.Fecha = data[2][2].toString();
        this.Tipo = data[3][2].toString();
        this.Valor = Float.parseFloat(data[4][2].toString());
        this.CargaID = Integer.parseInt(data[5][2].toString());
    }

    public int getCargaID() {
        return CargaID;
    }

    public int getItem() {
        return Item;
    }

    public int getSocioID() {
        return SocioID;
    }

    public String getFecha() {
        return Fecha;
    }

    public String getTipo() {
        return Tipo;
    }

    public float getValor() {
        return Valor;
    }

    public void setCargaID(int CargaID) {
        this.CargaID = CargaID;
    }

    public void setItem(int Item) {
        this.Item = Item;
    }

    public void setSocioID(int SocioID) {
        this.SocioID = SocioID;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public void setValor(float Valor) {
        this.Valor = Valor;
    }
    
    //ssssssssssss
    public Object[][] getVectorData(){
        Object data[][]=new Object[6][3];
        data[0][0]="SocioID";data[0][1]="int";data[0][2]=this.getSocioID();
        data[1][0]="Item";data[1][1]="int";data[1][2]=this.getItem();
        data[2][0]="Fecha";data[2][1]="string";data[2][2]=this.getFecha();
        data[3][0]="Tipo";data[3][1]="string";data[3][2]=this.getTipo();
        data[4][0]="Valor";data[4][1]="float";data[4][2]=this.getValor();
        data[5][0]="CargaID";data[5][1]="int";data[5][2]=this.getCargaID();
        return data;
    }
    
}
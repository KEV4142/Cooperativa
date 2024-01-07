package Modelos;

/**
 *
 * @author root4142
 */
public class FormaPago {
    private int TiendaID;
    private int FacturaID;
    private String Tipo;
    private float Valor;

    public FormaPago() {
        this.TiendaID = -1;
        this.FacturaID = -1;
        this.Tipo = "";
        this.Valor = -1;
    }

    public FormaPago(int TiendaID, int FacturaID, String Tipo, float Valor) {
        this.TiendaID = TiendaID;
        this.FacturaID = FacturaID;
        this.Tipo = Tipo;
        this.Valor = Valor;
    }
    public FormaPago(Object data[][]) {
        this.TiendaID = Integer.parseInt(data[0][2].toString());
        this.FacturaID = Integer.parseInt(data[1][2].toString());
        this.Tipo = data[2][2].toString();
        this.Valor = Float.parseFloat(data[3][2].toString());
    }

    public int getFacturaID() {
        return FacturaID;
    }

    public int getTiendaID() {
        return TiendaID;
    }

    public String getTipo() {
        return Tipo;
    }

    public float getValor() {
        return Valor;
    }

    public void setFacturaID(int FacturaID) {
        this.FacturaID = FacturaID;
    }

    public void setTiendaID(int TiendaID) {
        this.TiendaID = TiendaID;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public void setValor(float Valor) {
        this.Valor = Valor;
    }
    //ssssssssssss
    public Object[][] getVectorData(){
        Object data[][]=new Object[4][3];
        data[0][0]="TiendaID";data[0][1]="int";data[0][2]=this.getTiendaID();
        data[1][0]="FacturaID";data[1][1]="int";data[1][2]=this.getFacturaID();
        data[2][0]="Tipo";data[2][1]="string";data[2][2]=this.getTipo();
        data[3][0]="Valor";data[3][1]="float";data[3][2]=this.getValor();
        return data;
    } 
}
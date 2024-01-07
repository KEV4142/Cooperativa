package Modelos;

/**
 *
 * @author root4142
 */
public class TiendaEmpresa {
    private int TiendaID;
    private int EmpresaID;

    public TiendaEmpresa() {
        this.TiendaID = -1;
        this.EmpresaID = -1;
    }

    public TiendaEmpresa(int TiendaID, int EmpresaID) {
        this.TiendaID = TiendaID;
        this.EmpresaID = EmpresaID;
    }
    
    public TiendaEmpresa(Object data[][]) {
        this.TiendaID = Integer.parseInt(data[0][2].toString());
        this.EmpresaID = Integer.parseInt(data[1][2].toString());
    }

    public int getEmpresaID() {
        return EmpresaID;
    }

    public int getTiendaID() {
        return TiendaID;
    }

    public void setEmpresaID(int EmpresaID) {
        this.EmpresaID = EmpresaID;
    }

    public void setTiendaID(int TiendaID) {
        this.TiendaID = TiendaID;
    }
    //ssssssssssss
    public Object[][] getVectorData(){
        Object data[][]=new Object[2][3];
        data[0][0]="TiendaID";data[0][1]="int";data[0][2]=this.getTiendaID();
        data[1][0]="EmpresaID";data[1][1]="int";data[1][2]=this.getEmpresaID();
        return data;
    }
}
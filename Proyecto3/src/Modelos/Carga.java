package Modelos;

/**
 *
 * @author root4142
 */
public class Carga {
    private int CargaID;
    private String Fecha;
    private int EmpresaID;
    private String Archivo;
    private String Estado;

    public Carga() {
        this.CargaID = -1;
        this.Fecha = "";
        this.EmpresaID = -1;
        this.Archivo = "";
        this.Estado = "";
    }

    public Carga(int CargaID, String Fecha, int EmpresaID, String Archivo, String Estado) {
        this.CargaID = CargaID;
        this.Fecha = Fecha;
        this.EmpresaID = EmpresaID;
        this.Archivo = Archivo;
        this.Estado = Estado;
    }
    
    public Carga(Object data[][]) {
        this.CargaID = Integer.parseInt(data[0][2].toString());
        this.Fecha = data[1][2].toString();
        this.EmpresaID = Integer.parseInt(data[2][2].toString());
        this.Archivo = data[3][2].toString();
        this.Estado = data[4][2].toString();
    }

    public String getArchivo() {
        return Archivo;
    }

    public int getEmpresaID() {
        return EmpresaID;
    }

    public int getCargaID() {
        return CargaID;
    }

    public String getEstado() {
        return Estado;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setArchivo(String Archivo) {
        this.Archivo = Archivo;
    }

    public void setCargaID(int CargaID) {
        this.CargaID = CargaID;
    }

    public void setEmpresaID(int EmpresaID) {
        this.EmpresaID = EmpresaID;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }
    //ssssssssssss
    public Object[][] getVectorData(){
        Object data[][]=new Object[5][3];
        data[0][0]="CargaID";data[0][1]="int";data[0][2]=this.getCargaID();
        data[1][0]="Fecha";data[1][1]="string";data[1][2]=this.getFecha();
        data[2][0]="EmpresaID";data[2][1]="int";data[2][2]=this.getEmpresaID();
        data[3][0]="Archivo";data[3][1]="string";data[3][2]=this.getArchivo();
        data[4][0]="Estado";data[4][1]="string";data[4][2]=this.getEstado();
        return data;
    } 
}
    
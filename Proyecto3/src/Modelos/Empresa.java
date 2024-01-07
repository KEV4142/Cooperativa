package Modelos;

/**
 *
 * @author root4142
 */
public class Empresa {
    private int EmpresaID;
    private String Nombre;
    private int Aportacion;

    public Empresa() {
        this.EmpresaID = -1;
        this.Nombre = "";
        this.Aportacion = -1;
    }

    public Empresa(int EmpresaID, String Nombre, int Aportacion) {
        this.EmpresaID = EmpresaID;
        this.Nombre = Nombre;
        this.Aportacion = Aportacion;
    }
    
    public Empresa(Object data[][]) {
        this.EmpresaID = Integer.parseInt(data[0][2].toString());
        this.Nombre = data[1][2].toString();
        this.Aportacion = Integer.parseInt(data[2][2].toString());
    }

    public int getAportacion() {
        return Aportacion;
    }

    public int getEmpresaID() {
        return EmpresaID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setAportacion(int Aportacion) {
        this.Aportacion = Aportacion;
    }

    public void setEmpresaID(int EmpresaID) {
        this.EmpresaID = EmpresaID;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    //ssssssssssss
    public Object[][] getVectorData(){
        Object data[][]=new Object[3][3];
        data[0][0]="EmpresaID";data[0][1]="int";data[0][2]=this.getEmpresaID();
        data[1][0]="Nombre";data[1][1]="string";data[1][2]=this.getNombre();
        data[2][0]="Aportacion";data[2][1]="int";data[2][2]=this.getAportacion();
        return data;
    }
}
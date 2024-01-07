/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author root4142
 */
public class Socio {
    private int SocioID;
    private String Codigo;
    private String Nombre;
    private String Sexo;
    private String Civil;
    private String Direccion;
    private String Telefono;
    private String FechaIngreso;
    private String Estado;
    private int EmpresaID;
    private float Sueldo;
    private float Ahorro;
    private int PuestoID;

    public Socio() {
        this.SocioID = -1;
        this.Codigo="";
        this.Nombre = "";
        this.Sexo = "";
        this.Civil = "";
        this.Direccion = "";
        this.Telefono = "";
        this.FechaIngreso = "";
        this.Estado = "";
        this.EmpresaID = -1;
        this.Sueldo = -1;
        this.Ahorro = -1;
        this.PuestoID = -1;
    }

    public Socio(int SocioID,String Codigo, String Nombre, String Sexo, String Civil, String Direccion, String Telefono, String FechaIngreso, String Estado, int EmpresaID, float Sueldo, float Ahorro, int PuestoID) {
        this.SocioID = SocioID;
        this.Codigo=Codigo;
        this.Nombre = Nombre;
        this.Sexo = Sexo;
        this.Civil = Civil;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.FechaIngreso = FechaIngreso;
        this.Estado = Estado;
        this.EmpresaID = EmpresaID;
        this.Sueldo = Sueldo;
        this.Ahorro = Ahorro;
        this.PuestoID = PuestoID;
    }
    
    public Socio(Object data[][]) {
        this.SocioID = Integer.parseInt(data[0][2].toString());
        this.Codigo=data[1][2].toString();
        this.Nombre = data[2][2].toString();
        this.Sexo = data[3][2].toString();
        this.Civil = data[4][2].toString();
        this.Direccion = data[5][2].toString();
        this.Telefono = data[6][2].toString();
        this.FechaIngreso = data[7][2].toString();
        this.Estado = data[8][2].toString();
        this.EmpresaID = Integer.parseInt(data[9][2].toString());
        this.Sueldo = Float.parseFloat(data[10][2].toString());
        this.Ahorro = Float.parseFloat(data[11][2].toString());
        this.PuestoID = Integer.parseInt(data[12][2].toString());
    }

    public String getCodigo() {
        return Codigo;
    }

    public float getAhorro() {
        return Ahorro;
    }

    public String getCivil() {
        return Civil;
    }

    public String getDireccion() {
        return Direccion;
    }

    public int getEmpresaID() {
        return EmpresaID;
    }

    public String getEstado() {
        return Estado;
    }

    public String getFechaIngreso() {
        return FechaIngreso;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getPuestoID() {
        return PuestoID;
    }

    public String getSexo() {
        return Sexo;
    }

    public int getSocioID() {
        return SocioID;
    }

    public float getSueldo() {
        return Sueldo;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setAhorro(float Ahorro) {
        this.Ahorro = Ahorro;
    }

    public void setCivil(String Civil) {
        this.Civil = Civil;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public void setEmpresaID(int EmpresaID) {
        this.EmpresaID = EmpresaID;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public void setFechaIngreso(String FechaIngreso) {
        this.FechaIngreso = FechaIngreso;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setPuestoID(int PuestoID) {
        this.PuestoID = PuestoID;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public void setSocioID(int SocioID) {
        this.SocioID = SocioID;
    }

    public void setSueldo(float Sueldo) {
        this.Sueldo = Sueldo;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    //ssssssssssss
    public Object[][] getVectorData(){
        Object data[][]=new Object[13][3];
        data[0][0]="SocioID";data[0][1]="int";data[0][2]=this.getSocioID();
        data[1][0]="Codigo";data[1][1]="string";data[1][2]=this.getCodigo();
        data[2][0]="Nombre";data[2][1]="string";data[2][2]=this.getNombre();
        data[3][0]="Sexo";data[3][1]="string";data[3][2]=this.getSexo();
        data[4][0]="Civil";data[4][1]="string";data[4][2]=this.getCivil();
        data[5][0]="Direccion";data[5][1]="string";data[5][2]=this.getDireccion();
        data[6][0]="Telefono";data[6][1]="string";data[6][2]=this.getTelefono();
        data[7][0]="FechaIngreso";data[7][1]="string";data[7][2]=this.getFechaIngreso();
        data[8][0]="Estado";data[8][1]="string";data[8][2]=this.getEstado();
        data[9][0]="EmpresaID";data[9][1]="int";data[9][2]=this.getEmpresaID();
        data[10][0]="Sueldo";data[10][1]="float";data[10][2]=this.getSueldo();
        data[11][0]="Ahorro";data[11][1]="float";data[11][2]=this.getAhorro();
        data[12][0]="PuestoID";data[12][1]="int";data[12][2]=this.getPuestoID();
        return data;
    }
}
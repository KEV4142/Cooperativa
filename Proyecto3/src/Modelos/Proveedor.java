/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author root4142
 */
public class Proveedor {
    private int ProveedorID;
    private String Nombre;
    private String Direccion;
    private String Contacto;
    private String Telefono;
    private float Limite;
    private int Dias;

    public Proveedor() {
        this.ProveedorID = -1;
        this.Nombre = "";
        this.Direccion = "";
        this.Contacto = "";
        this.Telefono = "";
        this.Limite = -1;
        this.Dias = -1;
    }

    public Proveedor(int ProveedorID, String Nombre, String Direccion, String Contacto, String Telefono, float Limite, int Dias) {
        this.ProveedorID = ProveedorID;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Contacto = Contacto;
        this.Telefono = Telefono;
        this.Limite = Limite;
        this.Dias = Dias;
    }
    
    public Proveedor(Object data[][]) {
        this.ProveedorID = Integer.parseInt(data[0][2].toString());
        this.Nombre = data[1][2].toString();
        this.Direccion = data[2][2].toString();
        this.Contacto = data[3][2].toString();
        this.Telefono = data[4][2].toString();
        this.Limite = Float.parseFloat(data[5][2].toString());;
        this.Dias = Integer.parseInt(data[6][2].toString());
    }

    public String getContacto() {
        return Contacto;
    }

    public int getDias() {
        return Dias;
    }

    public String getDireccion() {
        return Direccion;
    }

    public float getLimite() {
        return Limite;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getTelefono() {
        return Telefono;
    }

    public int getProveedorID() {
        return ProveedorID;
    }

    public void setContacto(String Contacto) {
        this.Contacto = Contacto;
    }

    public void setDias(int Dias) {
        this.Dias = Dias;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public void setLimite(float Limite) {
        this.Limite = Limite;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setProveedorID(int ProveedorID) {
        this.ProveedorID = ProveedorID;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    
    //ssssssssssss
    public Object[][] getVectorData(){
        Object data[][]=new Object[7][3];
        data[0][0]="ProveedorID";data[0][1]="int";data[0][2]=this.getProveedorID();
        data[1][0]="Nombre";data[1][1]="string";data[1][2]=this.getNombre();
        data[2][0]="Direccion";data[2][1]="string";data[2][2]=this.getDireccion();
        data[3][0]="Contacto";data[3][1]="string";data[3][2]=this.getContacto();
        data[4][0]="Telefono";data[4][1]="string";data[4][2]=this.getTelefono();
        data[5][0]="Limite";data[5][1]="string";data[5][2]=this.getLimite();
        data[6][0]="Dias";data[6][1]="int";data[6][2]=this.getDias();
        return data;
    }
}
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author root4142
 */
public class Puesto {
    private int PuestoID;
    private String Nombre;

    public Puesto() {
        this.PuestoID = -1;
        this.Nombre = "";
    }

    public Puesto(int PuestoID, String Nombre) {
        this.PuestoID = PuestoID;
        this.Nombre = Nombre;
    }
    
    public Puesto(Object data[][]) {
        this.PuestoID = Integer.parseInt(data[0][2].toString());
        this.Nombre = data[1][2].toString();
    }

    public String getNombre() {
        return Nombre;
    }

    public int getPuestoID() {
        return PuestoID;
    }

    public void setPuestoID(int PuestoID) {
        this.PuestoID = PuestoID;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
   //ssssssssssss
    public Object[][] getVectorData(){
        Object data[][]=new Object[2][3];
        data[0][0]="PuestoID";data[0][1]="int";data[0][2]=this.getPuestoID();
        data[1][0]="Nombre";data[1][1]="string";data[1][2]=this.getNombre();
        return data;
    } 
}
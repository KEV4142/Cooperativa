/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author root4142
 */
public class Moneda {
    private int MonedaID;
    private String Nombre;

    public Moneda() {
        this.MonedaID = -1;
        this.Nombre = "";
    }

    public Moneda(int MonedaID, String Nombre) {
        this.MonedaID = MonedaID;
        this.Nombre = Nombre;
    }
    
    public Moneda(Object data[][]) {
        this.MonedaID = Integer.parseInt(data[0][2].toString());
        this.Nombre = data[1][2].toString();
    }

    public int getMonedaID() {
        return MonedaID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setMonedaID(int MonedaID) {
        this.MonedaID = MonedaID;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    //ssssssssssss
    public Object[][] getVectorData(){
        Object data[][]=new Object[2][3];
        data[0][0]="MonedaID";data[0][1]="int";data[0][2]=this.getMonedaID();
        data[1][0]="Nombre";data[1][1]="string";data[1][2]=this.getNombre();
        return data;
    }
}
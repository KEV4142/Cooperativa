/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.util.Vector;

/**
 *
 * @author root4142
 */
public class Banco {
    private int BancoID;
    private String Nombre;
    public Banco()
    {
        BancoID=-1;
        Nombre="";
    }
    
//    sssss
    public Banco(Object data[][])
    {
        BancoID= Integer.parseInt(data[0][2].toString());
        Nombre=data[1][2].toString();
    }
    public Banco(int banco_id, String nombre_Banco) {
        this.BancoID = banco_id;
        this.Nombre = nombre_Banco;
    }

    public int getBanco_id() {
        return BancoID;
    }

    public String getNombre_Banco() {
        return Nombre;
    }

    public void setBanco_id(int banco_id) {
        this.BancoID = banco_id;
    }

    public void setNombre_Banco(String nombre_Banco) {
        this.Nombre = nombre_Banco;
    }

    
    
//ssssssssssss
    public Object[][] getVectorData(){
        Object data[][]=new Object[2][3];
        data[0][0]="BancoID";data[0][1]="int";data[0][2]=this.getBanco_id();
        data[1][0]="Nombre";data[1][1]="string";data[1][2]=this.getNombre_Banco();
        return data;
    }
}

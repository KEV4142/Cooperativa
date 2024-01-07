/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author root4142
 */
public class Cooperativa {
    private int CooperativaID;
    private String Nombre;
    private int PlazoAnticipos;
    private int PlazoPrestamos;
    private float InteresFactura;
    private float InteresPrestamo;

    public Cooperativa() {
        this.CooperativaID = -1;
        this.Nombre = "";
        this.PlazoAnticipos = -1;
        this.PlazoPrestamos = -1;
        this.InteresFactura = -1;
        this.InteresPrestamo = -1;
    }

    public Cooperativa(int CooperativaID, String Nombre, int PlazoAnticipos, int PlazoPrestamos, float InteresFactura, float InteresPrestamo) {
        this.CooperativaID = CooperativaID;
        this.Nombre = Nombre;
        this.PlazoAnticipos = PlazoAnticipos;
        this.PlazoPrestamos = PlazoPrestamos;
        this.InteresFactura = InteresFactura;
        this.InteresPrestamo = InteresPrestamo;
    }

    public Cooperativa(Object data[][]) {
        this.CooperativaID = Integer.parseInt(data[0][2].toString());
        this.Nombre = data[1][2].toString();
        this.PlazoAnticipos = Integer.parseInt(data[2][2].toString());
        this.PlazoPrestamos = Integer.parseInt(data[3][2].toString());
        this.InteresFactura = Float.parseFloat(data[4][2].toString());
        this.InteresPrestamo = Float.parseFloat(data[5][2].toString());
    }

    public int getCooperativaID() {
        return CooperativaID;
    }

    public float getInteresFactura() {
        return InteresFactura;
    }

    public float getInteresPrestamo() {
        return InteresPrestamo;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getPlazoAnticipos() {
        return PlazoAnticipos;
    }

    public int getPlazoPrestamos() {
        return PlazoPrestamos;
    }

    public void setCooperativaID(int CooperativaID) {
        this.CooperativaID = CooperativaID;
    }

    public void setInteresFactura(int InteresFactura) {
        this.InteresFactura = InteresFactura;
    }

    public void setInteresPrestamo(float InteresPrestamo) {
        this.InteresPrestamo = InteresPrestamo;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setPlazoAnticipos(int PlazoAnticipos) {
        this.PlazoAnticipos = PlazoAnticipos;
    }

    public void setPlazoPrestamos(int PlazoPrestamos) {
        this.PlazoPrestamos = PlazoPrestamos;
    }
    
    //ssssssssssss
    public Object[][] getVectorData(){
        Object data[][]=new Object[6][3];
        data[0][0]="CooperativaID";data[0][1]="int";data[0][2]=this.getCooperativaID();
        data[1][0]="Nombre";data[1][1]="string";data[1][2]=this.getNombre();
        data[2][0]="PlazoAnticipos";data[2][1]="int";data[2][2]=this.getPlazoAnticipos();
        data[3][0]="PlazoPrestamos";data[3][1]="int";data[3][2]=this.getPlazoPrestamos();
        data[4][0]="InteresFactura";data[4][1]="float";data[4][2]=this.getInteresFactura();
        data[5][0]="InteresPrestamo";data[5][1]="float";data[5][2]=this.getInteresPrestamo();
        return data;
    }   
}
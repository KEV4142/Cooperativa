package Controller;

import Modelos.Anticipo;
import Modelos.Cuota;
import Modelos.Factura;
import Modelos.Prestamo;
import Utilerias.interfacex;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Vector;

/**
 *
 * @author root4142
 */
public class VerificacionDeCredito {
    private int SocioID=-1;
    private int TipoCredito=-1;
    private ControlUniversal control;
    private interfacex inter=new interfacex();
    private Anticipo anticipo;
    private Prestamo prestamo;
    private Factura factura;
    private Vector<Cuota> Cuotas;
    
    public VerificacionDeCredito() {
    }
    public VerificacionDeCredito(int SocioID,ControlUniversal cont) {
        control=cont;
        this.SocioID=SocioID;
        if(verificaAnticipo(SocioID)){
            setTipoCredito(1);
        }
        else if(verificaPrestamo(SocioID)){
            setTipoCredito(2);
        }
        else if(verificaFactura(SocioID)){
            setTipoCredito(3);
        }
    }
    
    public boolean verificaAnticipo(int SocioID){
        boolean res=false;
        anticipo=new Anticipo();
        Vector<Object[][]> kk =control.seekUniversalVector2(anticipo.getVectorData(), "Anticipo","SocioID="+SocioID);
        if (!kk.isEmpty()) {
            anticipo=new Anticipo(kk.lastElement());
            if(anticipo.getEstado().equals("D")){
                res=false;
            }else{
                res=true;
            }
        }
        return res;
    }
    public boolean verificaPrestamo(int SocioID){
        boolean res=false;
        prestamo=new Prestamo();
        Vector<Object[][]> kk =control.seekUniversalVector2(prestamo.getVectorData(), "Prestamo","SocioID="+SocioID);
        if (!kk.isEmpty()) {
            prestamo=new Prestamo(kk.lastElement());
            Cuota cuota=new Cuota();
            Vector<Object[][]> kkk = control.seekUniversalVector2(cuota.getVectorData(), "Cuota", "PrestamoID="+prestamo.getPrestamoID() );
            Cuotas=new Vector<>();
            if (!kkk.isEmpty()) {
                for (Object[][] ok : kkk) {
                    cuota=new Cuota(ok);
                    if(cuota.getEstado().equals("P")){
                        res=true;
                        break;
                    }else{
                        res=false;
                    }
                }
                    for (Object[][] ok : kkk) {
                        cuota = new Cuota(ok);
                        Cuotas.add(cuota);
                    }
                
            }
        }
        return res;
    }
    public boolean verificaFactura(int SocioID){
        boolean res=false;
        factura=new Factura();
        Vector<Object[][]> kk =control.seekUniversalVector2(factura.getVectorData(), "Factura","SocioID="+SocioID);
        if (!kk.isEmpty()) {
            factura=new Factura(kk.lastElement());
            if(factura.getEstado().equals("D")){
                res=false;
            }else{
                res=true;
            }
        }
        return res;
    }
    
    /**
     * Puede ser :
     *      1-Anticipo
     *      2-Prestamo
     *      3-Factura
     * @param Tipo as Int
     */
    public void setTipoCredito(int Tipo){
        TipoCredito=Tipo;
    }

    public int getTipoCredito() {
        return TipoCredito;
    }

    public void setSocioID(int SocioID) {
        this.SocioID = SocioID;
    }

    public int getSocioID() {
        return SocioID;
    }

    public Anticipo getAnticipo() {
        return anticipo;
    }

    public Factura getFactura() {
        return factura;
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }

    public Vector<Cuota> getCuotas() {
        return Cuotas;
    }
    
    
}

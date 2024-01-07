package Controller;
import Controller.Conexion;
import java.lang.Object;
import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
/**
 *
 * @author root4142
 */
public class ControlUniversal {
    private Conexion coneccion;
    public ControlUniversal(Conexion con) {
        coneccion=con;
    }
    public boolean seekUniversal(String Sql) {
        boolean o = false;
        String sql = Sql;
        try {
            Statement stm = coneccion.getConnect().createStatement(1005, 1008);
            ResultSet save = stm.executeQuery(sql);
            if (save.next()) {
                o = true;
            } else {
                o = false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return o;
    }
    
    public boolean seekUniversal(String Tabla, String Campokey, String key) {
        boolean o = false;
        String sql = "SELECT " + Campokey + " FROM " + Tabla + " WHERE " + Campokey + "=" + key + ";";
        try {
            Statement stm = coneccion.getConnect().createStatement(1005, 1008);
            ResultSet save = stm.executeQuery(sql);
            if (save.next()) {
                o = true;
            } else {
                o = false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return o;
    }
    
    public Vector<Object [][]> seekUniversalVector(Object[][] data,String Tabla,String key)
    {
        Vector<Object [][]> ret=new Vector<>();
        String sql="SELECT * FROM "+Tabla+" WHERE "+data[0][0]+"="+key+";";
            try{
                Statement stm = coneccion.getConnect().createStatement(1005, 1008);
                ResultSet save=stm.executeQuery(sql);
                while(save.next()){
                    Object o[][] = null;
                    ResultSetMetaData meta=save.getMetaData();
                    int col=meta.getColumnCount();
                    o=new Object[col][3];
                    for(int x=0;x<col;x++){
                        o[x][0]=meta.getColumnName(x+1);
                        String coltipo=meta.getColumnTypeName(x+1);
                        if((coltipo.equals("VARCHAR")) || (coltipo.equals("DATETIME"))) {
                            o[x][1]="string";
                        }
                        else {
                            o[x][1]=coltipo.toLowerCase();
                        }
                        o[x][2]=save.getString(x+1);
                    }
                    ret.add(o);
                }
//                else
//                    JOptionPane.showMessageDialog(null, "Registro no existe");
                }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            return ret;
        }
    
    public Vector<Object [][]> seekUniversalVector2(Object[][] data,String Tabla,String Condicion)
    {
        Vector<Object [][]> ret=new Vector<>();
        String sql="SELECT * FROM "+Tabla+" WHERE "+Condicion+";";
            try {
            Statement stm = coneccion.getConnect().createStatement(1005, 1008);
            ResultSet save = stm.executeQuery(sql);
            while (save.next()) {
                Object o[][] = null;
                ResultSetMetaData meta = save.getMetaData();
                int col = meta.getColumnCount();
                o = new Object[col][3];
                for (int x = 0; x < col; x++) {
                    o[x][0] = meta.getColumnName(x + 1);
                    String coltipo = meta.getColumnTypeName(x + 1);
                    if ((coltipo.equals("VARCHAR")) || (coltipo.equals("DATETIME"))) {
                        o[x][1] = "string";
                    } else {
                        o[x][1] = coltipo.toLowerCase();
                    }
                    o[x][2] = save.getString(x + 1);
                }
                ret.add(o);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
            return ret;
        }
    
    public Object [][] seekUniversal(Object[][] data,String Tabla,String key)
    {
        Object o[][] = null;
        String sql="SELECT * FROM "+Tabla+" WHERE "+data[0][0]+"="+key+";";
            try{
                Statement stm = coneccion.getConnect().createStatement(1005, 1008);
                ResultSet save=stm.executeQuery(sql);
                if(save.next()){
                    ResultSetMetaData meta=save.getMetaData();
                    int col=meta.getColumnCount();
                    o=new Object[col][3];
                    for(int x=0;x<col;x++){
                        o[x][0]=meta.getColumnName(x+1);
                        String coltipo=meta.getColumnTypeName(x+1);
                        if((coltipo.equals("VARCHAR")) || (coltipo.equals("DATETIME"))) {
                            o[x][1]="string";
                        }
                        else {
                            o[x][1]=coltipo.toLowerCase();
                        }
                        o[x][2]=save.getString(x+1);
                    }
                }
                else {
                    JOptionPane.showMessageDialog(null, "Registro no existe");
                }
                }
            catch(SQLException e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            return o;
        }
    public void insUniversal(Object[][] data,String Tabla)
    {
        String info="VALUES(";
        String sql="INSERT INTO "+Tabla;
        String campo="(";
        if ((data[0][2].equals(-1)) || (data[0][2].equals(""))) {
            JOptionPane.showMessageDialog(null, "No se puede guardar se encuentra vacio");
        }
        else{
            for(int x=0;x<data.length;x++){
                campo=campo+""+data[x][0]+",";
                if(data[x][1].equals("int") || data[x][1].equals("float") || data[x][1].equals("boolean")) {
                    info=info+data[x][2]+",";
                }
                else {
                    info=info+"'"+data[x][2]+"',";
                }
            }
            campo=campo.substring(0,campo.length()-1)+")";
            info=info.substring(0,info.length()-1)+")";
            sql=sql+campo+info+";";
            try{
//                System.out.println(sql);
                Statement stm = coneccion.getConnect().createStatement(1005, 1008);
                boolean save=stm.execute(sql);
                if (save==false) {
                    JOptionPane.showMessageDialog(null, "Registro Guardado");
                }
                }
            catch(SQLException e){
                JOptionPane.showMessageDialog(null, e.getMessage(),"ERROR-INS",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    public boolean insUniversal2(Object[][] data,String Tabla)
    {
        boolean res=false;
        String info="VALUES(";
        String sql="INSERT INTO "+Tabla;
        String campo="(";
        if ((data[0][2].equals(-1)) || (data[0][2].equals(""))) {
            JOptionPane.showMessageDialog(null, "No se puede guardar se encuentra vacio");
        }
        else{
            for(int x=0;x<data.length;x++){
                campo=campo+""+data[x][0]+",";
                if(data[x][1].equals("int") || data[x][1].equals("float") || data[x][1].equals("boolean")) {
                    info=info+data[x][2]+",";
                }
                else {
                    info=info+"'"+data[x][2]+"',";
                }
            }
            campo=campo.substring(0,campo.length()-1)+")";
            info=info.substring(0,info.length()-1)+")";
            sql=sql+campo+info+";";
            try{
                Statement stm = coneccion.getConnect().createStatement(1005, 1008);
                boolean save=stm.execute(sql);
                if (save==false){
//                    JOptionPane.showMessageDialog(null, "Registro Guardado");
                    res=true;
                }}
            catch(SQLException e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        return res;
    }
    
    public boolean insUniversal3(Object[][] data,String Tabla)
    {
        boolean res=false;
        String info="VALUES(";
        String sql="INSERT INTO "+Tabla;
        String campo="(";
        if ((data[0][2].equals(-1)) || (data[0][2].equals(""))) {
            JOptionPane.showMessageDialog(null, "No se puede guardar se encuentra vacio");
        }
        else{
            for(int x=0;x<data.length;x++){
                campo=campo+""+data[x][0]+",";
                if(data[x][1].equals("int") || data[x][1].equals("float") || data[x][1].equals("boolean") || data[x][1].equals("null")) {
                    info=info+data[x][2]+",";
                }
                else {
                    info=info+"'"+data[x][2]+"',";
                }
            }
            campo=campo.substring(0,campo.length()-1)+")";
            info=info.substring(0,info.length()-1)+")";
            sql=sql+campo+info+";";
            try{
                Statement stm = coneccion.getConnect().createStatement(1005, 1008);
                boolean save=stm.execute(sql);
                if (save==false){
//                    JOptionPane.showMessageDialog(null, "Registro Guardado");
                    res=true;
                }}
            catch(SQLException e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        return res;
    }
    public void updUniversal(Object[][] data,String Tabla,String key)
    {
        String info="VALUES(";
        String sql="UPDATE "+Tabla+" SET ";
        String campo="(";
        if (data[0][2].equals(-1)) {
            JOptionPane.showMessageDialog(null, "No se puede guardar se encuentra vacio");
        }
        else{
            for(int x=1;x<data.length;x++){
                sql=sql+data[x][0]+"=";
                if(data[x][1].equals("int") || data[x][1].equals("float") || data[x][1].equals("boolean")) {
                    sql=sql+data[x][2]+",";
                }
                else {
                    sql=sql+"'"+data[x][2]+"',";
                }
            }
            sql=sql.substring(0,sql.length()-1)+" WHERE "+data[0][0]+"="+key+";";
            try{
                Statement stm = coneccion.getConnect().createStatement(1005, 1008);
                boolean save=stm.execute(sql);
                if (save==false) {
                    JOptionPane.showMessageDialog(null, "Registro Actualizado");
                }
                }
            catch(SQLException e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }
    public boolean updUniversal2(Object[][] data,String Tabla,String key)
    {
        boolean res=false;
        String info="VALUES(";
        String sql="UPDATE "+Tabla+" SET ";
        String campo="(";
        if (data[0][2].equals(-1)) {
            JOptionPane.showMessageDialog(null, "No se puede guardar se encuentra vacio");
        }
        else{
            for(int x=1;x<data.length;x++){
                sql=sql+data[x][0]+"=";
                if(data[x][1].equals("int") || data[x][1].equals("float") || data[x][1].equals("boolean")) {
                    sql=sql+data[x][2]+",";
                }
                else {
                    sql=sql+"'"+data[x][2]+"',";
                }
            }
            sql=sql.substring(0,sql.length()-1)+" WHERE "+data[0][0]+"="+key+";";
            try{
                Statement stm = coneccion.getConnect().createStatement(1005, 1008);
                boolean save=stm.execute(sql);
                if (save==false) {
                    res=true;
                }
                }
            catch(SQLException e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        return res;
    }
    public void delUniversal(Object[][] data,String Tabla,String key)
    {
        String sql="DELETE FROM "+Tabla+" WHERE "+data[0][0]+"="+key+";";
            try{
                Statement stm = coneccion.getConnect().createStatement(1005, 1008);
                boolean save=stm.execute(sql);
                if (save==false) {
                    JOptionPane.showMessageDialog(null, "Registro Borrado");
                }
                }
            catch(SQLException e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    public boolean delUniversal2(String Tabla,String Condicion)
    {
        boolean res=false;
        String sql="DELETE FROM "+Tabla+" WHERE "+Condicion+";";
            try{
                Statement stm = coneccion.getConnect().createStatement(1005, 1008);
                boolean save=stm.execute(sql);
                if (save==false) {
                    res=true;
                }
                }
            catch(SQLException e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            return res;
        }
    
    public int autoUniversal(String Tabla){
        int auto=-1;
        try{
            Statement stm = coneccion.getConnect().createStatement(1005, 1008);
            ResultSet save=stm.executeQuery("select * from "+Tabla);
            boolean last = save.last();
            if(last) {
                auto=save.getInt(1)+1;
            }
            else {
                auto=1;
            }
        }
            catch(SQLException e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        return auto;
    }
    
    public int autoUniversal2(String Tabla,String key){
        int auto=-1;
        try{
            Statement stm = coneccion.getConnect().createStatement(1005, 1008);
            ResultSet save=stm.executeQuery("select * from "+Tabla+" order by "+key+";");
            boolean last = save.last();
            if(last) {
                auto=save.getInt(key)+1;
            }
            else {
                auto=1;
            }
        }
            catch(SQLException e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        return auto;
    }
    
    public String getFechaSistema(){
        String fecha=null;
        String sql="";
        if(coneccion.isMssql()){
            sql="select GETDATE() AS DAA";
        }
        else{
            sql="select CURDATE() AS DAA";
        }
        try{
            Statement stm = coneccion.getConnect().createStatement(1005, 1008);
            ResultSet save=stm.executeQuery(sql);
            save.next();
            fecha=save.getString("DAA");
        }
            catch(SQLException e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        return fecha;
    }
    public Date getFechaSistemaSql(){
        Date fecha=null;
        String sql="";
        if(coneccion.isMssql()){
            sql="select GETDATE() AS DAA";
        }
        else{
            sql="select CURDATE() AS DAA";
        }
        try{
            Statement stm = coneccion.getConnect().createStatement(1005, 1008);
            ResultSet save=stm.executeQuery(sql);
            save.next();
            fecha=save.getDate("DAA");
        }
            catch(SQLException e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        return fecha;
    }
    public DefaultComboBoxModel getModelo(String Tabla,String CampoKey,String CampoBuscado,String key){
        DefaultComboBoxModel modelo=null;
        Vector v=new Vector();
        String sql="SELECT * FROM "+Tabla+" WHERE "+CampoKey+"="+key+";";
        Statement stm;
        try {
            stm = coneccion.getConnect().createStatement(1005, 1008);
            ResultSet rs=stm.executeQuery(sql);
            while(rs.next())
            {
                v.addElement(rs.getString(CampoBuscado));
            }
            modelo=new DefaultComboBoxModel(v);
        } catch (SQLException ex) {
            Logger.getLogger(ControlUniversal.class.getName()).log(Level.SEVERE, null, ex);
        }
        return modelo;
    }
}
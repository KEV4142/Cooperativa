package Controller;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;


/**
 *
 * @author root4142
 */
public class Conexion {
    private Connection con;
    private boolean conectado=false,mysql=false,mssql=false;

    public Conexion(){
        try{
//            Class.forName("com.mysql.jdbc.Driver");
//            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Agricola","root","Z80");
            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=Agricola;user=ruut;password=Z80;";

            con = DriverManager.getConnection(url);
            conectado = true;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public Conexion(String Servidor, String Usuario, String Contraseña){
        try{
//            Class.forName("com.mysql.jdbc.Driver");
//            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Agricola","root","Z80");
            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://"+Servidor+":1433;databaseName=Agricola;user="+Usuario+";password="+Contraseña+";";
            mssql=true;
                    
            con = DriverManager.getConnection(url);
            conectado = true;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println(e.getMessage());
        }
    }
    public boolean isConectado(){
        return conectado;
    }
    public Connection getConnect(){ return con;}

    public boolean isMssql() {
        return mssql;
    }
    
}
package conexion;

import java.sql.DriverManager;
import java.sql.Connection;

public class ConexionDB {
    
    private final String DB = "ProyectosConstruccion.db";
    private final String URL = "jdbc:sqlite:"+DB;
    Connection conn = null;
    
    public Connection conectar(){
        
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection(URL);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
    
}

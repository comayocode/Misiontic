package com.reto5;

import java.sql.*;

public class ConexionDB {
    
    private final String DB = "C:/Users/ronal/Desktop/Estudio/Misiontic2022/ciclo_2/01_retos/reto_5/ProyectosConstruccion.db";
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

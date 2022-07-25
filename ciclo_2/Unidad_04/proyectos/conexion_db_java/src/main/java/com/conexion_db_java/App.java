package com.conexion_db_java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class App
{
    public static void main( String[] args ) {
        conectarDB();
    }

    public static void conectarDB(){
        String url = "jdbc:sqlite:hr.db";
        try{
            //Crear conexión
            Connection conn = DriverManager.getConnection(url);
            //Validar conexión
            if(conn != null){
                System.out.println("Conexión existosa");
                //Crear objeto para ejecutar consultas sql
                Statement st = conn.createStatement();
                //Ejecutar consulta
                String query = "SELECT * FROM employees";
                ResultSet result_1 = st.executeQuery(query); //Retorna el resultado de la consulta `query`
                //Iterar result_t
                while (result_1.next()){
                    //Acceder a los valores de la columnas
                    String nombre = result_1.getString("first_name");
                    System.out.println("Nombre: " + nombre);
                }

            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

package com.conexion_db_java;

import java.sql.*;

public class App {
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
                insertJob(conn);
                selectAllJobs(st);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void selectAllEmployees(Statement st) throws Exception{
        //Ejecutar consulta
        String query = "SELECT * FROM employees";
        ResultSet result_1 = st.executeQuery(query); //Retorna el resultado de la consulta `query`
        String info = "";
        //Iterar result_t
        while (result_1.next()){
            //Acceder a los valores de la columnas
            String nombre = result_1.getString("first_name");
            String apellido = result_1.getString("last_name");
            info += "Nombre: " + nombre;
            info += "\nApellido: " + apellido;
            info += "\n----------------\n";
        }
        System.out.println(info);
    }

    public static void insertJob(Connection connn) throws SQLException{
        String job_title = "Developer";
        int min_salary = 2000;
        int max_salary = 15000;
        //Preparar consulta SQL
        PreparedStatement pst = connn.prepareStatement("INSERT INTO jobs(job_title, min_salary, max_salary) VALUES(?, ?, ?)");
        //Setear valores de consulta
        pst.setString(1, job_title);
        pst.setInt(2, min_salary);
        pst.setInt(3, max_salary);
        //Ejecutar la consulta
        pst.executeUpdate();
    }

    public static void selectAllJobs(Statement st) throws SQLException {
        ResultSet result = st.executeQuery("SELECT * FROM jobs");
        while (result.next()){
            System.out.println("Jobs: " + result.getString("job_title"));
        }
    }
}

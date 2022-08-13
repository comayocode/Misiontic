
package com.reto5;

import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.ResultSetMetaData;

public class ConsultasLideres {
    
    public static void verDatos(){
        try {
            //Crear modelo de la tabla
            DefaultTableModel modelo = new DefaultTableModel();
            ReportesLideres.jtReportesLideres.setModel(modelo);
            
            //Creación de varibales para preparar la conexión
            PreparedStatement ps = null;
            ResultSet rs = null;
            ConexionDB con = new ConexionDB(); //Crear objeto conexion
            Connection conn = con.conectar(); //Llamar la conexión
            
            String consulta = "SELECT ID_Lider, Nombre, Primer_Apellido, Ciudad_Residencia FROM Lider ORDER BY Ciudad_Residencia ASC"; //Consulta primer reporte
            ps = conn.prepareStatement(consulta); //Ejecutar la consulta
            rs = ps.executeQuery(); //Traer datos de la consulta
           
            ResultSetMetaData rsMd = rs.getMetaData(); //"Pasarle" el resultado de la consulta
            int cantidaColumnas = rsMd.getColumnCount(); // Guardar el número de columns
            
            //Añadir las columnas al jtable
            modelo.addColumn("ID Lider");
            modelo.addColumn("Nombre");
            modelo.addColumn("Apellido");
            modelo.addColumn("Ciudad");
            
            //Recorrer los datos
            while(rs.next()){
                Object [] filas = new Object[cantidaColumnas];
                
                //Pasar los datos al objeto filas
                for(int i = 0; i<cantidaColumnas; i++){
                    filas[i] = rs.getObject(i + 1);
                }
                //Agregar datos al modelo
                modelo.addRow(filas);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}

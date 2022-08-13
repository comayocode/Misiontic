
package modelo;

import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.ResultSetMetaData;
import conexion.ConexionDB;
import javax.swing.table.TableColumnModel;
import vista.VistaLideres;
import static vista.VistaLideres.jtReportesLideres;

public class ConsultaLideres {
    
    public static void verDatos(){
        try {
            //Crear objeto para colorear celds intercaladas
            //Crear modelo de la tabla
            DefaultTableModel modelo = new DefaultTableModel(){
                
                //Cncelar edición de celdas
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            
            VistaLideres.jtReportesLideres.setModel(modelo);
      
            
            //Instanciar el modelo de las columnas para cambiar tamaño
            TableColumnModel columnModel = VistaLideres.jtReportesLideres.getColumnModel(); 
            
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
            modelo.addColumn("ID");
            modelo.addColumn("Nombre");
            modelo.addColumn("Apellido");
            modelo.addColumn("Ciudad");
            
            
            //Establecer tamaño de columnas
            columnModel.getColumn(0).setPreferredWidth(50);
            columnModel.getColumn(1).setPreferredWidth(200);
            columnModel.getColumn(2).setPreferredWidth(220);
            columnModel.getColumn(3).setPreferredWidth(210);
            
            //Nueva instancia de la clase que contiene el formato
            ColorIntercaladoCeldasJTable c = new ColorIntercaladoCeldasJTable();
        
            //Se obtiene la tabla y se establece el formato para cada tipo de dato
            jtReportesLideres.setDefaultRenderer(Double.class, c); 
            jtReportesLideres.setDefaultRenderer(String.class, c); 
            jtReportesLideres.setDefaultRenderer(Integer.class, c);
        
            
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
            
            
            //VistaLideres.jtReportesLideres.getColumnModel().getColumn(0).setCellRenderer(color);
            
            //Colorear celdas
            for (int i = 0; i<VistaLideres.jtReportesLideres.getColumnCount(); i++){
                VistaLideres.jtReportesLideres.getColumnModel().getColumn(i).setCellRenderer(c);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        //ColorIntercaladoCeldasJTable color = new ColorIntercaladoCeldasJTable();
        //VistaLideres.jtReportesLideres.getColumnModel().getColumn(0).setCellRenderer(color);
    }
    
}

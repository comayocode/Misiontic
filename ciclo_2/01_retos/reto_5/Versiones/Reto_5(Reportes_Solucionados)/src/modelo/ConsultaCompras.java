package modelo;

import conexion.ConexionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import vista.VistaCompras;
import static vista.VistaCompras.jtbReportesCompras;

public class ConsultaCompras {
    public static void verDatos(){
        try {
            //Crear modelo de la tabla
            DefaultTableModel modelo = new DefaultTableModel(){
                
                //Desabilitar la edicion en celdas
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            jtbReportesCompras.setModel(modelo);
            
            //Instanciar el modelo de las columnas para cambiar tamaño
            TableColumnModel columnModel = VistaCompras.jtbReportesCompras.getColumnModel(); 
            
            //Creación de varibales para preparar la conexión
            PreparedStatement ps = null;
            ResultSet rs = null;
            ConexionDB con = new ConexionDB(); //Crear objeto conexion
            Connection conn = con.conectar(); //Llamar la conexión
            
            String consulta = "SELECT c.ID_Compra, p.Constructora, p.Banco_Vinculado FROM Compra c INNER JOIN Proyecto p ON c.ID_Proyecto = p.ID_Proyecto WHERE c.Proveedor = 'Homecenter' AND p.Ciudad = 'Salento';"; //Consulta segundo reporte
            
            ps = conn.prepareStatement(consulta); //Ejecutar la consulta
            rs = ps.executeQuery(); //Traer datos de la consulta
           
            ResultSetMetaData rsMd = rs.getMetaData(); //"Pasarle" el resultado de la consulta
            int cantidaColumnas = rsMd.getColumnCount(); // Guardar el número de columns
            
            //Añadir las columnas al jtable
            modelo.addColumn("ID");
            modelo.addColumn("Contructora");
            modelo.addColumn("Banco vinculado");
            
            //Establecer tamaño de columnas
            columnModel.getColumn(0).setPreferredWidth(50);
            columnModel.getColumn(1).setPreferredWidth(200);
            columnModel.getColumn(2).setPreferredWidth(220);
            
            
            //Nueva instancia de la clase que contiene el formato
            ColorIntercaladoCeldasJTable c = new ColorIntercaladoCeldasJTable();
        
            //Se obtiene la tabla y se establece el formato para cada tipo de dato
            jtbReportesCompras.setDefaultRenderer(Double.class, c); 
            jtbReportesCompras.setDefaultRenderer(String.class, c); 
            jtbReportesCompras.setDefaultRenderer(Integer.class, c);
        
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
            for (int i = 0; i<VistaCompras.jtbReportesCompras.getColumnCount(); i++){
                jtbReportesCompras.getColumnModel().getColumn(i).setCellRenderer(c);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        //ColorIntercaladoCeldasJTable color = new ColorIntercaladoCeldasJTable();
        //VistaLideres.jtReportesLideres.getColumnModel().getColumn(0).setCellRenderer(color);
    }
}

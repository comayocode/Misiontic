package modelo;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

public class ColorIntercaladoCeldasJTable extends DefaultTableCellRenderer{
           
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        
        //campoTexto nos sirve como componente dentro de la tabla, es cada una de las celdas de la misma
        JFormattedTextField campoTexto = new JFormattedTextField();
        //Se establece primeramente un borde vacío o sin borde
        campoTexto.setBorder(BorderFactory.createEmptyBorder());
        
        //Establecer valores en las celdas dependiendo de su tipo de dato
        //Es para renderizar el texto encima del color impreso
        if(value instanceof String){
            //System.out.println("String value = " + value);
            campoTexto.setText((String)value);
        }
        
        if(value instanceof Integer){
            //System.out.println("Integer value = " + value);
            campoTexto.setText(value+"");
            //Centrar texto
            //campoTexto.setHorizontalAlignment(SwingConstants.CENTER);
        }
        
        if(value instanceof Double){
            //System.out.println("Double value = " + value);
            Double valor = (Double)value;
            campoTexto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0")))); 
            //Se aplica alineación a la izquierda
            campoTexto.setHorizontalAlignment(SwingConstants.CENTER); 
            campoTexto.setValue(valor);
            
            //Si el valor es negativo se elimina el símbolo - y se establece un fondo de color rojo
            if(valor.compareTo(new Double(0))==-1) { 
              campoTexto.setText(campoTexto.getText().replace("-", "")); 
              campoTexto.setBackground(new Color(0xFE899B)); 
              campoTexto.setOpaque(true); 
            }
        }
        
        //Se le pas el método evluarPar para colorear las celdas pares e impares
        if(evlauarPar(row)){
            //campoTexto.setBackground(new Color(233, 218, 193)); //Color naranja
            campoTexto.setBackground(new Color (0xffffff));
            campoTexto.setForeground(Color.BLACK);
        }else{
            //campoTexto.setBackground(new Color (247, 236, 222));// COlor naranja
            campoTexto.setBackground(new Color (0xe6e6e6));
            campoTexto.setForeground(Color.BLACK);
        }
        
        //Si el campo está seleccionado se establece un color para distinguir
        if(isSelected){ 
            campoTexto.setBackground(new Color(0xD61C4E)); //ORIGINAL ROSA
            //campoTexto.setBackground(new Color(0x3B1347)); //MORADO OSCURO
            
            //PROBANDO COLORES
            //campoTexto.setBackground(new Color(0x1E89CC));
            //campoTexto.setForeground(Color.WHITE);
        }
        
        //Cambiar Fontsize las filas
        campoTexto.setFont(new Font("Roboto", Font.PLAIN, 15));
        
        
        //Por último se devuelve el componente ya con el formato establecido para mostrarlo en la tabla
        return campoTexto;
    }
    
    //Método para establecer los numeros pares e impares
    public boolean evlauarPar(int numero){
        return (numero %2==0);
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.UIManager;
import vista.Menu;
public class PruebaReto5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            JFrame.setDefaultLookAndFeelDecorated(true);
            JDialog.setDefaultLookAndFeelDecorated(true);
            
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        Menu m = new Menu();
        m.setVisible(true);
        
        //vista.VistaLideres v = new VistaLideres();
        //v.setVisible(true);
    }
    
}

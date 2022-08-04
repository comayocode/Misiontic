import java.sql.ResultSet;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) {
        ConexionDB objConn = new ConexionDB();
        crearUniversidad(objConn);
        mostrarUniversidades(objConn);

    }
    public static void crearUniversidad(ConexionDB objCon){
        Universidad objUni = new Universidad("Misiontic","54321","CRA 10","misiontic@misiontic.edu.co");
        boolean insert = objUni.insert(objCon.getConn());
        if(insert){
            System.out.println("Universidad registrada");
        }else{
            System.out.println("Ups");
        }
    }

    public static void mostrarUniversidades(ConexionDB objConn) {
        try {
            ResultSet rs = Universidad.getUniversidades(objConn.getConn());
            String info = "---- UNIVERSIDADES ----\n";

            while (rs.next()){
                String nit = rs.getString("nit");
                String nombre = rs.getString("nombre");
                info += "\nNit: " + nit;
                info += "\nNombre: " + nombre;
                info += "\n--------------------";
            }
            System.out.println(info);
        }catch (SQLException e){
            e.printStackTrace();
            //System.out.println("ERROR: " + e);
        }
    }

    public static void obtenerUniversidadXnit(ConexionDB objConn) {
        ResultSet result = Universidad.getUniversidadByNit(objConn.getConn(), "12345");
        try {
            if (result.next()) {
                String nit = result.getString("nit");
                String nombre = result.getString("nombre");
                String direccion = result.getString("direccion");
                String email = result.getString("email");
                // Concatenar información
                String info = "Nit: " + nit;
                info += "\nNombre: " + nombre;
                info += "\nDireccion: " + direccion;
                info += "\nEmail: " + email;
                System.out.println(info);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



}

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionDB {
    // --- ATRIBUTOS ---
    private Connection conn;

    // --- CONSTRUCTOR ---
    public ConexionDB(){
        String url = "jdbc:sqlite:universidad_grupo33";
        try {
            this.conn = DriverManager.getConnection(url);
            if(conn != null){
                System.out.println("Conexión existosa");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    // --- CONSTRUCTOR ---
    public Connection getConn(){
        return conn;
    }

    // --- ACCIONES ---
    public void cerrarConexion() throws SQLException{
        conn.close();;
    }

    public void insertar(String query) throws SQLException{
        Statement st = conn.createStatement();
        st.executeUpdate(query);
    }
}

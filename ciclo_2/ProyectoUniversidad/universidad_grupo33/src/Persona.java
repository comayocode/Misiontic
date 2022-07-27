import java.util.ArrayList;

public class Persona {
    // --- ATRIBUTOS ---
    private String nombre;
    private String apellido;
    private int edad;
    private String cedula;
    private char sexo;
    private ArrayList<String> telefonos;

    // --- CONSTRUCTOR ---
    public Persona(String nombre, String apellido, int edad, String cedula, char sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cedula = cedula;
        this.sexo = sexo;
        //inicializar telefonos
        this.telefonos = new ArrayList<String>();
    }

    // --- CONSULTORES ---
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public int getEdad() {
        return edad;
    }
    public String getCedula() {
        return cedula;
    }
    public char getSexo() {
        return sexo;
    }
    public ArrayList<String> getTelefonos() {
        return telefonos;
    }

    // --- MODIFICADORES ---
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public void setTelefonos(ArrayList<String> telefonos) {
        this.telefonos = telefonos;
    }

    // --- METODOS/ACCIONES ---
}

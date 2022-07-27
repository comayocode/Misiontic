import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Universidad {
    // --- ATRIBUTOS ---
    private String nombre;
    private String nit;
    private String direccion;
    private ArrayList<String> telefonos;
    private String email;
    //RELACION entre Universidad y facultades
    private ArrayList<Facultad> facultades;
    //ASOCIACIÓN entre Universidad y estudiantes
    private ArrayList<Estudiante> estudiantes;
    private Map<String, ArrayList<String>> matriculas;

    // --- CONSTRUCTORES ---
    public Universidad(String nombre, String nit, String direccion, String email) {
        this.nombre = nombre;
        this.nit = nit;
        this.direccion = direccion;
        this.email = email;
        this.telefonos = new ArrayList<String>();
        //INICIALIZAR la relación
        this.facultades = new ArrayList<Facultad>();
        //INICIALIZAR estudiante
        this.estudiantes = new ArrayList<Estudiante>();
        //INICIALIZAR la asociacion Univerdad - estudiante
        this.matriculas = new LinkedHashMap<String, ArrayList<String>>(); //HashMap = ordenar aleatoriamente los datos
    }

    // --- CONSULTORES ---
    public String getNombre() {
        return nombre;
    }
    public String getNit() {
        return nit;
    }
    public String getDireccion() {
        return direccion;
    }
    public ArrayList<String> getTelefonos() {
        return telefonos;
    }
    public String getEmail() {
        return email;
    }
    public ArrayList<Facultad> getFacultades() {
        return facultades;
    }
    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }
    public Map<String, ArrayList<String>> getMatriculas() {
        return matriculas;
    }

    // --- MODIFICADORES ---
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setTelefonos(ArrayList<String> telefonos) {
        this.telefonos = telefonos;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setFacultades(ArrayList<Facultad> facultades) {
        this.facultades = facultades;
    }
    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    // --- ACCIONES ---
    public void registrarEstudiante(String nombre, String apellido, int edad, String cedula, char sexo, String codigo){
        //Crear objeto de tipo estudiante
        Estudiante estudiante = new Estudiante(nombre, apellido, edad, cedula, sexo, codigo);
        //Almacenar objeto en el array
        this.estudiantes.add(estudiante);
    }

    public void crearFacultad(String codigo, String nombre){
        //Crear objeto de tipo facultad
        Facultad facultad = new Facultad(codigo, nombre);
        this.facultades.add(facultad);
    }

    public void matricularEstudiante(String cedula, String codigoFacultad){
        facultades.contains(codigoFacultad);
    }
}

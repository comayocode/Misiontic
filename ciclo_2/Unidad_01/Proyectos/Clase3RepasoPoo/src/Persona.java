public class Persona {
    //Atributos
    private String nombre;
    private String apellido;
    private int edad;

    //Método Constructor
    public Persona(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    // Métodos Consultores
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public int getEdad(){
        return edad;
    }

    // Métodos modificadores
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public  void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }

    // Acciones del objeto
    public double calcularNomina(double valorHora){
        int horas = 10;
        return (horas * valorHora);
    }
}


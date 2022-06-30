//PLantilla de tipo persona
public class Persona {
    //Atributos de la persona, se recomiendan que sean privados
    private String nombre;
    private String apellido;
    private int edad;

    //Constructor: Lleva el mismo nombre de la clase
    public Persona(String nombre, String apellido){
        //Asignar el atributo al String nombre de Public persona
        this.nombre = nombre;
        this.apellido = apellido;
        //System.out.println("Hola soy un objeto persona" + nombre);
    }

    // ----- METODOS CONSTRUCTORES -----
    //Se le asigna el tipo de dato (String) seguido de get y el... ???
    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public int getEdad(){
        return edad;
    }

    //----- Metodos modificadores -----
    //NOTA: genralmente no retornan nada
    //En el caso de los contructores se usa get, para los modificadores set
    public void setEdad(int edad){
        this.edad = edad;
    }
    public  void  setNombre(String nombre){
        this.nombre = nombre;
    }
    public  void setApellido(String apellido){
        this.apellido = apellido;
    }

    // ----- ACCIONES O MÉTODOS DE ACCIONES -----
    public double calcularNomina(double valorHora){
        int hora = 10;
        return (hora*valorHora);
    }
}

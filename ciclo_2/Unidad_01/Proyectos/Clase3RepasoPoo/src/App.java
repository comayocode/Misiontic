public class App {
    public static void main(String[] args) {
        // Construir un objeto "llamando" al constructor
        Persona objPersona_1 = new Persona("Andrés", "Cardona", 19);
        Persona objPersona_2 = new Persona("Mario", "Linares", 24);
        Persona objPersona_3 = new Persona("Carlos", "Fonseca", 23);

        //Consultar el nombre y apellido
        String nombre = objPersona_1.getNombre();
        String apellido = objPersona_1.getApellido();
        int edad = objPersona_1.getEdad();
        System.out.println(nombre + " " +apellido + " tiene " + edad + " años");

        nombre = objPersona_2.getNombre();
        apellido = objPersona_2.getApellido();
        edad = objPersona_2.getEdad();
        System.out.println(nombre + " " +apellido + " tiene " + edad + " años");

        nombre = objPersona_3.getNombre();
        apellido = objPersona_3.getApellido();
        edad = objPersona_3.getEdad();
        System.out.println(nombre + " " +apellido + " tiene " + edad + " años");

        System.out.println("------------------");

        //Modificar
        objPersona_1.setEdad(91);
        apellido = objPersona_1.getApellido();
        edad = objPersona_1.getEdad();
        System.out.println(apellido + " ahora tiene " + edad + " años");

        objPersona_2.setEdad(42);
        apellido = objPersona_2.getApellido();
        edad = objPersona_2.getEdad();
        System.out.println(apellido + " ahora tiene " + edad + " años");

        objPersona_3.setEdad(32);
        apellido = objPersona_3.getApellido();
        edad = objPersona_3.getEdad();
        System.out.println(apellido + " ahora tiene " + edad + " años");
    }
}

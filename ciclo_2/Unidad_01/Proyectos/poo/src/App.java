public class App {
    public static void main(String[] args) throws Exception{
        //NOTA: Entre menos código tenga el main, mejor

        //Construir un objeto tipo persona
        Persona objPersona_1 = new Persona("Andres", "Quintero");
        //Obtener el nombre y apellido
        String nombre = objPersona_1.getNombre();
        String apellido = objPersona_1.getApellido();
        System.out.println("Nombre: "+nombre+ "\nApellido: "+ apellido);

        //Crear otra persona
        Persona objPersona_2 = new Persona("Manuel", "Marulanda");
        Persona objPersona_3 = new Persona("Juliana", "Rodiguez");

        //Consultar datos de la persona
        objPersona_3.setEdad(25); //Pasar la edad de la persona 3
        nombre = objPersona_3.getNombre();
        apellido = objPersona_3.getApellido();
        int edad = objPersona_3.getEdad();  //Consultar la edad
        System.out.println(nombre +" " + apellido + " tiene una edad de " + edad + " años");
    }
}
public class App {
    public static void main(String[] args){
        //Mostrar mensaje en consola
        System.out.println("Hello, World!");

        // ----- Variables -----
        int entero = 10;
        double decimal = 10.5;
        boolean boleano = true;

        // ----- Varibales dinámicas -----
        //Reservar espacio en memoria
        String mensaje;
        //Asignar el dato al string
        mensaje = "Hola mundo desde una variable de tipo Str";
        var dinamica = 'a';
        char caracter = 'b';
        //Imprimir mensaje
        System.out.println(mensaje);

        // ----- OPERACIONES -----
        int n1 = 10;
        int n2 = 20;
        int suma = n1+n2;
        suma += 10;
        int multipicacion = n1*n2;
        multipicacion *= 2;
        System.out.println(multipicacion);
        System.out.println(suma);

        // ----- LLAMAR FUNCIONES -----
        calcular_promedio();
        calcular_promedio_recibir_datos(10, 5.5);
    }

    // ----- FUNCIONES SIN RETORNAR DATOS -----
    public static void calcular_promedio(){
        int n1 = 10;
        int n2 = 20;
        double promedio = (n1+n2)/2;
        System.out.println("El promedio es: " + promedio);
    }

    // ----- FUNCIONES QUE RECIBAN PARAMETROS -----
    public static void calcular_promedio_recibir_datos(double n1, double n2){
        double promedio = (n1+n2)/2;
        System.out.println("El promedio es: " + promedio);
    }

    // ----- FUNCIONES RETORNANDO DATOS -----
    /* public static void calcular_promedio_retorno_datos(double n1, double n2){
        int n1 = 10;
        int n2 = 20;
        double promedio = (n1+n2)/2;
        System.out.println("El promedio es: " + promedio);
    } */
}

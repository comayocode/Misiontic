import java.util.Scanner;

public class Ejercicios {
    public static Scanner ingresoDatos(){
        Scanner sc = new Scanner(System.in);
        return sc;
    }

    public static void ejercicio1(){
        //Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese primero numero: ");
        int num1 = ingresoDatos().nextInt();

        System.out.print("Ingrese segundo numero: ");
        int num2 = ingresoDatos().nextInt();

        int resultadoSuma = num1 + num2;
        int resultadoResta = num1 - num2;
        int resultadoDivision = num1 / num2;
        int resultadoMultiplicacion = num1 * num2;

        System.out.println("La suma de "+ num1 + " y " + num2 + " es igual a " + resultadoSuma);
        System.out.println("La resta de "+ num1 + " y " + num2 + " es igual a " + resultadoResta);
        System.out.println("La division de "+ num1 + " y " + num2 + " es igual a " + resultadoDivision);
        System.out.println("La multiplicacion de "+ num1 + " y " + num2 + " es igual a " + resultadoMultiplicacion);
    }

    public static void ejercicio2(){
        System.out.print("Nombre del alumno: ");
        String nombreAlumno = ingresoDatos().nextLine();

        System.out.print("Nota evaluacion 1: ");
        double nota1 = ingresoDatos().nextDouble();
        System.out.print("Nota evaluacion 2: ");
        double nota2 = ingresoDatos().nextDouble();
        System.out.print("Nota evaluacion 3: ");
        double nota3 = ingresoDatos().nextDouble();

        double promedio = (nota1 + nota2 + nota3) / 3;

        if (promedio >= 3.0){
            System.out.println("APROBADO");
        }else {
            System.out.println("REPROBADO");
        }

    }

    public static void ejercicio3(){
        System.out.print("Ingrese el número de horas trabajdas este mes: ");
        int horas = ingresoDatos().nextInt();

        System.out.println("Su pago de este mes es de : " + "$" + horas * 30000);

    }

    public static void ejercicio4(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int num = ingresoDatos().nextInt();

        for (int i = 0; i <= 10; i++ ){
            int multiplicacion = num * i;
            System.out.println(num +  " * " + i + " = " + multiplicacion);
        }
    }

    public static void ejercicio5() {
        int numeroAleatorio = (int) (Math.random() * 100 + 1);
        System.out.println(numeroAleatorio);

        int numeroUsuario;

        do {
            System.out.print("Adivina el número del 1 al 100: ");
            numeroUsuario = ingresoDatos().nextInt();
            if (numeroUsuario < numeroAleatorio){
                System.out.println(" --- El número que busca es mayor ---");
            } else if (numeroUsuario > numeroAleatorio){
                System.out.println(" --- El número que busca es menor ---");
            } else {
                System.out.println("¡Adivinaste el número!");
            }
        } while (numeroAleatorio != numeroUsuario);

    }

    public static void ejercicio6(){
        System.out.print("Ingrese su sexo (H: Hombre, M: Mujer): ");
        String sexo = ingresoDatos().nextLine();
        System.out.print("Ingrese su altura en cm: ");
        int altura = ingresoDatos().nextInt();

        if (sexo.equals("M")){
            double pesoIdeal = altura - 120;
            System.out.println("Tu peso ideal es: " + pesoIdeal);
        }else if (sexo.equals("H")){
            double pesoIdeal = altura - 110;
            System.out.println("Tu peso ideal es: " + pesoIdeal);
        }else {
            System.out.println("Verifica que escribiste bien el sexo");
        }
    }

    public static void ejercicio7(){
        //Pedir un número, comprobar si es primo y preguntar si quiere introducir más (S/N) y
        // volver a pensar

        System.out.print("Ingresa un número");
        int num = ingresoDatos().nextInt();


    }

}

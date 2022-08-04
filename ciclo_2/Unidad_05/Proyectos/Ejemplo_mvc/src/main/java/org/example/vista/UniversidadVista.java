package org.example.vista;

import org.example.controlador.UniversidadControlador;

import java.util.Scanner;

public class UniversidadVista {
    // --- ATTRIBUTOS ---
    private UniversidadControlador uControlador;

    // --- CONSTRUCTOR ---
    public UniversidadVista(){
        uControlador=new UniversidadControlador();
    }

// INTERFAZ DE USUARIO POR CONSOLA

    public void crearUniversidad(Scanner sc) {
        // Encabezado
        System.out.println("\n\n-------------------CREAR UNIVERSIDAD-----------------");
        System.out.println("Por favor ingrese la siguiente informacion: ");

        // ------Solicitud de datos
        // Solicitar nit
        System.out.print("Nit: ");
        String nit = sc.next();
        sc.nextLine();
        // Solicitar nombre
        System.out.print("Nombre: ");
        String nombre = sc.next();
        sc.nextLine();
        // Solicitar direccion
        System.out.print("Direccion: ");
        String direccion = sc.next();
        sc.nextLine();
        // Solicitar email
        System.out.print("Email: ");
        String email = sc.next();
        sc.nextLine();

        // -------Crear universidad
        uControlador.crearUniversidad(nit, nombre, direccion, email);
        System.out.println("\nUniversidad creada con exito\n\n");
    }


    public void menu() {
        String mensaje = "-------------------UNIVERSIDADES CON MVC----------------\n";
        mensaje += "1) Crear universidad\n";
        mensaje += "2) Mostrar todas las universidades\n";
        mensaje += "3) Consultar universidad por nit\n";
        mensaje += "4) Actualizar universidad\n";
        mensaje += "5) Eliminar universidad\n";
        mensaje += "-1) Salir\n";
        mensaje += ">>> ";
        // Variable que representa la opción ingresada por el usuario
        int opcion = 0;
        // Objeto para capturar entrada de datos por consola
        Scanner sc = new Scanner(System.in);
        try {
            while (opcion != -1) {
                System.out.print(mensaje);
                opcion = sc.nextInt();
                // Evaluar la opción ingresada por el usuario
                switch (opcion) {
                    case 1:
                        crearUniversidad(sc);
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    default:
                        break;
                }
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("Por favor ingrese valores numericos en las opciones solicitadas");
        }
    }

}

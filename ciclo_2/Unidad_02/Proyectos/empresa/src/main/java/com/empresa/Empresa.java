package com.empresa;

import java.util.Scanner;

public class Empresa {
    // ATRIBUTOS
    private String nombre;
    private String telefono;
    private String direccion;
    private String email;
    private String nit;
    private Carro[] carros;

    public Empresa(String nombre, String telefono, String direccion, String email, String nit) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
        this.nit = nit;
        carros = new Carro[50];
    }

    public Empresa(String nombre, String direccion, String nit) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.nit = nit;
        this.telefono = "";
        this.email = "";
        carros = new Carro[50];
    }

    public Empresa() {
        this.nombre = "";
        this.telefono = "";
        this.direccion = "";
        this.email = "";
        this.nit = "";
        carros = new Carro[50];
    }

    // Consultores
    // GETTERS

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEmail() {
        return email;
    }

    public String getNit() {
        return nit;
    }

    /*
     * public Carro[] getCarros(){
     * return carros;
     * }
     */

    public Carro getCarro(int pos) {
        return carros[pos];
    }

    // Retornar el tamaño del arreglo
    public int lengthCarro() {
        return carros.length;
    }

    // MODIFICADORES
    // SETTERS

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCarros(Carro carro, int pos) {
        carros[pos] = carro;
    }

    public void clearCarros() {
        // Recorrer el arreglo
        for (int i = 0; i < carros.length; i++) {
            carros[i] = null;
        }
    }

    // ACCIONES
    public void fabricar_carro(String placa, String modelo) {
        Carro carro = new Carro(placa, modelo);
        /*
         * boolean flag = false;
         * int pos = 0;
         * do{
         * if(carros[pos] == null){
         * carros[pos] = carro;
         * flag = true;
         * }
         * //Incrementar en una unidad
         * ++pos;
         * }while(flag == false && pos < carros.length);
         */

        // Luis
        /*
         * boolean flag = false;
         * int pos = 0;
         * while(flag == false&& pos < carros.length){
         * if (carros[pos] == null) {
         * carros[pos] = carro;
         * flag = true;
         * }
         * ++pos;
         * }
         */

        // Royer
        int x = 0;
        while (x < carros.length) {
            if (carros[x] == null) {
                carros[x] = carro;
                break;
            }
            ++x;
        }
        /*
         * for(int i = 0; i < carros.length; i++){
         * if(carros[i] == null){
         * carros[i] = carro;
         * break;
         * }
         * }
         */
    }

    public void solicitar_datos_carro(Scanner leer) {
        System.out.print("Por favor ingrese la placa del vehiculo: ");// Mostrar mensaje en pantalla
        String placa = leer.nextLine();// Capturar lo que ingrese el usuario

        System.out.print("Por favor ingrese el modelo del vehiculo: ");
        String modelo = leer.nextLine();

        // Fabricar carro
        fabricar_carro(placa, modelo);
    }

    // Mostrar la info de todos los carros
    public void mostrar_carros() {
        for (int i = 0; i < carros.length; i++) {
            if(carros[i] != null)
                System.out.println(carros[i]);
        }
    }

    // Mostrar la info de un solo carro
    public void mostrar_carro(int pos) {
        System.out.println(carros[pos]);
    }

    public void menu() {
        String mensaje = "-------------------------FABRICA DE CARROS-----------------------\n";
        mensaje += "1) Fabricar carro\n";
        mensaje += "2) Mostrar carros\n";
        mensaje += "3) Mostrar carro por posición\n";
        mensaje += "-1) Salir\n";
        mensaje += ">>> ";

        // Crear objeto Scanner con manejador de excepciones
        try (Scanner leer = new Scanner(System.in)) {
            int opc = 0;
            // Iterar hasta que el usuario desee salir
            while (opc != -1) {
                // Mostrar menú en consola
                System.out.print(mensaje);
                // Quedar a la escucha de lo que digite el usuario
                opc = Integer.parseInt(leer.next());
                leer.nextLine();
                // Evaluar la opción ingresada por el usuario
                switch (opc) {
                    case 1:
                        solicitar_datos_carro(leer);
                        break;
                    case 2:
                        mostrar_carros();
                        break;
                    case 3:
                        System.out.println("Por favor ingrese le id del vehiculo fabricado: ");
                        int pos = leer.nextInt();
                        mostrar_carro(pos);
                        break;
                    case -1:
                        break;
                    default:
                        System.out.println("Por favor ingrese una opción válida");
                }
            }
        } catch (Exception error) {
            System.err.println(error.getMessage());
        }

    }

}


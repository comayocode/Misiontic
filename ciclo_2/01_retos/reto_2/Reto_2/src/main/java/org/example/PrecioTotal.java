package org.example;

public class PrecioTotal {
    // --- ATRIBUTOS VARIABLES ---
    private Double totalComputadores = 0.0;
    private Double totalComputadoresMesa = 0.0;
    private Double totalComputadoresPortatiles = 0.0;
    private Computadores[] listaComputadores;

    // --- CONSTRUCTORES ---
    public PrecioTotal(Computadores[] pComputadores) {
        this.listaComputadores = pComputadores;
    }

    public void mostrarTotales(){
        ComputadoresMesa objMesa = new ComputadoresMesa();
        ComputadoresPortatiles objPortatil = new ComputadoresPortatiles();

        for (int i = 0; i < listaComputadores.length; i++){
            Computadores computador = listaComputadores[i];
            if (computador.getClass() == objPortatil.getClass()){
                totalComputadoresPortatiles += computador.calcularPrecio();
            } else if (computador.getClass() == objMesa.getClass()) {
                totalComputadoresMesa += computador.calcularPrecio();
            }
            totalComputadores += computador.calcularPrecio();
        }

        // Mostramos los resultados
        System.out.println("La suma del precio de los computadores es de " + totalComputadores);
        System.out.println("La suma del precio de los computadores de mesa es de " + totalComputadoresMesa);
        System.out.print("La suma del precio de los computadores portátiles es de " + totalComputadoresPortatiles);
    }
}

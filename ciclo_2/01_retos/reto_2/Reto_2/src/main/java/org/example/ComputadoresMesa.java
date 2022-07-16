package org.example;

public class ComputadoresMesa extends Computadores{
    // --- ATRIBUTOS CONSTANTES ---
    private final static Integer ALMACENAMIENTO_BASE = 50;

    // --- ATRIBUTOS VARIABLES ---
    private Integer almacenamiento;

    // --- CONSTRUCTORES ---
    //Constructor si no se le pasan valores
    public ComputadoresMesa(){
        this.almacenamiento = ALMACENAMIENTO_BASE;
    }

    //Constructor pansando 2 datos más valor por defecto ALMACENAMIENTO_BASE
    public ComputadoresMesa(Double precioBase, Integer peso) {
        super(precioBase, peso);
        this.almacenamiento = ALMACENAMIENTO_BASE;
    }

    //Constructor pasando todos los datos más almacenamiento
    public ComputadoresMesa(double precioBase, Integer peso, char consumoW, Integer almacenamiento) {
        super(precioBase, peso, consumoW);
        this.almacenamiento = almacenamiento;
    }

    // --- METODO ---
    public Double calcularPrecio(){
        double precio = super.calcularPrecio();
        if (almacenamiento > 100){
            precio += 50;
        }
        return precio;
    }

    // --- GETTER/CONSULTORES ---
    public Integer getAlmacenamiento() {
        return almacenamiento;
    }
}

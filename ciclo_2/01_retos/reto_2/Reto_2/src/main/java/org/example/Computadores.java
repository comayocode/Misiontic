package org.example;

public class Computadores {
    // --- ATRIBUTOS CONSTANTES ---
    //Datos por defecto si no se pasan valores a los atributos variables//
    private final static Integer PESO_BASE = 5;
    private final static char CONSUMO_W_BASE = 'F';
    private final static double PRECIO_BASE = 100.0;
    // --- ATRIBUTOS VARIABLES ---
    //Datos para pasarles un valor
    private Integer peso;
    private char consumoW;
    private Double precioBase;

    // --- CONSTRUCTORES ---
    //Constructor con valores por defecto (CONSTANTES)//
    public Computadores(){
        this.peso = PESO_BASE;
        this.consumoW = CONSUMO_W_BASE;
        this.precioBase = PRECIO_BASE;
    }
    //Constructor pasandole 2 datos//
    public Computadores(Double precioBase, Integer peso){
        this.precioBase = precioBase;
        this.peso = peso;
        this.consumoW = CONSUMO_W_BASE;
    }
    //Constructor pasandole los 3 datos
    public Computadores(double precioBase, Integer peso, char consumoW){
        this.precioBase = precioBase;
        this.peso = peso;
        this.consumoW = consumoW;
    }

    // --- METODOS ---
    public Double calcularPrecio(){
        double adicionConsumoW = 0.0;
        double adicionPeso = 0.0;

        if (consumoW == 'A'){
            adicionConsumoW += 100;
        } else if (consumoW == 'B') {
            adicionConsumoW += 80;
        }else if (consumoW == 'C') {
            adicionConsumoW += 60;
        }else if (consumoW == 'D') {
            adicionConsumoW += 50;
        }else if (consumoW == 'E') {
            adicionConsumoW += 30;
        }else if (consumoW == 'F') {
            adicionConsumoW += 10;
        }

        if (peso >= 0 && peso < 19){
            adicionPeso += 10;
        } else if (peso >= 20 && peso < 49) {
            adicionPeso += 50;
        }else if (peso >= 50 && peso <= 79) {
            adicionPeso += 80;
        }else if (peso >= 80) {
            adicionPeso += 100;
        }

        Double adicionTotal = adicionConsumoW + adicionPeso;
        return precioBase + adicionTotal;
    }

    // --- GETTER/CONSULTORES ---
    public Integer getPESO_BASE() {
        return PESO_BASE;
    }
    public char getCONSUMO_W_BASE() {
        return CONSUMO_W_BASE;
    }
    public double getPRECIO_BASE() {
        return PRECIO_BASE;
    }
    public Integer getPeso() {
        return peso;
    }
    public char getConsumoW() {
        return consumoW;
    }
    public double getPrecioBase() {
        return precioBase;
    }
}

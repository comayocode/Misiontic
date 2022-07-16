package org.example;

public class ComputadoresPortatiles extends Computadores{
    // --- ATRIBUTOS CONSTANTES ---
    private final static Integer PULGADAS_BASE = 20;

    // --- ATRIBUTOS VARIABLES ---
    private Integer pulgadas;
    private boolean camaraITG;

    // --- CONSTRUCTORES ---
    //Constructor si no se le pasan valores
    public ComputadoresPortatiles(){
        this.pulgadas = PULGADAS_BASE;
        //camaraITG en false ya que por defecto los portatiles no traen camaraITG
        this.camaraITG = false;
    }
    //Constructor pansando 2 datos más valor por defecto PULGADAS_BASE y camaraITG false
    public ComputadoresPortatiles(Double precioBase, Integer peso) {
        super(precioBase, peso);
        this.camaraITG = false;
        this.pulgadas = PULGADAS_BASE;
    }
    //Constructor pasando todos los datos más almacenamiento
    public ComputadoresPortatiles(Double precioBase, Integer peso, char consumoW, Integer pulgadas, boolean camaraITG) {
        super(precioBase, peso, consumoW);
        this.pulgadas = pulgadas;
        this.camaraITG = camaraITG;
    }

    // --- METODO ---
    public  Double calcularPrecio(){
        Double precio = super.calcularPrecio();
        double adicionPorcentaje = (super.getPrecioBase() * 0.3);
        if(pulgadas>40){
            precio += adicionPorcentaje;
        }
        if (camaraITG){
            precio += 50;
        }
        return precio;
    }
}

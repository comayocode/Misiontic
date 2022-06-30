public class App {
    public static void main (String[]args){
        //Se crea el objeto
        Carro Auto_1 = new Carro("Mazda", 2010);
        //Se traen los atributos
        String marca = Auto_1.getMarca();
        int anio = Auto_1.getAnio();
        //Se imprime el resultado
        System.out.println("Marca de auto : "+ marca + "\nAño del modelo: " + anio);
    }
}

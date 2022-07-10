public class App {
    public static void main(String[] args) {
        BecaUniversitaria becaUniversitaria = new BecaUniversitaria();
        System.out.println(becaUniversitaria.calcularInteresSimple());
        System.out.println(becaUniversitaria.calcularInteresCompuesto());
        System.out.println(becaUniversitaria.compararInversion(60,13000,1.4));

        System.out.println("*********************************************************");

        BecaUniversitaria becaUniversitaria_2 = new BecaUniversitaria(48, 10000, 2.0);
        System.out.println(becaUniversitaria_2.calcularInteresSimple());
        System.out.println(becaUniversitaria_2.calcularInteresCompuesto());
        System.out.println(becaUniversitaria_2.compararInversion(48, 10000, 2.0));


        System.out.println("*********************************************************");

        BecaUniversitaria becaUniversitaria2 = new BecaUniversitaria(48,10000,2.0);
        System.out.println(becaUniversitaria2.calcularInteresSimple());
        System.out.println(becaUniversitaria2.calcularInteresCompuesto());
        System.out.println(becaUniversitaria2.compararInversion());
    }
}




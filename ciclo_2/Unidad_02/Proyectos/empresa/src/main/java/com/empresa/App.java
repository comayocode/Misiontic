package com.empresa;

public class App
{
    public static void main( String[] args )
    {
        Empresa objEmpresa = new Empresa("Tesla", "31234567", "Cra 100 #12-44", "info@tesla.com", "12345667");
        objEmpresa.menu();
        //Arreglo
        /* Carro[] carros_1;
        Carro carros_2[];
        int numeros[] = {10,20,30,40,50,60};
        double[] decimales = new double[6];
        decimales[0] = 10; */

        //Ciclos
        //ciclos();

        /* Carro carro = new Carro("ABC123", "2022");
        System.out.println(carro); */

    }

    public static void ciclos(){
        for(int i = 5; i > 0; i-=2){
            System.out.println(i);
        }
    }
}


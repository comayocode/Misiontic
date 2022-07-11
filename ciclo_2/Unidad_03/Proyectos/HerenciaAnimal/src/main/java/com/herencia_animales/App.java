package com.herencia_animales;

public class App 
{
    public static void main( String[] args ) {
        Rana rana = new Rana("Verde", 500,10, false, true, 1, 'M');
        //Consultar atibutos
        System.out.println(rana.getColor());
        //Ejecutar acciones
        rana.dormir();

        Pez pez = new Pez("Gris",600,15,false,true,1,'F');
        System.out.println(pez.getColor());
        pez.comer();
        pez.dormir();
    }
}

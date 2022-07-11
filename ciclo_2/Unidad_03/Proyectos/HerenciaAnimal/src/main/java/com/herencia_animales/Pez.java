package com.herencia_animales;

public class Pez extends Animal{
    // --- CONSTRUCTOR ---
    public Pez(String color, double peso, double tamanio, boolean mamifero, boolean vertebrado, int edad, char genero){
        super(color, peso, tamanio, mamifero, vertebrado, edad, genero);
    }

    // --- ACCIONES CON POLIMORFISMO ---
    @Override
    public void avanzar(){
        System.out.println("Nadar");
    }
}

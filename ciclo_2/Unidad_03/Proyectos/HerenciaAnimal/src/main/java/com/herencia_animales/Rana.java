package com.herencia_animales;

public class Rana extends Animal {
    // --- ATRIBUTOS ---
    private boolean venenosa;

    // --- CONSTRUCTOR ---
    public Rana(String color, double peso, double tamanio, boolean mamifero, boolean vertebrado, int edad, char genero){
        //Enviar parametros a superclase
        super(color, peso, tamanio, mamifero, vertebrado, edad, genero);
        this.venenosa = venenosa;
    }

    // --- CONSULTOR ---
    public boolean getVenenosa(){
        return venenosa;
    }

    // --- MODIFICADOR ---
    public void setVenenosa(boolean venenosa){
        this.venenosa = venenosa;
    }

    // --- ACCIONES CON POLIMORFISMO ---
    @Override
    public void avanzar(){
        System.out.println("Saltar");
    }
}

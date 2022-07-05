package com.empresa;

public class Carro {
    private  String color;
    private double vel_maxima;
    private String modelo;
    private String placa;

    public Carro(){
        inicializar();
    }

    public void inicializar(){
        this.color = "";
        this.vel_maxima = 0;
        this.modelo = "";
        this.placa = "";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getVel_maxima() {
        return vel_maxima;
    }

    public void setVel_maxima(double vel_maxima) {
        this.vel_maxima = vel_maxima;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    //ACCIONES
    public void acelerar(){
        System.out.println("Acelerando");
    }
    public void frenar(){
        System.out.println("Frenando");
    }
    public void girar_der(){
        System.out.println("Girando a la derecha");
    }
    public void girar_izq(){
        System.out.println("Girando a la izquierda");
    }
}

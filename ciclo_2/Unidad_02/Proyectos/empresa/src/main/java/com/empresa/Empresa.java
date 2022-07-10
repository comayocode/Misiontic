package com.empresa;

import java.security.PublicKey;
import java.sql.SQLOutput;

public class Empresa {
    //ATRIBUTOS
    private String nombre;
    private String telefono;
    private String direccion;
    private String email;
    private String nit;
    private Carro[] carros; //Relación entre Carro y empresa

   //CONSTRUTORES
    public Empresa(String nombre, String telefono, String direccion, String email, String nit){
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
        this.nit = nit;
        carros = new Carro[50];
    }

    public Empresa(){
        this.nombre = "";
        this.telefono = "";
        this.direccion = "";
        this.email = "";
        this.nit = "";
        carros = new Carro[50];
    }

    public  Empresa(String nombre, String direccion, String nit){
        this.nombre = nombre;
        this.direccion = direccion;
        this.nit = nit;
        this.telefono = "";
        this.email = "";
        carros = new Carro[50];
    }

    //CONSULTORES
    public String getNombre() {
        return nombre;
    }
    public String getTelefono() {
        return telefono;
    }
    public String getDireccion() {
        return direccion;
    }
    public String getEmail() {
        return email;
    }
    public String getNit() {
        return nit;
    }
    //Consultores para arreglo
    public Carro[] getCarros(){
        return carros;
    }
    public Carro getCarro(int pos){
        return carros[pos];
    }
    public int lengthCarro(){
        return carros.length;
    }

    //MODIFICADORES
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setNit(String nit) {
        this.nit = nit;
    }
    //Modificadores para arreglos
    public void setCarros(Carro carro, int pos){
        carros[pos] = carro;
    }

    public void clearCarros(){
        //Recorrer el arreglo
        int tamanio = carros.length;
        for(int i = 0; i < carros.length; i++ ){
            //Eliminar el dato
            carros[i] = null;
        }
    }

    //ACIONES
    public void fabricarCarro(String placa, String modelo){
        Carro carro = new Carro(placa, modelo);
        boolean flag = false;
        int pos = 0;
        do {
            if (carros[pos] == null){
                carros[pos]=carro;
                flag=true;
            }
            ++pos
        }while (flag==false && pos<carros.length);
    }


}

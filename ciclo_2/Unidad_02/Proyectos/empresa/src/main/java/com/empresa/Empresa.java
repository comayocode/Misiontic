package com.empresa;

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
}

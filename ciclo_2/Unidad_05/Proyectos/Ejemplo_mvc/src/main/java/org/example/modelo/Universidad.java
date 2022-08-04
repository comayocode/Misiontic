package org.example.modelo;

public class Universidad {
    private String nit;
    private String nombre;
    private String direccion;
    private String email;

    public Universidad(String nit, String nombre, String direccion, String email) {
        this.nit = nit;
        this.nombre = nombre;
        this.direccion = direccion;
        this.email = email;
    }

    public String getNit() {
        return nit;
    }
    public String getNombre() {
        return nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public String getEmail() {
        return email;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}

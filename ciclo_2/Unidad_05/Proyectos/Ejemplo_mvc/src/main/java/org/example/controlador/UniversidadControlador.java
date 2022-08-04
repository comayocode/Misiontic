package org.example.controlador;

import org.example.modelo.Universidad;

import java.util.ArrayList;

public class UniversidadControlador {
    // --- ATRIBUTOS ---
    private ArrayList<Universidad> universidades;

    // --- CONSTRUCTOR ---
    public UniversidadControlador(){
        universidades = new ArrayList<Universidad>();
    }

    // --- CONSULTORES ---
    public int getCantidadUniversidades(){
        return universidades.size();
    }

    // --- ACCIONES ---
    public void crearUniversidad(String nit, String nombre, String direccion, String email){
        // Crear Universidad
        Universidad objUni = new Universidad(nit, nombre, direccion, email);
        // Almacenar universidad
        universidades.add(objUni);

    }
}

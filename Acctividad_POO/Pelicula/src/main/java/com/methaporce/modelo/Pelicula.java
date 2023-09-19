package com.methaporce.modelo;

public class Pelicula {
    private int id;
    private String nombre;
    private boolean disponible;

    public Pelicula(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.disponible = true; // Por defecto, una película se marca como disponible al crearse.
    }

    // Getters y setters

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return id + ": " + nombre + (disponible ? " (Disponible)" : " (No disponible)");
    }
}
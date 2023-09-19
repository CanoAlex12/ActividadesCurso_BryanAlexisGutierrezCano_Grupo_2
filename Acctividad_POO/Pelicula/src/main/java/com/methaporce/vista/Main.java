package com.methaporce.vista;

import com.methaporce.modelo.Pelicula;
import com.methaporce.modelo.GestionPelicula;

public class Main {
    public static void main(String[] args) {
        GestionPelicula gestor = new GestionPelicula();

        Pelicula pelicula1 = new Pelicula(1, "Barbie");
        Pelicula pelicula2 = new Pelicula(2, "Pokemon");
        Pelicula pelicula3 = new Pelicula(3, "Five nights at freddy´s");
        Pelicula pelicula4 = new Pelicula(4, "La monja 2");

        gestor.agregarPelicula(pelicula1);
        gestor.agregarPelicula(pelicula2);
        gestor.agregarPelicula(pelicula3);
        gestor.agregarPelicula(pelicula4);

        System.out.println("Lista de las peliculas del mes:");
        for (Pelicula pelicula : gestor.obtenerPeliculas()) {
            System.out.println(pelicula);
        }

        // Marcar una película como no disponible
        gestor.marcarPeliculaComoNoDisponible(4);

        // Eliminar una película
        gestor.eliminarPelicula(1);

        System.out.println("\nLista de películas disponibles despues de eliminar la película 1:");
        for (Pelicula pelicula : gestor.obtenerPeliculas()) {
            System.out.println(pelicula);
        }

        // Marcar una película como disponible
        gestor.marcarPeliculaComoDisponible(3);

        System.out.println("\nPelículas del dia después de marcar la película 3 como disponible:");
        for (Pelicula pelicula : gestor.obtenerPeliculas()) {
            System.out.println(pelicula);
        }

        System.out.println("\nLista de películas no disponibles:");
        for (Pelicula pelicula : gestor.obtenerPeliculasNoDisponibles()) {
            System.out.println(pelicula);
        }
    }
}
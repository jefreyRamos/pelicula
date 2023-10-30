package co.uniquindio.edu.poo;

import java.util.Collection;

public class Pelicula {
    private final String nombre;
    private final int año;
    private final Genero genero;
    private final Collection<Actor> actors;
    private final Collection<Director> directors;
    private final Collection<Guionista> guionistas;
    private final Collection<Trailer> trailers;

    public Pelicula(String nombre, int año, Genero genero, Collection<Actor> actors, Collection<Director> directors,
            Collection<Guionista> guionistas, Collection<Trailer> trailers) {
        this.nombre = nombre;
        this.año = año;
        this.genero = genero;
        this.actors = actors;
        this.directors = directors;
        this.guionistas = guionistas;
        this.trailers = trailers;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAño() {
        return año;
    }

    public Genero getGenero() {
        return genero;
    }

    public Collection<Actor> getActors() {
        return actors;
    }

    public Collection<Director> getDirectors() {
        return directors;
    }

    public Collection<Guionista> getGuionistas() {
        return guionistas;
    }

    public Collection<Trailer> getTrailers() {
        return trailers;
    }
}

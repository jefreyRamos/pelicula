package co.uniquindio.edu.poo;

public abstract class Persona {
    private final String nombre;
    private final String nacionalidad;

    public Persona(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }
}

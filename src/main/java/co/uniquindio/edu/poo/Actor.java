package co.uniquindio.edu.poo;

public class Actor extends Persona{
    private final String alias;

    public Actor(String nombre, String nacionalidad, String alias) {
        super(nombre, nacionalidad);
        this.alias = alias;
    }

    public String getNombre() {
        return alias;
    }

    
    
}

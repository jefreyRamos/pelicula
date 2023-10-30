package co.uniquindio.edu.poo;

public class Trailer {
    private final String nombre;
    private final double duracion;
    private final Collection<Persona> participantes;
    
    public Trailer(String nombre, double duracion, Persona participante) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.participantes = new LinkedList<>();
        participantes.add(participante);
    }
    public String getNombre() {
        return nombre;
    }
    public double getDuracion() {
        return duracion;
    }
    public Collection<Persona> getParticipantes() {
        return participantes;
    }

    
    
}

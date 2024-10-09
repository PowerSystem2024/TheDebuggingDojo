
package domain;


public class Persona {
    // Cargar atributos
    private int idPersona;
    private static int contadorPersona;
    private String nombre;
    
    // Constructor
    public Persona(String nombre){
        this.nombre = nombre;
        // Incrementar el contador por cada objeto nuevo
        Persona.contadorPersona++; // No se usa el operador this
        // Asignar un nuevo valor a la variable idPerona
        this.idPersona = Persona.contadorPersona;
    }

    // GETTERS and SETTERS
    public int getIdPersona() {
        return this.idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public static int getContadorPersona() {
        return contadorPersona;
    }

    public static void setContadorPersona(int contadorPersona) {
        Persona.contadorPersona = contadorPersona;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // toString
    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + '}';
    }
    
    
}

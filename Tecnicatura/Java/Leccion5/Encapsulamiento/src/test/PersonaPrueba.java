
package test;
//import dominio.*; //importar todas las clases no ocupa memoria
import dominio.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Osvaldo",57000, false);
        System.out.println("Persona1 su nombre es: " + persona1.getNombre());
        System.out.println("persona1: "+ persona1);
        // Modificar a través de los métodos}
        persona1.setNombre("Gonzalo");
        //persona1.nombre = "Gonzalo"; // No se puede acceder porque es privado
        //System.out.println("Nombre es: " + persona1.nombre); // No se puede acceder porque es privado
        System.out.println("Persona1 su nombre modificado es: " + persona1.getNombre());
        System.out.println("Persona1 el resultado para el sueldo: $" + persona1.getSueldo());
        System.out.println("Persona1 para obtener el boolean: " + persona1.isEliminado());
        
        /*
            TAREA:
            Crear otro objeto de tipo persona, asignar valores de manera inicial y imprimir
            Luego modificar sus valores y volver a imprimir
        */
        //Crear persona
        Persona personaTarea = new Persona("Rodrigo",140000, true);
        //Imprimir persona
        System.out.println("TAREA: El nombre es: " + personaTarea.getNombre());
        System.out.println("TAREA: El sueldo es: $" + personaTarea.getSueldo());
        System.out.println("TAREA: El boolean es: " + personaTarea.isEliminado());
        //Modificar persona
        personaTarea.setNombre("Valentín");
        personaTarea.setSueldo(643000);
        personaTarea.setEliminado(false);
        // Imprimir persona modificada
        System.out.println("TAREA: El nombre modificado es: " + personaTarea.getNombre());
        System.out.println("TAREA: El sueldo modificado es: $" + personaTarea.getSueldo());
        System.out.println("TAREA: El boolean modificado es: " + personaTarea.isEliminado());
        
        // toString
        System.out.println("persona1: "+ persona1);
    }
}

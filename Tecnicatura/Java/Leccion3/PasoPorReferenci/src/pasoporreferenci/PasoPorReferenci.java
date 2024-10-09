/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pasoporreferenci;

import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class PasoPorReferenci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        Persona persona = new Persona();

        System.out.println("ingrese su nombre");
        persona.nombre = read.next();
        System.out.println("Ingrese su apellido");
        persona.apellido = read.next();

        persona.obtenerInformacion();

        Personas personas = new Personas("Nahuel", "Francia");
        System.out.println("personas = " + personas.nombre);

    }

}

class Personas {

    String nombre;
    String apellido;

// contructor 
    Personas(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;

        System.out.println(" objeto persona usando this: " + this);

    }

}

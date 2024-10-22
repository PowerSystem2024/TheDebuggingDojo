/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase10poo;

/**
 *
 * @author nahue
 */
public class Cliente extends Persona {
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleados;

    
    public Cliente(){
    
    }
    public Cliente(int idEmpleado, double sueldo) {
        this.idEmpleado = idEmpleado;
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public static int getContadorEmpleados() {
        return contadorEmpleados;
    }

    public static void setContadorEmpleados(int contadorEmpleados) {
        Cliente.contadorEmpleados = contadorEmpleados;
    }
    
    
    
    
}

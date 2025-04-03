/*
*  Clase Persona
*  Creado por: Orlando Arboleda Molina
*  Fecha: 20-Diciembre-2021
*
*  Descripción: 
*  Implementación de la clase que contendra objetos de la clase CuentaBancaria
*  en la PracticaAsociacion1_1, para el curso de POO en la Universidad 
*  Autónoma de Occidente
*
*  Nota: es una clase incompleta
*/

package Modelo;

public class Persona {
    private int cedula;
    private String nombre;
    private String actividad;
    private CuentaBancaria suCuenta;

    public Persona(int cedula, String nombre, String actividad, CuentaBancaria suCuenta) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.actividad = actividad;
        this.suCuenta = suCuenta;
    }
    
    public double calcularPagoMensual(){
        return suCuenta.calcularPrestamo()/12;
    }
    
    @Override
    public String toString() {
        return "Persona{" + "cedula=" + cedula + ", nombre=" + nombre + ", actividad=" + actividad + ", suCuenta=" + suCuenta + '}';
    }
    
    
}

/*
*  Clase UsaPersona
*  Creado por: Orlando Arboleda Molina
*  Fecha: 20-Diciembre-2021
*
*  Descripción: 
*  Clase principal con la lógica de implementación de la PracticaAsociacion1_1, 
*  para el curso de POO en la Universidad Autónoma de Occidente
*
*  Nota: es una clase incompleta
*/

package Vista;

import Modelo.CuentaBancaria;
import Modelo.Persona;
import javax.swing.JOptionPane;

public class UsaPersona {

    public static void main(String[] args) {
        // incluir atributo para leer la actividad de la Persona
        int nroPersonas, elNroCuenta, laCedula;
        String elBanco, elNombre;
        double elSaldo;

        nroPersonas = Integer.parseInt(
                JOptionPane.showInputDialog("Digite el numero de personas"));
        
        Persona[] lasPersonas = new Persona[nroPersonas];
        
        // ciclo en Java equivalente al indicado en el flujograma del proceso principal
        for (int contador = 0; contador < nroPersonas; contador++) {
            elNroCuenta = Integer.parseInt(
                    JOptionPane.showInputDialog("Digite el numero de la Cuenta Bancaria"));
            elBanco = JOptionPane.showInputDialog("Digite el banco de la Cuenta Bancaria");
            elSaldo = Double.parseDouble(
                    JOptionPane.showInputDialog("Digite el saldo de la Cuenta Bancaria"));
            laCedula = Integer.parseInt(
                    JOptionPane.showInputDialog("Digite la cedula de la Persona"));            
            elNombre = JOptionPane.showInputDialog("Digite el nombre de la Persona");
             
            // actualizar para leer la actividad de la Persona y suministrarla al constructor
            CuentaBancaria miCB = new CuentaBancaria(elNroCuenta, elBanco, elSaldo);
            Persona objP = new Persona(laCedula, elNombre, "comerciante", miCB);            
        }

        JOptionPane.showMessageDialog(null,listarTodos(lasPersonas));
    }
    
    // completar la implementación de este método
    public static String listarTodos( Persona[] info )
    {
        String res=""; 
        
        for (int i=0; i<info.length; i++)
        {
            // concatenar cuanto le pagaran y la couta mensual
            res += info[i].toString() + "\n";
        }        
        return res;
    }
    
}

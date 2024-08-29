
package Guia07.actividad1;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        
        /*
       Constuctor poo = new Constuctor("Alejando", 33);
       poo.mostraratos();
       */
       
        
        /*
        parametros dato = new parametros();
        
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero: "));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
        
        dato.suma(numero1, numero2);
        dato.resta(numero1, numero2);
        dato.mul(numero1, numero2);
        dato.mostrarDatos();
        */
        
        
        /*
        retorno datos = new retorno();
        
        datos.dato();
        System.out.println("La suma es: " + datos.suma());
        System.out.println("La resta es: " + datos.resta());
        */
        
        atributosMetodos datos = new atributosMetodos();
        
        datos.dato();
        datos.suma();
        datos.resta();
        datos.mul();
        datos.div();
        datos.mostrarDatos();
        
        
    }
    
}

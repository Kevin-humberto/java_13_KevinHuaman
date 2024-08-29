
package Guia07.actividad1;

import javax.swing.JOptionPane;

public class retorno {
    //atributos
    int numero1;
    int numero2;
    
    //metodos 
    public void dato(){
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero: "));
    }
    public int suma(){
        int suma = numero1 + numero2;
        return suma;
    }
    public int resta(){
        int resta = numero1 - numero2;
        return resta;
    }
    
}

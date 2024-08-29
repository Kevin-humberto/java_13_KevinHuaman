
package Guia07.actividad1;

import javax.swing.JOptionPane;

public class atributosMetodos {
    //atributos
    int numero1;
    int numero2;
    int suma;
    int resta;
    int mul;
    int div;
    
    //metodos
    public void dato(){
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
    }
    public void suma(){
        suma = numero1 + numero2;
    }
    public void resta(){
        resta = numero1 - numero2;
    }
    public void mul(){
        mul = numero1 * numero2;
    }
    public void div(){
        div = numero1 / numero2;
    }
    public void mostrarDatos(){
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + mul);
        System.out.println("La división es: " + div);
    }
}

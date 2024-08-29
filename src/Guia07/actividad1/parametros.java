
package Guia07.actividad1;

public class parametros {
    //atributos
    int suma;
    int resta;
    int mul;
    
    //metodos
    public void suma(int numero1, int numero2){
        suma = numero1 + numero2;
    }
    public void resta(int numero1, int numero2){
        resta = numero1 - numero2;
    }
    public void mul(int numero1, int numero2){
        mul = numero1 * numero2;
    }
    public void mostrarDatos(){
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + mul);
    }
}

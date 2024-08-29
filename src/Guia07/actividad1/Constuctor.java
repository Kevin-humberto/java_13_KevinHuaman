
package Guia07.actividad1;

public class Constuctor { 
    //atibutos
    String nombre;
    int edad;
    
    //Metodos
    public Constuctor(String Nombre, int Edad){
       nombre = Nombre;
       edad = Edad;
    }
    public void mostraratos(){
        System.out.println("El nombre es:" + nombre);
        System.out.println("La edad es:" + edad);
    }

}

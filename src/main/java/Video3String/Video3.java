/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Video3String;

/**
 *
 * @author DORITA
 */
public class Video3 {
    public static void main(String[] args) {
        
        String nombre="Ana Maria";
        System.out.println("Mi nombre es: "+nombre);
        
        int longitud = nombre.length();
        System.out.println("La longitud del nombre es: "+longitud);
        
        boolean vacio= nombre.isEmpty();
        System.out.println("El nombre esta vacio: "+vacio);
        
        String substring= nombre.substring(2,5);
        System.out.println("El nombre en limite de dos a cinco es: "+substring);
        
        String newString= nombre.replace("a", "i");
        System.out.println("El nombre queda: "+newString);
    }
    
}

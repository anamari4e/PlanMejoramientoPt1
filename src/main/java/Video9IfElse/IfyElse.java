/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Video9IfElse;

/**
 *
 * @author Ana
 */
public class IfyElse {
    public static void main(String[] args) {
        int totalEpisodios= 1;
        
        if(totalEpisodios==1){
            System.out.println("Es una pelicula");
        }else{
            System.out.println("Es una serie");
        }
        
         if(totalEpisodios>1){
            System.out.println("Es una serie");
        }else if(totalEpisodios==1){
            System.out.println("Es una pelicula");
        }else{
             System.out.println("Debe tener al menos un episodio");
        }
            
    }
}

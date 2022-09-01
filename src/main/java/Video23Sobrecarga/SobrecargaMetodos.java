
package Video23Sobrecarga;

import java.util.Random;

/**
 *
 * @author Ana
 */
public class SobrecargaMetodos {
    
     public static void main(String[] args) {
        String [] tituloArray = new String []{"Barbie","Minions","Actividad Paranormal","Peppa","Votos de Amor","Destino final", "Iron Man"};
        
        String titulo = play(tituloArray,3);
        String titulo2 = play(tituloArray);
        System.out.println("");
        pausa(titulo);
        System.out.println("");
        pausa(titulo2);
    }    
    public static String play(String[] tituloArray, int index){
        if (index < tituloArray.length ) { 
            String titulo = tituloArray [index];
            
            for (int i = 0; i < 10; i++){
                System.out.println("Esta corriendo la pelicula"+titulo);
            }
            return titulo;
        }else{
            System.out.println("El indice es muy grande");
            return "";
        }
    }
    //El metodo que esta sobrecargado
    public static String play(String[] tituloArray) {
     Random random = new Random();
     int index = random.nextInt(tituloArray.length - 1);
     
     String titulo = tituloArray [index];
           
        for (int i = 0; i < 10; i++){
            System.out.println("Esta corriendo la pelicula"+titulo);    
        }
        return titulo;    
    }
    
    public static void pausa(String titulo) {
        if (titulo.isEmpty()){
            System.out.println("La pelicula no se reproduce");
        }else{
            System.out.println("La pelicula esta en pausa"+titulo);
        } 
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Video21MetodoArgumento;

/**
 *
 * @author DORITA
 */
public class ArgumentosMetodos {
    
    public static void main(String[] args) {
        
         

        String [] tituloArray = new String []{"Barbie","Minions","Actividad Paranormal","Peppa","Votos de Amor","Destino final", "Iron Man"};
        
        
        play(tituloArray,10);
        System.out.println("");
        pausa();
    }    
    
    public static void play(String[] tituloArray, int index){
        if (index < tituloArray.length ) { 
            String titulo = tituloArray [index];
            
            for (int i = 0; i < 10; i++){
                System.out.println("Esta corriendo la pelicula"+titulo);
            }
        }else{
            System.out.println("El indice es muy grande");
        }
    }
    public static void pausa() {
        System.out.println("Pelicula en pausa"); 
    }     
    
    
}

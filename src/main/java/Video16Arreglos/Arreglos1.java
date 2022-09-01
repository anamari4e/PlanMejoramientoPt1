
package Video16Arreglos;

import java.util.Scanner;

/**
 *
 * @author Ana
 */
public class Arreglos1 {
    
    public static void main(String[] args) {
        
        System.out.println("Escribe el numero de episodios que quisieras saber su duración");
        Scanner scanner = new Scanner(System.in);
        int episodioIndex = scanner.nextInt();
        
        
        int[] episodioDuracionArray = new int [5];
        
     
        episodioDuracionArray [0] = 30;
        episodioDuracionArray [1] = 32;
        episodioDuracionArray [2] = 27;
        episodioDuracionArray [3] = 31;
        episodioDuracionArray [4] = 60;
        
        
        if (episodioIndex >= 0 && episodioIndex < 5){
            int episodioDuracion = episodioDuracionArray[episodioIndex];
            System.out.println("El episodio dura" + episodioDuracion + "minutos");
        }else {
            System.out.println("Error, la serie solo tiene 5 episodios");
        }
        
    }
    
}

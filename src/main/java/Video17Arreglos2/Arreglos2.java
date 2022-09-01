
package Video17Arreglos2;

import java.util.Scanner;

/**
 *
 * @author Ana
 */
public class Arreglos2 {
    
    public static void main(String[] args) {
        
        System.out.println("Escribe el numero de episodios que quisieras saber su duración");
        Scanner scanner = new Scanner(System.in);
        int episodioIndex = scanner.nextInt();
        episodioIndex--; //Se toma un numero antes de
        
        int[] episodioDuracionArray = new int []{30,32,27,31,60};//Manera para ahorrar codigo
        int n = episodioDuracionArray.length;
        
        //Codigo que ahorramos
        /*episodiosDuracionArray [0] = 30;
        * episodiosDuracionArray [1] = 32;
        * episodiosDuracionArray [2] = 27;
        * episodiosDuracionArray [3] = 31;
        * episodiosDuracionArray [4] = 60;
        */
        
        if (episodioIndex >= 0 && episodioIndex < n){
            int episodioDuracion = episodioDuracionArray[episodioIndex];
            System.out.println("El episodio dura" + episodioDuracion + "minutos");
        }else {
            System.out.println("Error, la serie solo tiene 5 episodios");
        }
        
    }
}

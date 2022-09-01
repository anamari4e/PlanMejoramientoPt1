
package Video15Scanners;

import java.util.Scanner;

/**
 *
 * @author Ana
 */
public class Scanners {
    public static void main(String[] args) {
        
        System.out.println("¿Qué día de la semana es (Lunes es 1 - Domingo es 7):\n");
        
         Scanner dia = new Scanner(System.in);
        
        int DiaSemana = dia.nextInt();
        
        switch (DiaSemana) {
            case 1:
                System.out.println("Es Lunes de Comedia");
                break;//Rompe el ciclo y no lo vuelve repetitivo
            case 2:
                System.out.println("Martes de Drama");
                break;
            case 3:
                System.out.println("Miercoles de Acción");
                break;
            case 4:
                System.out.println("Jueves de Animadas");
                break;
            case 5:
                System.out.println("Viernes de Terror");
                break;
            case 6:
                System.out.println("Sabado de Documentales");
                break;
            case 7:
                System.out.println("Domingo de Comodin");
                break;    
            default:
                System.out.println("¿En que dÍa vives?");
        }
    }
    }


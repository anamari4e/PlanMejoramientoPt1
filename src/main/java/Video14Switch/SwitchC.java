
package Video14Switch;

/**
 *
 * @author Ana
 */
public class SwitchC {
    
    public static void main(String[] args) {
        int DiaSemana = 1;
        
        //el switch es como un if y else, solo que este no necesita tanto codigo.
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

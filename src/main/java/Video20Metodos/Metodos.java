
package Video20Metodos;

/**
 *
 * @author Ana
 */
public class Metodos {
    
    public static void main(String[] args) {
        reproducirPelicula();
        System.out.println("ANA");
        pausa();
    }
    
    public static void reproducirPelicula() {
        for (int i = 0; i < 10; i++){
            System.out.println("Reproduciendo Pelicula");
        }
    }
    
    public static void pausa() {
        System.out.println("Pelicula Pausada");
    }
    
    
}


package Video13DoWhile;

/**
 *
 * @author Ana
 */
public class CicloDoWhile {
    public static void main(String[] args) {
        
        int duracion=10;
        
        int k = 0;
        do {
            if (k < 3 ){
                System.out.println("Reproduciendo intro, segundo = "+k);
            }else if(k < 7 ){
                System.out.println("Reproduciendo pelicula, segundo = "+k);
            }else{
                System.out.println("Reproduciendo creditos, segundo = "+k);
            }
        } while (k <= duracion);
    }
    }


package Video11While;

/**
 *
 * @author Ana
 */
public class CicloWhile {
    public static void main(String[] args) {
        
        int i=0;
        int duracion= 10;
        
        while(i<10){
            System.out.println("Imprimiendo i= "+i);
            i= i+1;
            i++;
        }
        
        while(i<=duracion){
            if(i<3){
                 System.out.println("Reproduciendo intro= ");
            }else if( i<7){
                System.out.println("Reproduciendo pelicula");
            }
                   
        }
        
    }
}

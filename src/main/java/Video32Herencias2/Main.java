
package Video32Herencias2;

/**
 *
 * @author Ana
 */
public class Main {
    public static void main(String[] args) {
        Movie toyStory= new Movie("Toy Story","Infantil",120);
        
        toyStory.setName("Toy Story");
        toyStory.setGenero("Infantil");
        toyStory.setGanarOscar(true);
        
        
        Series scorpion= new Series("Scorpion","Ciencia Ficcion",4);
        scorpion.setName("Scorpion");
        scorpion.setGenero("Ciencia Ficcion");
        scorpion.setTotalTemporada(4);
        }
    
}

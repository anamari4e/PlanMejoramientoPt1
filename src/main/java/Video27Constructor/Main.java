
package Video27Constructor;

/**
 *
 * @author Ana
 */
public class Main {
    public static void main(String[] args) {
        Movie toyStory= new Movie("Toy Story","Familiar",90);
        
        toyStory.setName("Toy Story");
        toyStory.setGenero("Familar");
        toyStory.setDuracion(90);
        
        System.out.println(toyStory.getName()+""+toyStory.getGenero()+""+toyStory.getDuracion());
    }
}

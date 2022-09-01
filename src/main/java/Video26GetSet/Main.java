
package Video26GetSet;

/**
 *
 * @author Ana
 */
public class Main {
    public static void main(String[] args) {
        Movie toyStory= new Movie();
        
        toyStory.setName("Toy Story");
        toyStory.setGenero("Familar");
        toyStory.setDuracion(90);
        
        System.out.println(toyStory.getName()+""+toyStory.getGenero()+""+toyStory.getDuracion());
    }
}

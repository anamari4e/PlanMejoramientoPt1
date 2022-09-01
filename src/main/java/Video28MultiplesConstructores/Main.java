
package Video28MultiplesConstructores;

/**
 *
 * @author Ana
 */
public class Main {
    public static void main(String[] args) {
        Movie toyStory= new Movie("Toy Story","Familiar",90);
        Movie barbie= new Movie("Barbie","Infantil",110);
        Movie actividadParanormal= new Movie("Actividad Paranormal","Terror",110);
        
        
        
        System.out.println(toyStory.getName()+""+toyStory.getGenero()+""+toyStory.getDuracion());
        System.out.println(barbie.getName()+""+barbie.getGenero()+""+barbie.getDuracion());
        System.out.println(actividadParanormal.getName()+""+actividadParanormal.getGenero()+""+actividadParanormal.getDuracion());
    }
}

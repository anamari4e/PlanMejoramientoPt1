
package Video30toString;

/**
 *
 * @author Ana
 */
public class Main {
    public static void main(String[] args) {
        Movie toyStory= new Movie("Toy Story","Familiar",90);
        Movie barbie= new Movie("Barbie","Infantil",110);
        Movie actividadParanormal= new Movie("Actividad Paranormal","Terror",110);
        
        toyStory.play();
        barbie.pause();
        actividadParanormal.play();
        
        
        int toyStoryTotalFrames= toyStory.getTotalFrames();
        System.out.println("Total frames:"+toyStoryTotalFrames);
        
        int barbieTotalFrames= barbie.getTotalFrames();
        System.out.println("Total frames:"+barbieTotalFrames);
        }
}

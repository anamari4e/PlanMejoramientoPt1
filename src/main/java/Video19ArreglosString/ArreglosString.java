
package Video19ArreglosString;

/**
 *
 * @author Ana
 */
public class ArreglosString {
    
    
    public static void main(String[] args) {
        String [] tituloPeliculaArray = new String []{"Up","Titanic","Aladdin","Avengers","Matrix","Minions"};
        
        for (String titulo : tituloPeliculaArray ){
            if (!titulo.contains("i")){
                System.out.println(titulo);
            }
        }
    }
}

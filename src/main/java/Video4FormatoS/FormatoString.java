
package Video4FormatoS;

/**
 *
 * @author Ana
 */
public class FormatoString {
    public static void main(String[] args) {
        
        int edad= 19;//numero entero
        float altura= 1.70f; //flotantes o decimales cortos
        
        System.out.println(String.format("Mi edad es %d %d",edad, 20)); //d enteros y long
        
        System.out.println(String.format("Mi altura es %.2f ",altura)); //f flotantes o double
        
    }
}

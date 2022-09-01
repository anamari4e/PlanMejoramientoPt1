
package Video22Return;

/**
 *
 * @author Ana
 */
public class ReturnMetodo {
    
    public static void main(String[] args) {
                
        String [] tituloArray = new String []{"Barbie","Minions","Actividad Paranormal","Peppa","Votos de Amor","Destino final", "Iron Man"};
        
        
        String titulo= play(tituloArray,5);
        System.out.println("");
        pausa(titulo);
    }    
    
    public static String play(String[] tituloArray, int index){
        if (index < tituloArray.length ) { 
            String titulo = tituloArray [index];
            
            for (int i = 0; i < 10; i++){
                System.out.println("Esta corriendo la pelicula"+titulo);
            }
            return titulo;
        }else{
            System.out.println("El indice es muy grande");
            return"";
        }
    }
    public static void pausa(String titulo) {
        if (titulo.isEmpty()){
            System.out.println("La pelicula no se reproduce");
        }else{
            System.out.println("La pelicula esta en pausa"+titulo);
        } 
       
    }     
    
}


package Video18ArreglosyLoops;

/**
 *
 * @author Ana
 */
public class ArreglosyLoops {
    
    //Arreglo
    public static void main(String[] args) {
        int[] episodioDuracionArray = new int []{30,32,27,31,60};
        //int n=episodioDuracionArray.length;
        
        int DuracionTemporada = 0;
        
        /*
        for(int i = 0; 1 i < n ; i++)^{
        DuracionTemporada= DuracionTemporada+ episodioDuracionArray[1];
        }
        */
        for (int value : episodioDuracionArray ){
            DuracionTemporada +=value;
        }
        System.out.println(DuracionTemporada);
    }
}

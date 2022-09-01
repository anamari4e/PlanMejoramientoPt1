
package Video31MyVEstatica;

/**
 *
 * @author Ana
 */
public class Movie {
    
    static final int FRAME_RESOLUTION=60;
    static final int SECONDS_IN_A_MINUTE=60;
    
    String name;
    String genero;
    int duracion;
    
    
    
     public static int getTotalFrames(int duracion){
        return duracion*SECONDS_IN_A_MINUTE*FRAME_RESOLUTION;
    }

 
    public Movie(String name, String genero) {
        this.name = name;
        this.genero = genero;
        this.duracion = 0;
    }
    
    public Movie(String name, String genero, int duracion){
        this.name=name;
        this.genero=genero;
        this.duracion=duracion;
    }
   
    
    public Movie(){
        this.name= "No nombre";
        this.genero="No genero";
        this.duracion=0;
    }
    
    
    
    public String getName(){
        return "Este es el nombre de la pelicula:"+ name;
    }
    
    public String getGenero(){
        return "Este es el genero de la pelicula:"+ genero;
    }
    
    public int getDuracion(){
        return  duracion;
    }
    
    public void setName(String name){
        this.name=name;
    }
    
    public void setGenero(String genero){
        this.genero=genero;
    }
    
    public void setDuracion(int duracion){
        this.duracion=duracion;
    }
    
    public void play(){
        
            System.out.println("Se esta reproduciendo la pelicula: "+name);
    }
    
    public void pause(){
        
            System.out.println("Se pausa la pelicula: "+name);
    }
    
   
    
    @Override
    public String toString(){
        return "La pelicula es: "+name+" el genero es: "+genero+" y su duracion es: "+duracion;
    }
    
}

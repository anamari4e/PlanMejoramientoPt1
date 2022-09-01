
package Video28MultiplesConstructores;

/**
 *
 * @author Ana
 */
public class Movie {
    
    String name;
    String genero;
    int duracion;

 
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
}


package Video32Herencias2;

/**
 *
 * @author Ana
 */
public class Movie extends Media {
    
    boolean ganarOscar;

    public Movie(boolean ganarOscar, String name, String genero, int duracion) {
        super(name, genero, duracion);
        this.ganarOscar = ganarOscar;
    }
    public Movie(String name, String genero, int duracion) {
        super("Toy Story","Ciencia Ficcion",120);
    }
    
    public Movie() {
        super("","",0);
    }
    
    

    public boolean isGanarOscar() {
        return ganarOscar;
    }

    public void setGanarOscar(boolean ganarOscar) {
        this.ganarOscar = ganarOscar;
    }
    
    
    
    
    
}

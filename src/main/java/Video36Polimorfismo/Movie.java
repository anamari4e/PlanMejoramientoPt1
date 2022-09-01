
package Video36Polimorfismo;

/**
 *
 * @author Ana
 */
public class Movie extends Media {
    private boolean ganarOscar;

    public Movie(boolean ganarOscar, String name, String genero, int duracion) {
        super(name, genero, duracion);
        this.ganarOscar = ganarOscar;
    }
    
    
    @Override
    public int getDuracion(){
       return super.getDuracion(); 
    }
           

    public boolean isGanarOscar() {
        return ganarOscar;
    }

    public void setGanarOscar(boolean ganarOscar) {
        this.ganarOscar = ganarOscar;
    }
}

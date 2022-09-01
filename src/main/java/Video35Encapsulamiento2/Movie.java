
package Video35Encapsulamiento2;

/**
 *
 * @author Ana
 */
public class Movie extends Media{
    private boolean ganarOscar;

    public Movie(boolean ganarOscar, String name, String genero, int duracion) {
        super(name, genero, duracion);
        this.ganarOscar = ganarOscar;
    }
    

    public boolean isGanarOscar() {
        return ganarOscar;
    }

    public void setGanarOscar(boolean ganarOscar) {
        this.ganarOscar = ganarOscar;
    }
}

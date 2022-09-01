
package Video37ThreadSleep;

/**
 *
 * @author Ana
 */
public class Movie extends Media{
    
    private boolean premioOscar;
    
    public Movie(String titulo,String genero, int duracion){
        super(titulo,genero,duracion);
    }
    
    @Override
    public int getDuracion(){
        return super.getDuracion();
    }

    public boolean isPremioOscar() {
        return premioOscar;
    }

    public void setPremioOscar(boolean premioOscar) {
        this.premioOscar = premioOscar;
    }
}

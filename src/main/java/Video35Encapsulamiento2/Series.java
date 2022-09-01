
package Video35Encapsulamiento2;

/**
 *
 * @author Ana
 */
public class Series extends Media{
    
    private int totalEpisodios;
    private int totalTemporada;
    private int duracionEpisodio;

    public Series(int totalEpisodios, int totalTemporada, int duracionEpisodio, String name, String genero, int duracion) {
        super(name, genero, duracion);
        this.totalEpisodios = totalEpisodios;
        this.totalTemporada = totalTemporada;
        this.duracionEpisodio = duracionEpisodio;
    }
    
    public Series(String name, String genero, int duracion) {
        super("Scorpion","Ciencia Ficcion",0);
    }
    
    public Series() {
        super("","",0);
    }
    
    

    public int getTotalEpisodios() {
        return totalEpisodios;
    }

    public void setTotalEpisodios(int totalEpisodios) {
        this.totalEpisodios = totalEpisodios;
    }

    public int getTotalTemporada() {
        return totalTemporada;
    }

    public void setTotalTemporada(int totalTemporada) {
        this.totalTemporada = totalTemporada;
    }

    public int getDuracionEpisodio() {
        return duracionEpisodio;
    }

    public void setDuracionEpisodio(int duracionEpisodio) {
        this.duracionEpisodio = duracionEpisodio;
    }
}

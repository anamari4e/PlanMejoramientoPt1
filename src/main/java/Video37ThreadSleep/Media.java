
package Video37ThreadSleep;

/**
 *
 * @author Ana
 */
public class Media {
    
    private String titulo;
    private String genero;
    private int duracion;
    private String synopsis;

    public Media(String titulo, String genero, int duracion) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }
    
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    public void play(){
        printSomething("Reproducir "+titulo);
    }
    public void pausa(){
        printSomething("Pausar "+titulo);
    }
    
    public void descargas(){
        printSomething("Descargando "+titulo);
        try {
            Thread.sleep(5000);
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(titulo+"Descargado!");
    }
    
    private void printSomething( String something ){
        System.out.println(something);
    }
    
    public void moveForward(int minutos){
        printSomething("Adelantar "+ minutos+ "minutos");
    }

    @Override
    public String toString() {
        return "Media titulo es " + titulo + ", genero " + genero + ", duracion " + duracion;
    }
}

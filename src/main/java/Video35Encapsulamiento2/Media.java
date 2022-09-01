
package Video35Encapsulamiento2;

/**
 *
 * @author Ana
 */
public class Media {
    
    private String name;
    private String genero;
    private int duracion;

    public Media(String name, String genero, int duracion) {
        this.name = name;
        this.genero = genero;
        this.duracion = duracion;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    
    private void printSomething(String something){
        System.out.println(something);
        
    }
}

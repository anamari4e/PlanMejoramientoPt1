/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Video41InterfacesII;

/**
 *
 * @author DORITA
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

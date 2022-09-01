
package Video8OperacionCom;

/**
 *
 * @author Ana
 */
public class OperacionCompleja {
    public static void main(String[] args) {
        //Circulo
        
        int r= 60;
        
        double pi= 3.1416;
        double cArea= pi*Math.pow(r,2);
        
        Math.pow(r,2);
        System.out.println("El doble del pi es "+cArea);
        
        
         //triangulo
         
        int b=5;
        int a=3;
        
        double sumaCatetos= Math.pow(a,2)+ Math.pow(b,2);//exponente
        double area= Math.sqrt(sumaCatetos);//raiz
        System.out.println(+area);
    }
}

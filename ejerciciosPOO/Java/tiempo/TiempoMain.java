package tiempo;

/**
 * Clase de prueba (principal) que ejecuta las instancias de la clase Teimpo.
 * 
 * @author Francisco Javier González Sabariego
 *
 */
public class TiempoMain {
  public static void main(String[] args) {
    
    Tiempo time1 = new Tiempo(7,40,50);
    
    Tiempo time2 = new Tiempo(23,22,30);
    
    Tiempo time3 = new Tiempo(0,0,0);
    
    Tiempo time4 = new Tiempo(23,59,59);
    
    time1.suma(time2);
    
    time3.resta(time4);
    
    System.out.println(time1.toString());
    
    System.out.println(time2.toString());
    
    System.out.println(time3.toString());
    
  }
}

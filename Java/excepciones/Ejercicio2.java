package excepciones;

/**
 * Ejercicio 2
 * 
 * Modifica la clase Gato vista anteriormente añadiendo el método apareaCon.
 * Este método debe comprobar que los gatos son de distinto sexo, tras lo
 * cual, genera un nuevo gato. Por ejemplo, sería válido algo como Gato cria
 * = garfield.apareaCon(lisa). En caso de que los gatos sean del mismo sexo,
 * el método debe generar la excepción ExcepcionApareamientoImposible. Crea un
 * programa desde el que se pruebe el método.
 * 
 * 
 * @author Francisco Javier González Sabariego
 *
 */
public class Ejercicio2 {
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    GatoSimple garfield = new GatoSimple("macho");
    GatoSimple lisa = new GatoSimple("hembra");
    GatoSimple tom = new GatoSimple("macho");
    
    System.out.println("Garfield trata de aparearse con Tom");
    try {
      garfield.apareaCon(tom);
    } catch (ExcepcionApareamientoImposible eai) {}
    
    System.out.println("\nGarfield trata de aparearse con Lisa");
    try {
      garfield.apareaCon(lisa);
      GatoSimple cria = new GatoSimple();
    } catch (ExcepcionApareamientoImposible eai) {}   
    
  }
}

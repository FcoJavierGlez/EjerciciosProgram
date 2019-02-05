package vehiculo;

/**
 * Clase Coche, subclase de Vehiculo.<br><br>
 * 
 * Hace uso de los siguientes métodos:<br><br>
 * 
 * <ul>
 * <li>Coche()</li>
 * <li>getQuemaRueda()</li>
 * </ul>
 * 
 * @author Francisco Javier González Sabariego
 *
 */
public class Coche extends Vehiculo {  
  
  public Coche (String marca, String modelo) {
    
    super(marca, modelo);
    
  }
  
  
  /**
   * La instancia de la clase Coche quema rueda.
   * 
   * @return Devuelve String "Estoy quemando rueda."
   */
  protected String getQuemaRueda() {
    
    return "\nEstoy quemando rueda.";
    
  }
  
  
}
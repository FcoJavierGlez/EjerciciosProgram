package vehiculo;

/**
 * Clase Bicicleta, subclase de Vehiculo.<br><br>
 * 
 * Hace uso de los siguientes métodos:<br><br>
 * 
 * <ul>
 * <li>Bicicleta()</li>
 * <li>getHazCaballito()</li>
 * </ul>
 * 
 * @author Francisco Javier González Sabariego
 *
 */
public class Bicicleta extends Vehiculo {             //Subclase Bicicleta que hereda de la superclase Vehiculo:
  
  public Bicicleta(String marca, String modelo) {     //
    
    super(marca, modelo);    
    
  }
  
  
  /**
   * La instancia de la clase Bicicleta hace el caballito.
   * 
   * @return Devuelve String "Estoy haciendo el caballito"
   */
  protected String getHazCaballito() {
    
    return "\n\nEstoy haciendo el caballito";
    
  }
  
}

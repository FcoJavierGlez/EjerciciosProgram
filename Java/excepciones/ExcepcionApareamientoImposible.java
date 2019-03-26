package excepciones;

/**
 * Excepción que se lanza cuando se tratan de aparear a dos gatos del mismo sexo.
 * 
 * @author Francisco Javier González Sabariego
 *
 */
public class ExcepcionApareamientoImposible extends Exception {
  public ExcepcionApareamientoImposible() {
    //System.err.println("No pueden aparearse dos gatos del mismo sexo.");
    System.out.println("No pueden aparearse dos gatos del mismo sexo.");
  }
}

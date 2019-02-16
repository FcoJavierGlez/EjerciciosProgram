package terminal;

/**
 * 
 * @author Francisco Javier González Sabariego
 *
 */
public class Terminal {
  
  //Variables
  protected String numeroTlf = "";  
  protected int tiempoLlamada;                  //Tiempo de llamada tanto si la realizada como si la recibe.
  protected int tiempoLlamadaRealizada;         //Tiempo de llamada si la realiza.
  
  
  //Métodos:
  /**
   * Constructor
   * @param numero  Número (String) del terminal
   */
  public Terminal(String numero) {
    
    numeroTlf = numero;    
    tiempoLlamada = 0;
    tiempoLlamadaRealizada = 0;
    
  }
  
  
  /**
   * Método toString.
   * 
   * @return Devuelve el estado del objeto en forma de (String)
   */
  public String toString() {
    
    return "Nº " + this.numeroTlf + " - " + this.tiempoLlamada + "s de conversación";
    
  }
  
  
  /**
   * Método que cuenta la duración de una llamada desde una instancia de la
   * Clase Terminal a otra instancia de la misma (el tiempo de llamada, se 
   * suma para ambas instancias, tanto para el llamado como para el llamante).
   * 
   * @param tlf     Instancia que recibe la llamada.
   * @param tiempo  Cantidad de segundos (int) que dura la llamada.
   */
  public void llama(Terminal tlf, int tiempo) {
    
    this.tiempoLlamada += tiempo;
    this.tiempoLlamadaRealizada = this.tiempoLlamada;   //Almaceno duración de llamada para el llamante
    tlf.tiempoLlamada += tiempo;
    
  }
  
  
  /**
   * Devuelve el tiempo que ha durado la llamda.
   * 
   * @return  segundos (int) de llamada.
   */
  public int getTiempoLlamada() {   
    
    return this.tiempoLlamada;
    
  }
  
  
  /**
   * Devuelve el tiempo acumulado de llamadas realizadas.
   * 
   * @return  Segundos (int) llamadas realizadas.
   */
  public int getTiempoLlamadaRealizada() {   
    
    return this.tiempoLlamadaRealizada;
    
  }
  
}

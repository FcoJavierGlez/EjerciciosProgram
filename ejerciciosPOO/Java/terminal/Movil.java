package terminal;

public class Movil extends Terminal {
  
  //Variables:
  private String tarifa;
  
  private double factura;
  
  //Métodos:
  
  /**
   * Constructor.
   * @param numero  Número (String) del terminal.
   * @param tarif   Tarifa (String) asociada al terminal.
   */
  public Movil (String numero, String tarif) {
    
    super(numero);    
    tarifa = tarif;    
    factura = 0;
    
  }
  
  
  /**
   * Obtiene el total de facturación de cada terminal, en función 
   * del tiempo de las llamadas que ha realizado y de la tarifa 
   * que tenga contratada.
   * 
   * @return Total a pagar (double), en euros, de factura
   */
  protected double getFactura() {
    
    /*
     * Si tiene un tipo de tarifa u otro multiplica el precio por segundos
     * al tiempo de llamada realizado por el móvil y lo divide entre 100 
     * para entregar un valor en euros.
     */
    if (this.tarifa.toUpperCase().equals("RATA")) {
      
      this.factura += (this.getTiempoLlamadaRealizada()*0.1)/100;
      
    } else if (this.tarifa.toUpperCase().equals("MONO")) {
      
      this.factura += (this.getTiempoLlamadaRealizada()*0.2)/100;
      
    } else {
      
      this.factura += (this.getTiempoLlamadaRealizada()*0.5)/100;
      
    }
    
    return factura;    
    
  }
  
  /**
   * Método toString, retorna el estado del terminal.
   * 
   * @return Retorna (String) estado del móvil.
   */
  @Override
  public String toString() {
    
    return "Nº " + this.numeroTlf + " - " + this.tiempoLlamada + "s de conversación - tarificados " 
            + this.getFactura() + " euros";
    
  }
  
}

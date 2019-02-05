package vehiculo;

/**
 * Clase Vehiculo, superclase de las clases Coche y Bicicleta.<br><br>
 * 
 * Hace uso de los siguientes métodos:<br><br>
 * 
 * <ul>
 * <li>Vehiculo()</li>
 * <li>setKilometrajeTotal()</li>
 * <li>setAnda()</li>
 * <li>getKilometraje()</li>
 * <li>getKilometrajeTotal()</li>
 * <li>setTotalVehiculos()</li>
 * </ul>
 * 
 * @author Francisco Javier González Sabariego
 *
 */
public abstract class Vehiculo {
  
  //Variables de clase:
  private static double kilometrajeTotal = 0;
  
  protected double kilometros;
  
  protected static int totalVehiculos = 0;
  
  protected static String marcaVehiculo = "";
  
  protected static String modeloVehiculo = "";
  
  /**
   * Constructor.
   * 
   * @param marca   Marca (String) del vehículo.
   * @param modelo  Modelo (String) del vehículo.
   */
  public Vehiculo(String marca, String modelo) {
    
    totalVehiculos++;
    
    marcaVehiculo = marca;
    
    modeloVehiculo = modelo;
    
    kilometros = 0;
    
  }
  
  
  /**
   * Aumenta el kilometraje total (suma de todos los km recorridos por cada vehículo).
   * 
   * @param km  Introduce (double) cantidad de km recorridos por todos los vehículos.
   */
  protected static void setKilometrajeTotal(double km) {
    
    Vehiculo.kilometrajeTotal += km;
    
  }
  
  
  /**
   * Añade cantidad de km que recorre una instancia de las subclases Coche y Bicicleta.
   * 
   * @param km  Introduce (double) cantidad de km recorridos por todos la instancia.
   */
  protected void setAnda(double km) {
    
    this.kilometros += km;
    
    Vehiculo.setKilometrajeTotal(km);      //También vale super.setKilometrajeTotal
    
  }
  
  
  /**
   * Muestra la cantidad de km que ha recorrido una instancia de la subclase Coche y Bicicleta.
   * 
   * @return Devuelve (double) cantidad de km recorridos por todos la instancia.
   */
  protected double getKilometraje() {
    
    return kilometros;
    
  }
  
  
  /**
   * Muestra el kilometraje total (suma de todos los km recorridos por cada vehículo).
   * 
   * @return Devuelve (double) con la cantidad de vehículos creados. 
   */
  protected static double getKilometrajeTotal() {
    
    return kilometrajeTotal;
    
  }
  
  
  /**
   *  Cada instancia que se crea de la superclase Vehiculo incrementa la cantidad total 
   *  de vehículos existentes.
   *  
   * @return  Devuelve (entero) con la cantidad de vehículos creados.
   */
  protected static int getTotalVehiculos() {
    
    return totalVehiculos;
    
  }
  
}

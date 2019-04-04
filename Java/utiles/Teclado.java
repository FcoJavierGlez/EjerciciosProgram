package utiles;

import java.util.Scanner;

/**
 * Clase teclado, lee la entrada de datos y retorna el valor si es correcto.
 * 
 * @author Francisco Javier González Sabariego
 *
 */
public class Teclado {
  
  Scanner s = new Scanner(System.in);
  
  /**
   * Constructor Clase Teclado.
   */
  public Teclado() {
    
  }
  
  /**
   * Lee y devuelve una cadena.
   * 
   * @return Cadena de caracteres (String).
   */
  public String leeCadena() {
    String cadena = "";
    cadena = s.nextLine();
    return cadena;
  }
  
  /**
   * Imprime un mensaje por pantalla, lee y devuelve una cadena.
   * 
   * @return Cadena de caracteres (String).
   */
  public String leeCadena(String mensaje) {
    System.out.println(mensaje);
    String cadena = "";
    cadena = s.nextLine();
    return cadena;
  }
  
  /**
   * Lee y devuelve un entero.
   * 
   * @return Número entero (int).
   */
  public int leeEntero() {
    int numero = 0;
    try {
      numero = Integer.parseInt(leeCadena());
    } catch (Exception e) {
      System.err.println("No ha insertado un número entero. Por defecto valdrá 0.");
    }    
    return numero;
  }
  
  /**
   * Imprime un mensaje por pantalla, lee y devuelve un entero.
   * 
   * @return Número entero (int).
   */
  public int leeEntero(String mensaje) {
    int numero = 0;
    try {
      numero = Integer.parseInt(leeCadena(mensaje));
    } catch (Exception e) {
      System.err.println("No ha insertado un número entero. Por defecto valdrá 0.");
    } 
    return numero;
  }
  
  /**
   * Lee y devuelve un decimal.
   * 
   * @return Número decimal (double).
   */
  public double leeDecimal() {
    double numero = 0;
    try {
      numero = Double.parseDouble(leeCadena());
    } catch (Exception e) {
      System.err.println("No ha insertado un número decimal. Por defecto valdrá 0.");
    }    
    return numero;
  }
  
  /**
   * Imprime un mensaje por pantalla, lee y devuelve un decimal.
   * 
   * @return Número decimal (double).
   */
  public double leeDecimal(String mensaje) {
    double numero = 0;
    try {
      numero = Double.parseDouble(leeCadena(mensaje));
    } catch (Exception e) {
      System.err.println("No ha insertado un número decimal. Por defecto valdrá 0.");
    } 
    return numero;
  }  
  
}

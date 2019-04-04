package ficheros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Ejercicio 1
 * 
 * Escribe un programa que guarde en un fichero con nombre primos.dat los
 * números primos que hay entre 1 y 500.
 * 
 * 
 * @author Francisco Javier González Sabariego
 *
 */
public class Ejercicio1 {
  public static void main(String[] args) {
    
    try {
      BufferedWriter w = new BufferedWriter(new FileWriter("ejercicio1.txt"));
      
      for (int i=2; i<501; i++) {
        if (esPrimo(i))
          w.write(Integer.toString(i) + "\n");
      }
      
      w.close();
      
    } catch (IOException ioe) {
      System.err.println("No se ha podido escribir en el fichero.");
    }
    
  }
  
  /**
   * Determina si el número introducido es o no primo.
   * 
   * @param entrada Número (int) a comprobar si es primo
   * @return        True si el número de entrada es primo, False si no lo es
   */
  private static boolean esPrimo(int entrada) {
    int divisor=2;
    
    while (divisor<=Math.sqrt(entrada) || entrada==0 || entrada==1) {
      if (entrada%divisor==0 || entrada==1) {
        return false;
      }
      divisor++;
    }
    return true;
  }
  
}

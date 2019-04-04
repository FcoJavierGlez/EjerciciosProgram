package ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Ejercicio 2
 * 
 * Realiza un programa que lea el fichero creado en el ejercicio anterior y que
 * muestre los números por pantalla.
 * 
 * 
 * @author Francisco Javier González Sabariego
 *
 */
public class Ejercicio2 {
  public static void main(String[] args) {
    
    String linea = "";
    
    try {
      BufferedReader r = new BufferedReader(new FileReader("ejercicio1.txt"));
      
      linea = r.readLine();
      
      while(linea != null) {
        System.out.println(linea);
        linea = r.readLine();        
      }
      
      r.close();
      
    } catch (IOException ioe) {
      System.err.println("No se ha podido leer el fichero.");
    }
    
  }
}

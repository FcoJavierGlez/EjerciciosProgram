package ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Ejercicio 6
 * 
 * Realiza un programa que diga cuántas ocurrencias de una palabra hay en un
 * fichero. Tanto el nombre del fichero como la palabra se deben pasar como
 * argumentos en la línea de comandos.
 * 
 * 
 * @author Francisco Javier González Sabariego
 *
 */
public class Ejercicio6 {
  public static void main(String[] args) {
    
    //Scanner:
    Scanner s = new Scanner(System.in);
    
    //Variables:
    String linea = "";
    String palabra = "";
    int contador = 0;
    
    System.out.println("Dime la palabra que deseas buscar en el archivo:");
    palabra = s.nextLine();
    
    try {
      BufferedReader r = new BufferedReader(new FileReader("ejercicio6.txt"));
      
      linea = r.readLine();
      
      while(linea != null) {
        if (palabra.equals(linea))
          contador++;
        linea = r.readLine();        
      }
      
      r.close();
      
    } catch (IOException ioe) {
      System.err.println("No se ha podido leer el fichero.");
    }
    
    if (contador==0) {
      System.out.println("No se ha encontrado ninguna ocurrencia de la palabra: " + palabra);
    } else {
      System.out.println("Se han encontrado " + contador + " ocurrencias de la palabra: " + palabra);
    }
    
    s.close();
    
  }
}

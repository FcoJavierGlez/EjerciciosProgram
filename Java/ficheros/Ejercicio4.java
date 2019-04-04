package ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Ejercicio 4
 * 
 * Realiza un programa que sea capaz de ordenar alfabéticamente las palabras
 * contenidas en un fichero de texto. El nombre del fichero que contiene las
 * palabras se debe pasar como argumento en la línea de comandos. El nombre
 * del fichero resultado debe ser el mismo que el original añadiendo la coletilla
 * sort, por ejemplo palabras_sort.txt. Suponemos que cada palabra ocupa una
 * línea.
 * 
 * 
 * @author Francisco Javier González Sabariego
 *
 */
public class Ejercicio4 {
  public static void main(String[] args) {
    
    //Scanner:
    Scanner s = new Scanner(System.in);
    
    //Variables:
    String nombre = "";
    String linea = "";
    
    //ArrayList:
    ArrayList<String> lista = new ArrayList<String>();
    
    
    System.out.println("Dime el nombre del archivo:");
    nombre = s.nextLine();
    
    //Lectura del fichero
    try {
      BufferedReader r = new BufferedReader(new FileReader(nombre));
      
      linea = r.readLine();
      
      while(linea != null) {
        lista.add(linea);
        linea = r.readLine();        
      }
      
      r.close();
      
    } catch (IOException ioe) {
      System.err.println("No se ha podido leer el fichero.");
    }    
    
    
    Collections.sort(lista);
    
    //Escritura del fichero reordenado
    try {
      BufferedWriter w = new BufferedWriter(new FileWriter("palabras_sort.txt"));
      
      for (int i=0; i<lista.size(); i++) {
        if (i==lista.size()-1) {
          w.write(lista.get(i));
        } else {
          w.write(lista.get(i) + "\n");
        }        
      }
      
      w.close();
      
    } catch (IOException ioe) {
      System.err.println("No se ha podido escribir en el fichero.");
    }
    
    s.close();
    
  }
}

package diccionariosycolecciones;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 
 * Ejercicio 10
 * 
 * Crea un mini-diccionario español-inglés que contenga, al menos, 20 palabras
 * (con su correspondiente traducción). Utiliza un objeto de la clase HashMap para
 * almacenar las parejas de palabras. El programa pedirá una palabra en español
 * y dará la correspondiente traducción en inglés.
 * 
 * 
 * @author Francisco Javier González Sabariego
 *
 */
public class Ejercicio10 {
  public static void main(String[] args) {
    //Diccionario:    
    HashMap<String, String> d = new HashMap<String, String>();
    
    d.put("casa", "house");
    d.put("agua", "water");
    d.put("fuego", "fire");
    d.put("tierra", "dirt");
    d.put("aire", "air");
    d.put("camino", "path");
    d.put("rojo", "red");
    d.put("azul", "blue");
    d.put("verde", "green");
    d.put("morado", "purple");
    d.put("rosa", "pink");
    d.put("negro", "black");
    d.put("blanco", "white");
    d.put("amarillo", "yellow");
    d.put("papel", "paper");
    d.put("radio", "radio");
    d.put("noticias", "news");
    d.put("coche", "car");
    d.put("perro", "dog");
    d.put("gato", "cat");
    
    
    String palabra = "";
    
    Scanner s = new Scanner(System.in);
    
//    System.out.println("Los elementos del diccionario son: " + d);
//    
//    System.out.println("EntrySet");
//    System.out.println(d.entrySet());
//    
//    System.out.println("EntrySet");
    
    System.out.println("\nIntroduzca la palabra que desea buscar en el diccionario:");
    palabra = s.nextLine();
    
    for (Map.Entry pareja: d.entrySet()) {      
      if (palabra.equals(pareja.getKey())) {
        System.out.print("\n" + palabra + ": " + pareja.getValue());
      }
    }
    
    
  }
}

package diccionariosycolecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 
 * Ejercicio 11
 * 
 * Realiza un programa que escoja al azar 5 palabras en español del minidiccionario
 * del ejercicio anterior. El programa irá pidiendo que el usuario
 * teclee la traducción al inglés de cada una de las palabras y comprobará si
 * son correctas. Al final, el programa deberá mostrar cuántas respuestas son
 * válidas y cuántas erróneas.
 * 
 * 
 * @author Francisco Javier González Sabariego
 *
 */
public class Ejercicio11 {
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
    
    //ArrayList:
    ArrayList<String> lista = new ArrayList<String>();
    
    lista.add("casa");
    lista.add("agua");
    lista.add("fuego");
    lista.add("tierra");
    lista.add("aire");
    lista.add("camino");
    lista.add("rojo");
    lista.add("azul");
    lista.add("verde");
    lista.add("morado");
    lista.add("rosa");
    lista.add("negro");
    lista.add("blanco");
    lista.add("amarillo");
    lista.add("papel");
    lista.add("radio");
    lista.add("noticias");
    lista.add("coche");
    lista.add("perro");
    lista.add("gato");
    
    //Variables:
    String palabra = "";    
    Scanner s = new Scanner(System.in);    
    int azar=0;
    int aciertos=0;
    
    for (int i=5; i>0; i--) {
      azar = (int)(Math.random()*lista.size());
      System.out.print("\nTienes " + i + " intentos");
      System.out.println("\nTrata de acertar como se escribe la siguiente palabra en inglés:");
      System.out.println(lista.get(azar));
      palabra = s.nextLine();
      
      if (d.get(lista.get(azar)).equals(palabra)) {
        System.out.println("Es correcto.");
        aciertos++;
      } else {
        System.out.println("Incorrecto.");
      }
      
      try {
        Thread.sleep(2000);
      } catch (Exception e) {}
    }
    
    System.out.print("\nRECUENTO FINAL: " + aciertos + " aciertos.");
    
  }
}

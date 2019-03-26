package diccionariosycolecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 
 * Ejercicio 3
 * 
 * Escribe un programa que ordene 10 números enteros introducidos por teclado
 * y almacenados en un objeto de la clase ArrayList.
 * 
 * @author Francisco Javier González Sabariego
 *
 */
public class Ejercicio3 {
  public static void main(String[] args) {
    //Variables:
    int numero = 0;    
    Scanner s = new Scanner(System.in);
    
    ArrayList<Integer> lista = new ArrayList<Integer>();
    
    //Pedimos 10 números enteros:
    for (int i=0; i<10; i++) {
      System.out.println("\nInserte un número entero:");
      numero = s.nextInt();
      lista.add(numero);
    }
    
    //Ordenamos la lista:
    Collections.sort(lista);
    
    //For each para imprimir el array:
    for (Integer resultado: lista) {
      System.out.print("\n" + resultado);
    }
    
  }
}

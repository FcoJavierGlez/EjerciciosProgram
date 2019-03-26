package excepciones;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * Ejercicio 1
 * 
 * Realiza un programa que pida 6 números por teclado y nos diga cuál es el
 * máximo. Si el usuario introduce un dato erróneo (algo que no sea un número
 * entero) el programa debe indicarlo y debe pedir de nuevo el número.
 * 
 * 
 * @author Francisco Javier González Sabariego
 *
 */
public class Ejercicio1 {
  public static void main(String[] args) {
    //Variables:
    int numero = 0;
    int minimo = 999999999;
    int maximo = 0;
    
    //ArrayList:
    ArrayList<Integer> numeros = new ArrayList<Integer>();
    
    //Scanner:
    Scanner s = new Scanner(System.in);
    
    
    for (int i=0; i<6; i++) {      
      try {
        System.out.println("Inserte un número entero: ");
        numero = Integer.parseInt(s.nextLine());
        numeros.add(numero);
      } catch (Exception e) {
        System.out.println("ERROR. Debe insertar un número entero.");
        i--;
      }
    }
    
    System.out.println("Estos son los números que ha insertado:");
    
    for (int i=0; i<numeros.size(); i++) {
      if (minimo>numeros.get(i)) {
        minimo = numeros.get(i);
      }
      
      if (maximo<numeros.get(i)) {
        maximo = numeros.get(i);
      }
      
      System.out.println(numeros.get(i));
    }
    
    System.out.print("\nEl mínimo es: " + minimo);
    System.out.print("\nEl máximo es: " + maximo);
    
  }
}

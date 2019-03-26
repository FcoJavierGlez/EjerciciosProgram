package diccionariosycolecciones;

import java.util.ArrayList;

/**
 * Ejercicio 2:
 * 
 * Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
 * ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de esos
 * números. El tamaño de la lista también será aleatorio y podrá oscilar entre 10
 * y 20 elementos ambos inclusive.

 * @author Francisco Javier González Sabariego
 *
 */
public class Ejercicio2 {
  public static void main(String[] args) {
    //Variables:
    
    int tamanoAleatorio = 0;  //El tamaño de la lista (entre 10 y 20)    
    int numAleatorio = 0;     //Número aleatorio (entre 0 y 100) que se almacena en el ArrayList
    int suma = 0;             //Variable que almacena la suma de todos los valores del ArrayList
    int maximo = 0;           //Variable que almacena el valor máximo del Arraylist
    int minimo = 100;         //Variable que almacena el valor mínimo del Arraylist
    
    ArrayList<Integer> alea = new ArrayList<Integer>();
    
    
    //Definimos el tamaño del array List:
    tamanoAleatorio = (int)(Math.random()*10)+11;
    
    //Insertamos valores en el arrayList:
    for (int i=0; i<tamanoAleatorio; i++) {
      numAleatorio = (int)(Math.random()*101);
      alea.add(numAleatorio);
    }
    
    System.out.print("\n\nEste es el ArrayList: \n");
    
    //Mostramos el arrayList:
    for (int i=0; i<tamanoAleatorio; i++) {
      System.out.print(alea.get(i)+"\n");
      
      suma += alea.get(i);            //Sumamos
      
      if (minimo > alea.get(i)) {     //Calculamos mínimo
        minimo = alea.get(i);
      }
      
      if (maximo < alea.get(i)) {     //Calculamos máximo
        maximo = alea.get(i);
      }
    }
    
    System.out.print("\n\nLa suma es: " + suma);
    System.out.print("\nLa media es : " + (double)suma/alea.size());
    System.out.print("\nEl valor máximo es: " + maximo);
    System.out.print("\nEl valor mínimo es: " + minimo);
    
  }
}

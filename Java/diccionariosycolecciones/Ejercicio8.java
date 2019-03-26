package diccionariosycolecciones;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Ejercicio 8
 * 
 * Realiza un programa que escoja al azar 10 cartas de la baraja española
 * (10 objetos de la clase Carta). Emplea un objeto de la clase ArrayList para
 * almacenarlas y asegúrate de que no se repite ninguna.
 * 
 * @author Francisco Javier González Sabariego
 *
 */
public class Ejercicio8 {
  public static void main(String[] args) {
    //Variables:
    int azar;    
    ArrayList<Carta> carta = new ArrayList<Carta>();
    
    //Generamos la baraja:
    for (int i=1; i<=40; i++) {
      carta.add(new Carta());
    }
    
    //Imprimimos 10 cartas al azar no repetidas:
    for (int i=0; i<10; i++) {
      do {
        azar = (int)(Math.random()*40);
      } while ((carta.get(azar)).getHaSalido());      //Seleccionamos carta
      
      (carta.get(azar)).setHaSalido();                //Modificamos el valor "haSalido"
      
      System.out.print("\nCarta " + (i+1) + ": " + (carta.get(azar)).toString());
    }
    
  }
}

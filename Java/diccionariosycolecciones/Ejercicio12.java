package diccionariosycolecciones;

import java.util.ArrayList;

/**
 * 
 * Ejercicio 12
 * 
 * Escribe un programa que genere una secuencia de 5 cartas de la baraja
 * española y que sume los puntos según el juego de la brisca. El valor de las
 * cartas se debe guardar en una estructura HashMap que debe contener parejas
 * (figura, valor), por ejemplo (“caballo”, 3). La secuencia de cartas debe ser una
 * estructura de la clase ArrayList que contiene objetos de la clase Carta. El valor
 * de las cartas es el siguiente: as → 11, tres → 10, sota → 2, caballo → 3, rey →
 * 4; el resto de cartas no vale nada.
 * 
 * 
 * @author Francisco Javier González Sabariego
 *
 */
public class Ejercicio12 {
  public static void main(String[] args) {
    //Variables:
    int azar;    
    ArrayList<Carta> carta = new ArrayList<Carta>();
    int puntos=0;
    
    //Generamos la baraja:
    for (int i=1; i<=40; i++) {
      carta.add(new Carta());
    }
    
    //Imprimimos 5 cartas al azar no repetidas:
    for (int i=0; i<5; i++) {
      do {
        azar = (int)(Math.random()*40);
      } while ((carta.get(azar)).getHaSalido());      //Seleccionamos carta
      
      (carta.get(azar)).setHaSalido();                //Modificamos el valor "haSalido"
      puntos+=(carta.get(azar)).getPuntosBrisca();
      
      System.out.println("Carta " + (i+1) + ": " + (carta.get(azar)).toString());
    }
    
    //Imprimimos puntos:
    System.out.print("\n\nPuntuación total: " + puntos);
    
    
  }
}

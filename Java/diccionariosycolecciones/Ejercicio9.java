package diccionariosycolecciones;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 
 * Ejercicio 9
 * 
 * Modifica el programa anterior de tal forma que las cartas se muestren ordenadas.
 * Primero se ordenarán por palo: bastos, copas, espadas, oros. Cuando
 * coincida el palo, se ordenará por número: as, 2, 3, 4, 5, 6, 7, sota, caballo, rey.
 * 
 * @author Francisco Javier González Sabariego
 *
 */
public class Ejercicio9 {
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    //Variables:
    int azar;    
    ArrayList<Carta> cartas = new ArrayList<Carta>();
    ArrayList<Carta> lista = new ArrayList<Carta>();
    
    //Generamos la baraja:
    for (int i=1; i<=40; i++) {
      cartas.add(new Carta());
    }
    
    //Guardamos las 10 cartas al azar no repetidas:
    for (int i=0; i<10; i++) {
      do {
        azar = (int)(Math.random()*40);
      } while ((cartas.get(azar)).getHaSalido());
      
      (cartas.get(azar)).setHaSalido();
      
      lista.add(cartas.get(azar));
    }
    
    //Collections.sort(lista, new Comparator<Carta>());
    

    
    //Collections.sort(listaCalles, (o1, o2) -> o1.getCodigo().compareTo(o2.getCodigo()));
    
    Collections.sort(lista, (o1, o2) -> o1.getPalo().compareTo(o2.getPalo()));
    
    //Collections.sort(lista, (o1, o2) -> o1.getNumero()>o2.getNumero());
    
    for (int i=0; i<10; i++) {
      System.out.println((lista.get(i)).toString());
    }
    
  }
}

package vehiculo;

import java.util.Scanner;

/**
 * Ejercicio 2
 * Crea la clase Vehiculo, así como las clases Bicicleta y Coche como subclases de
 * la primera. Para la clase Vehiculo, crea los atributos de clase vehiculosCreadosy
 * kilometrosTotales, así como el atributo de instancia kilometrosRecorridos. Crea
 * también algún método específico para cada una de las subclases. Prueba las
 * clases creadas mediante un programa con un menú como el que se muestra
 * a continuación:<br><br>
 * 
 * VEHÍCULOS<br>
 * =========<br>
 * 1. Anda con la bicicleta<br>
 * 2. Haz el caballito con la bicicleta<br>
 * 3. Anda con el coche<br>
 * 4. Quema rueda con el coche<br>
 * 5. Ver kilometraje de la bicicleta<br>
 * 6. Ver kilometraje del coche<br>
 * 7. Ver kilometraje total<br>
 * 8. Salir<br>
 * Elige una opción (1-8):<br>
 * 
 * @author Francisco Javier González Sabariego
 *
 */
public class VehiculosMain {  
  public static void main (String [] args) {
    
    //Variable selección de menú:
    int opcionMenu;
    
    //Instancias de la clase Coche y Bicicleta, subclases de la superclase Vehiculo:
    Coche coche = new Coche("Ferrari", "F-40");
    
    Bicicleta bici = new Bicicleta("Spinner", "T32-X");
    
    
    //##############     PROGRAMA     ##############\\
    
    do {
      
      opcionMenu = menu();
      
      
      switch(opcionMenu) {
        
      case 1:        
        bici.setAnda(leeKilometros());        
        break;
        
      case 2:
        System.out.print("\n\n" + bici.getHazCaballito());
        break;
        
      case 3:
        coche.setAnda(leeKilometros());
        break;
        
      case 4:
        System.out.print("\n\n" + coche.getQuemaRueda());
        break;
        
      case 5:
        System.out.print("\n\nLa bicicleta ha recorrido: " + bici.getKilometraje());
        break;
        
      case 6:
        System.out.print("\n\nEl coche ha recorrido: " + coche.getKilometraje());
        break;
        
      case 7:
        System.out.print("\n\nEl kilometraje total es: " + Vehiculo.getKilometrajeTotal());
        break;
        
      default:
        System.out.println("\nFIN DE PROGRAMA");
        System.exit(0);
        
      }
      
    } while(true);    //Le pongo verdadero dado que para salir hay que elegir la opción "8".
    
    
  }
  
  //##############     MÉTODOS     ##############\\
  /**
   * Imprime menú, lee la opción elegida y la retorna.
   * 
   * @return  Retorna (entero) opción del menú.
   */
  public static int menu() {
    
    int opcion = 0;
    
    Scanner s = new Scanner(System.in);
    
    do {
      
      System.out.print("\n\nVEHÍCULOS");
      System.out.print("\n=========");
      System.out.print("\n1. Anda con la bicicleta");
      System.out.print("\n2. Haz el caballito con la bicicleta");
      System.out.print("\n3. Anda con el coche");
      System.out.print("\n4. Quema rueda con el coche");
      System.out.print("\n5. Ver kilometraje de la bicicleta");
      System.out.print("\n6. Ver el kilometraje del coche");
      System.out.print("\n7. Ver kilometraje total");
      System.out.print("\n8. Salir");
      System.out.println("\nElije una opición (1-8):");
      opcion = s.nextInt();

    } while(opcion<1 || opcion>8);
    
    return opcion;
    
  }
  
  
  /**
   * Lee los kilómetros que recorre cada Vehículo y lor retorna.
   * 
   * @return Devuelve (double) los kilómetros introducidos por el usuario.
   */
  public static double leeKilometros() {
    
    double km;
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("\n\n¿Cuántos kilómetros recorre?");
    km = s.nextDouble();
    
    return km;
    
  }
  
}

package primerosejerciciospoo;

import java.util.Scanner;


/**
 * Prueba para la Clase Circulo.java
 * 
 * @author Francisco Javier González Sabariego
 * @version 2.0 Este programa fue modificado el día 23/3/2019
 */
public class CirculoMain {
  public static void main(String[] args) {
    //Creamos Scanner:    
    Scanner s = new Scanner(System.in);
    
    Circulo circulo1 = new Circulo();
    
    //Variable:
    
   String respuesta="";
   int opcion= 0;
   double radio;
    
    do {      
      opcion = menu(s);
      
      switch(opcion) {
        case 1:
          System.out.print(circulo1);
          break;
        case 2:
          System.out.println("¿Qué valor debe tener mi radio?");
          radio = leeDouble(s);        
          circulo1.aumentaRadio(radio);
          break;
        case 3:
          System.out.println("¿Qué valor debe tener mi radio?");
          radio = leeDouble(s);        
          circulo1.reducirRadio(radio);
          break;
        case 4:
          System.out.println("Mi área es de " + circulo1.getArea() + " m^2.\n\n");
      }      
    } while(opcion!=5);

  }

  /**
   * Lee un valor de tipo double
   * 
   * @param s Scanner
   * @return  Valor (double) leído
   */
  private static double leeDouble(Scanner s) {
    double radio;
    radio=s.nextDouble();
    s.nextLine();
    return radio;
  }

  /**
   * Imprime el menú del programa y lee la opción que elige el usuario.
   * 
   * @param s Scanner
   * @return  Opción del usuario (int)
   */
  private static int menu(Scanner s) {
    int opcion=0;
    System.out.println("=========");
    System.out.print("Opciones:");
    System.out.print("\n=========");
    System.out.print("\n\n(1) Estado");
    System.out.print("\n(2) Crecer");
    System.out.print("\n(3) Menguar");
    System.out.print("\n(4) Área");
    System.out.print("\n(5) Salir");
    System.out.println("\n\n¿Qué opción desea?");
    opcion = s.nextInt();
    s.nextLine();
    return opcion;
  }

}

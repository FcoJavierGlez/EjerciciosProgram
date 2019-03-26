package primerosejerciciospoo;

import java.util.Scanner;

public class FraccionMain {
  public static void main(String[] args) {
    //Scanner:
    Scanner s = new Scanner(System.in);    
    
    //Instancias clase Fraccion:
    Fraccion fraccion1 = new Fraccion(1, 2);  //Objeto fracción, por defecto este es su valor: 1/2    
    Fraccion fraccion2 = new Fraccion(2, 3);  //Objeto fracción, por defecto este es su valor: 2/3    
    
    //Variables:
    int opcionMenu;   //Variable que guarda las opciones del menú:    
    int numerador;    //Variable que guarda el valor del numerador que quiera asignarle el usuario    
    int denominador;  //Variable que guarda el valor del denominador que quiera asignarle el usuario    
    int numero;       //Variable que guarda el valor del número que será multuplicado por las fracciones
    
    
    //#############################     PROGRAMA     #############################\\
    
    do {      
      opcionMenu = menu(s);
      
      switch(opcionMenu) {
        case 1:
          System.out.print("\n\nFracción 1: " + fraccion1.toString());        
          System.out.print("\n\nFracción 2: " + fraccion2.toString()); 
          break;
        case 2:
          //Modificamos la primera fracción:        
          System.out.print("\n\nFracción 1: " + fraccion1.toString());
          System.out.print("\n\n¿Qué valor debe tener el numerador de la primera fracción?");
          numerador = s.nextInt();
          
          fraccion1.setNumerador(numerador);
          
          System.out.print("\n\n¿Qué valor debe tener el denominador de la primera fracción?");
          denominador = s.nextInt();
          
          fraccion1.setDenominador(denominador);          
          
          //Modificamos la segunda fracción:
          
          System.out.print("\n\nFracción 2: " + fraccion2.toString());
          System.out.print("\n\n¿Qué valor debe tener el numerador de la segunda fracción?");
          numerador = s.nextInt();
          
          fraccion2.setNumerador(numerador);
          
          System.out.print("\n\n¿Qué valor debe tener el denominador de la segunda fracción?");
          denominador = s.nextInt();
          
          fraccion2.setDenominador(denominador);
          break;
        case 3:
          //Imprimimos resultado real de cada fracción:        
          System.out.print("\n\nResultado fracción 1: " + fraccion1.obtenerResultadoFraccion());        
          System.out.print("\n\nResultado fracción 2: " + fraccion2.obtenerResultadoFraccion());
          break;
        case 4:
          //Pedimos el número entero e imprimimos el resultado:        
          System.out.print("\n\nInserte el número entero por el que desea multiplicar las fracciones.");
          numero = s.nextInt();
          
          System.out.print("\n\nResultado fracción 1: " + fraccion1.multiplicaPorNumero(numero));        
          System.out.print("\n\nResultado fracción 2: " + fraccion2.multiplicaPorNumero(numero));
          break;
        case 5:
          System.out.print("\n\n" + fraccion1.sumaFraccion(fraccion2));        
          System.out.print("\n\n" + fraccion1.restaFraccion(fraccion2));        
          System.out.print("\n\n" + fraccion1.multiplicaFraccion(fraccion2));        
          System.out.print("\n\n" + fraccion1.divideFraccion(fraccion2));
          break;
        case 6:
          System.out.print("\n\nFracción 1: " + fraccion1.toString());                      
          System.out.print("\n\nFracción 1 simplificada: " + fraccion1.simplificar());        
          System.out.print("\n\nFracción 2: " + fraccion2.toString());        
          System.out.print("\n\nFracción 2 simplificada: " + fraccion2.simplificar());
          break;
      }      
    } while(opcionMenu!=7);
    
  }

  /**
   * @param s
   * @return
   */
  private static int menu(Scanner s) {
    int opcionMenu;
    System.out.print("\n\nOpciones:");
    System.out.print("\n---------");
    System.out.print("\n\n(1)Muestra fracciones.");
    System.out.print("\n(2)Modifica fracciones.");
    System.out.print("\n(3)Obtener resultado de cada fracción.");
    System.out.print("\n(4)Multiplicar la fracción por un número entero.");
    System.out.print("\n(5)Multiplicar, dividir, sumar y restar fracciones.");
    System.out.print("\n(6)Simplifica fracciones.");
    System.out.print("\n(7)Salir");
    System.out.println("\n\n¿Qué opción desea?");
    opcionMenu = s.nextInt();
    return opcionMenu;
  }
}

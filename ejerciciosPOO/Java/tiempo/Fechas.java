package tiempo;

import java.util.Calendar;
import java.util.GregorianCalendar;


/**
 * Realiza el ejercicio del examen de Java del trimestre anterior que te pedía manipular fechas 
 * usando alguna clase ya creada en Java para tal fin.
 * 
 * Muestra un menú con las siguientes opciones:
 * 
 * - Introducir (por teclado) una fecha en formato dd/mm/aaaa.
 * Pide una fecha al usuario, si no se introduce correctamente se devuelve un mensaje de error.
 * Usa una función booleana para validar la fecha.
 * 
 * - Sumar días a la fecha.
 * Pide un número de días (positivo) para sumar a la fecha introducida previamente y actualiza
 * su valor. Esta opción sólo podrá realizarse si hay una fecha introducida, si no la hay mostrará
 * un mensaje de error, si el número de días introducido no es positivo también. Usa una función
 * que recibirá la fecha, el número de días a sumarle y devolverá la nueva fecha.
 * 
 * - Restar días a la fecha.
 * Pide un número de días (negativo) para sumar a la fecha introducida previamente y actualiza
 * su valor. Esta opción sólo podrá realizarse si hay una fecha introducida, si no la hay mostrará
 * un mensaje de error, si el número de días introducido no es negativo también. Usa la función
 * del apartado anterior.
 * 
 * - Comparar la fecha introducida con otra.
 * Pide una fecha al usuario (válida, si no lo es da error) y la comparará con la que tenemos
 * almacenada, posteriormente mostrará si esta fecha es anterior, igual o posterior a la que
 * tenemos almacenada, usará una función para ello a la que le pasaremos las dos fechas y
 * devolverá un valor negativo si la 1ª es ANTERIOR a la 2ª, 0 si son IGUALES y un valor
 * positivo si es POSTERIOR.
 * 
 * - Mostrar fecha.
 * 
 * - Terminar.
 * 
 * 
 * @author Francisco javier González Sabariego
 */
import java.util.Scanner;

public class Fechas {
  public static void main(String[] args) {
    //Scanner:
    Scanner s = new Scanner(System.in);
    
    //Variables:
    int [] dias = new int [12]; //Almacena la cantidad de días en un mes.
    
    dias[0]=31;
    dias[1]=28;
    dias[2]=31;
    dias[3]=30;
    dias[4]=31;
    dias[5]=30;
    dias[6]=31;
    dias[7]=31;
    dias[8]=30;
    dias[9]=31;
    dias[10]=30;
    dias[11]=31;
    
    String fechaIntroducida = "";  //Almacena la fecha introducida por el usuario.
    String fechaIntroducida2 = ""; //Almacena la fecha que se desea comparar.
    
    int numeroDias=0; //Cantidad de días a sumar o restar.
    
    int numeroMenu=0; //La opción del menú a elegir por el usuario.
    
    
    //Objetos:
    GregorianCalendar fecha1 = new GregorianCalendar(999, 0, 1);
    GregorianCalendar fecha2 = new GregorianCalendar(999, 0, 1);
    
    System.out.println(toString(fecha1));
    
    
    //Iniciamos el programa
    while (numeroMenu!=6) {
      
      //Damos a elegir una opción:
      numeroMenu = menu(s); //Asigmanos el valor que retorna el método menú al que pasamos como parámetro el Scanner
      
      switch (numeroMenu) {
      
        case 1:
          System.out.println("\n\nIntroduce una fecha con el siguiente formato (dd/mm/aaaa), ejemplo: 04/07/1999");
          s.nextLine();
          //Leemos la fecha que introduzca el usuario
          fechaIntroducida=s.nextLine();
          /*
           * Comprobamos que la fecha sea válida, para ello:
           *
           *    -Si es la fecha es válida introducimos los parámetros en la instancia de la clase GregorianCalendar
           *    -Si no lo es da un aviso de que la fecha es incorrecta y que debe introducir una válida
           */
          if (compruebaFecha(fechaIntroducida, dias)) {
            asignaFecha(fechaIntroducida, fecha1);
          } else {
            System.out.println("\n\nLa fecha es incorrecta. Introduzca una válida por favor.");
          }
          break;
          
        case 2:
          //Si la variable fecha no contiene una fecha le damos un error al usuario y le retornamos al menu:
          if (fechaIntroducida.equals("")) {
            System.out.println("\n\nERROR. Debe introducir una fecha primero. Elija la opción (1).");
          } else {
            System.out.println("\n\n¿Cuántos días desea sumar a esta fecha: " + toString(fecha1) + "?");
            numeroDias=s.nextInt();
            
            //Si el número de días a sumar es negativo damos error y solicitamos de nuevo:
            while (esNegativo(numeroDias)) {
              System.out.println("\n\nERROR. No puede insertar un número negativo si desea sumar.");
              System.out.println("\n\n¿Cuántos días desea sumar a esta fecha: " + toString(fecha1) + "?");
              numeroDias=s.nextInt();
            }
            
            sumaRestaDias(numeroDias, fecha1);
            System.out.print("\n\nFecha resultante: " + toString(fecha1));
          }
          break;
          
        case 3:
          //Si la variable fecha no contiene una fecha le damos un error al usuario y le retornamos al menu:
          if (fechaIntroducida.equals("")) {
            System.out.println("\n\nERROR. Debe introducir una fecha primero. Elija la opción (1).");
          } else {
            System.out.println("\n\n¿Cuántos días desea restar a esta fecha: " + toString(fecha1) + "?");
            numeroDias=s.nextInt();
            
            //Si el número de días a restar no es negativo damos error y solicitamos de nuevo:
            while (!esNegativo(numeroDias)) {
              System.out.println("\n\nERROR. No puede insertar un número positivo si desea restar.");
              System.out.println("\n\n¿Cuántos días desea sumar a esta fecha: " + toString(fecha1) + "?");
              numeroDias=s.nextInt();
            }
            
            sumaRestaDias(numeroDias, fecha1);
            System.out.print("\n\nFecha resultante: " + toString(fecha1));
          }
          break;
          
        case 4:
          //Si la variable fecha no contiene una fecha le damos un error al usuario y le retornamos al menu:
          if (fechaIntroducida.equals("")) {
            System.out.println("\n\nERROR. Debe introducir una fecha primero. Elija la opción (1).");
          } else {
            System.out.println("\n\nIntroduce la segunda fecha con el siguiente formato (dd/mm/aaaa), ejemplo: 04/07/1999");
            s.nextLine();
            //Leemos la fecha que introduzca el usuario
            fechaIntroducida2=s.nextLine();
            
            //Comprobamos que la fecha sea válida:
            if (compruebaFecha(fechaIntroducida2, dias)) {  //Si la segunda fecha es correcta procedemos a comparar
              asignaFecha(fechaIntroducida2, fecha2);
              if(fecha1.compareTo(fecha2)<0) {
                System.out.print("\n\nLa fecha " + toString(fecha1) + " es anterior a la fecha " + toString(fecha2));
              } else if (fecha1.compareTo(fecha2)>0) {
                System.out.print("\n\nLa fecha " + toString(fecha2) + " es anterior a la fecha " + toString(fecha1));
              } else {
                System.out.print("\n\nLa fecha " + toString(fecha2) + " es la misma fecha que " + toString(fecha1));
              }            
            } else {  //Si no lo es indicamos es incorrecta.
              System.out.print("\n\nFecha incorrecta.");
            }            
          }
          break;
          
        default:
          if (fecha1.get(Calendar.YEAR)>999) {    //Si el año es mayor que 999 hemos introducido fecha e imprimimos      
            System.out.print("\n\nLa fecha es: " + toString(fecha1));
          } else {                                //Si no, posee el valor por defecto y pedimos fecha
            System.out.print("\n\nNo hay fecha introducida, por favor, inserte una fecha antes. Opción (1)");                 
          }
      }
      
      //Introduzco una pausa de 1 segundo.
      try {
        Thread.sleep(1000);
      } catch (Exception e) {}
      
    }    
  }


  /**
   * Éste método imprime por pantalla el menú del programa y lo repite mientras
   * la entrada del número no se corresponda con ninguna de las opciones.
   * 
   * @param s Objeto clase Scanner.
   * @return  Devuelve (int) número menú.
   */
  private static int menu(Scanner s) {
    
    int numeroMenu;
    
    do {
      
      System.out.print("\n\nPor favor elija una opción:");
      System.out.print("\n(1) Introducir una fecha.");
      System.out.print("\n(2) Sumar días a la fecha.");
      System.out.print("\n(3) Restar días a la fecha.");
      System.out.print("\n(4) Comparar la fecha introducida con otra.");
      System.out.print("\n(5) Mostrar fecha.");
      System.out.print("\n(6) Terminar (Salir del programa).");
      numeroMenu=s.nextInt();
      
    } while (numeroMenu<1 || numeroMenu>6);
    
    return numeroMenu;
    
  }
  
  
  
  /**
   * Comprueba si el año introducido es bisiesto y retorna true o false.
   * @param anno
   * @return
   */
  private static boolean esBisiesto(int anno) {
    //Variables:
    boolean salida=false;
    
    //Comprobamos si el año es bisiesto:
    if ((anno%4)!=0 && (anno%100)!=0) {
      salida=false;
    } else if ((anno%4)==0 && (anno%100)!=0) {
      salida=true;
    } else if ((anno%4)==0 && (anno%100)==0 && (anno%400)!=0) {
      salida=false;
    } else if ((anno%4)==0 && (anno%100)==0 && (anno%400)==0) {
      salida=true;
    }
    
    return salida;
  }
  
  
  
  /**
   * Comprueba que las barras de la fecha introducido estén en su sitio. Con esta comprobación, además, 
   * podremos saber si el formato es dd/mm/aaaa y no d/m/aaaa.
   * 
   * @param fecha
   * @return
   */
  private static boolean compruebaBarras(String fecha) {
    
    //Comprueba que la posición de las barras es correcta:
    if (fecha.substring(2, 3).equals("/") & fecha.substring(5, 6).equals("/")) {
      return true;
    } else {
      System.out.println("\n\nPor favor introduzca correctamente las barras de separación /");
    }
    
    return false;
  }
  
  
  /**
   * Comprueba que la fecha tenga una longitud de 10 correspondiente a dd/mm/aaaa.
   * 
   * @param fecha  Fecha (String) a comprobar.
   * @return       Verdadero o falso.
   */
  private static boolean compruebaFormato(String fecha) {
    
    if (fecha.length()==10) {
      return true;
    }
    
    return false;
  }
  
  
  /**
   * Método que comprueba que el año no sea negativo.
   * 
   * @param fecha Fecha (String) que pasamos como parámetro.
   * @return      Verdadero o falso.
   */
  private static boolean compruebaAnno(String fecha) {
    String cadena="";
    int contadorAnno;
    
    //Concateamos el año en la variable cadena:
    for (int i=6; i<fecha.length(); i++) {
      cadena+=fecha.substring(i, i+1);
    }
    
    //Cambiamos el tipo de dato a Integer:
    contadorAnno=Integer.parseInt(cadena);
    
    //Analizamos que el año no sea ni cero ni negativo:
    if (contadorAnno<0) {
      System.out.print("\nEl año no puede ser inferior a 1.");
    } else if (contadorAnno==0) {
      System.out.print("\nEl año 0 no existe.");
    } else {
      return true;
    }
    
    return false;
    
  }
  
  
  /**
   * Asigna el valor del día, mes y año del String "fecha" a la instancia de la
   * subclase GregorianCalendar que se introduzca como parámetro.
   * 
   * @param fechaIntroducida
   * @param fecha
   */
  private static void asignaFecha(String fechaIntroducida, GregorianCalendar fecha) {
    //Para facilitar la legibilidad del programa:
    int dia = Integer.parseInt(fechaIntroducida.substring(0, 2));
    int mes = Integer.parseInt(fechaIntroducida.substring(3, 5))-1;  //GregorianCalendar almacena los meses en un array desde index 0
    int anno = Integer.parseInt(fechaIntroducida.substring(6, 10));
    
    //Introducimos los parámetros en el siguiente orden: año, mes y día.
    fecha.set(anno, mes, dia);     
  }
  
  
  /**
   * Verifica si la fecha introducida es correcta.
   * 
   * @param fecha
   * @param dias
   * @return
   */
  private static boolean compruebaFecha(String fecha, int[] dias) {
    String cadena="";
    String cadenaDias="";
    int contadorAnno=0; //Variable para almacenar el año de la fecha y comprobar si es bisiesto
    
    //dd/mm/aaaa
    /*
     * Para que la fecha sea válida primero debemos comprobar que: 
     *  -Las barras deben estar insertadas correctamente "compruebaBarras()"
     *  -El formato debe ser correcto dd/mm/aaaa "compruebaFormato()"
     *  -Y el año debe ser correcto (ni 0 ni negativo) "compruebaAnno()"
     */
    if (compruebaBarras(fecha) && compruebaFormato(fecha) && compruebaAnno(fecha)) {
      //Comprobamos que el mes es correcto:
      if (Integer.parseInt(fecha.substring(3, 5))>12 || Integer.parseInt(fecha.substring(3, 5))<1) {
        System.out.print("\nEl mes introducido es incorrecto.");
        return false;
      }
      
      /*
       * Si el año es bisiesto reasignamos el valor de días a dias[1].
       * 
       * De no serlo, en caso de haber pasado por un año bisiesto reasignamos su valor
       * original de 28 dias.
       */
      if (esBisiesto(contadorAnno)) {
        dias[1]=29;
      } else {
        dias[1]=28;
      }
      
      
      //Si ha pasado la prueba del año y del mes validamos los días del mes:
      cadena+=fecha.substring(3, 5);
      cadenaDias+=fecha.substring(0, 2);
        
      /*
       * Si la conversión a entero de los dos primeros dígitos de la fecha (los días)
       * es mayor a la cantidad de días almacenados en el array días -1
       * (la cantidad de días en un mes)
       * 
       * Si no, si la cantidad de días introducidos es menor que 1 entonces la fecha es imposible
       */
      if (Integer.parseInt(cadenaDias)>dias[Integer.parseInt(cadena)-1]) {
        System.out.print("\nEl número de días introducido es superior a los del mes actual.");
        return false;
      } else if (Integer.parseInt(cadenaDias)<1) {
        System.out.print("\nEl número de días introducido es inferior a los del mes actual.");
        return false;
      }
    }
    
    return true;
  }
  
  
  
  /**
   * Determina si el número introducido es negativo y retorna true o false.
   * 
   * @param numeroDias  
   * @return
   */
  private static boolean esNegativo(int numeroDias) {
    boolean salida=false;
    
    if (numeroDias<0) {
      salida=true;
    }
    
    return salida;
  }
  
  
  
  /**
   * Suma o resta los días introducidos a la instancia de la clase GregorianCalendar.
   * 
   * @param numeroDias  Número de días (int) que deseamos sumar o restar
   * @param fecha       Instancia de la clase GregorianCalendar
   */
  private static void sumaRestaDias(int numeroDias, GregorianCalendar fecha) {
    
    fecha.add(Calendar.DAY_OF_MONTH, numeroDias);    
  }
  
  
  /*
   * El método toString de la Súper clase Calendar no me funcionaba, 
   * por tanto, he optado por crear un método static para el mismo programa.
   */
  /**
   * Método toString para las instancias de la clase GregorianCalendar
   * 
   * @param fecha   Instancia de la clase GregorianCalendar
   * @return        El estado (String) del objeto
   */
  private static String toString(GregorianCalendar fecha) {
    
    return String.format("%02d/%02d/%d", fecha.get(Calendar.DAY_OF_MONTH), 
        fecha.get(Calendar.MONTH) + 1, fecha.get(Calendar.YEAR));    
  }
  
}

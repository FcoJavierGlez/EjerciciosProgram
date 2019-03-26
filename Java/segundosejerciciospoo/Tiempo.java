package segundosejerciciospoo;

import java.util.Scanner;

/**
 * Crea la clase Tiempo con los métodos suma y resta. Los objetos de la clase Tiempo
 * son intervalos de tiempo y se crean de la forma Tiempo t = new Tiempo(1, 20,
 * 30) donde los parámetros que se le pasan al constructor son las horas, los
 * minutos y los segundos respectivamente. Crea el método toString para ver los
 * intervalos de tiempo de la forma 10h 35m 5s. Si se suman por ejemplo 30m 40s y
 * 35m 20s el resultado debería ser 1h 6m 0s. Realiza un programa de prueba para
 * comprobar que la clase funciona bien.
 *
 *
 * @author Francisco Javier González Sabariego
 *
 */
public class Tiempo {
  
  private int horas = 0;  
  private int minutos = 0;  
  private int segundos = 0;  
  
  /**
   * Constructor de la Clace Tiempo.
   * 
   * @param hor Número de horas (int) [0-23]
   * @param min Número de minutos (int) [0-59]
   * @param seg Número de segundos (int) [0-59]
   */
  public Tiempo(int hor, int min, int seg) {    
    horas = hor;    
    minutos = min;    
    segundos = seg;    
  }
  
  //Métodos:
  
  /**
   * Método que retorna la instancia en forma de String.
   * 
   * @return Devuelve el valor de la instancia en formato 00h:00m:00s
   */
  public String toString() {    
    String horas = "";    
    String minutos = "";    
    String segundos = "";
    
    //Añadimos un 0 delante de cada valor si este es inferior a 10
    //Horas:
    if (this.horas<10) {      
      horas = "0" + Integer.toString(this.horas);      
    } else {      
      horas = Integer.toString(this.horas);
    }    
    //Minutos:
    if (this.minutos<10) {      
      minutos = "0" + Integer.toString(this.minutos);      
    } else {      
      minutos = Integer.toString(this.minutos);
    }    
    //Segundos:
    if (this.segundos<10) {      
      segundos = "0" + Integer.toString(this.segundos);      
    } else {      
      segundos = Integer.toString(this.segundos);
    }
    
    return horas + "h:" + minutos + "m:" + segundos + "s";    
  }
  
  /**
   * Suma el tiempo de una instancia de la clase Tiempo a otra instancia.
   * 
   * @param tiempo  Recibe una instancia de la clase tiempo.
   */
  void suma(Tiempo tiempo) {    
    this.segundos += tiempo.segundos;    
    this.minutos += tiempo.minutos;    
    this.horas += tiempo.horas;    
    this.regulaSuma();    
  }
  
  /**
   * Evita que los minutos y/o segundos rebasen el valor de los 59, 
   * además de evitar que las horas rebasen las 23h.
   */
  private void regulaSuma() {    
    if (this.segundos>59) {      
      this.minutos += this.segundos/60;      
      this.segundos %= 60;
    } 
    
    if (this.minutos>59){      
      this.horas += this.minutos/60;      
      this.minutos %= 60;      
    }
    
    if (this.horas>23) {      
      this.horas %= 24;      
    }        
  }
  
  /**
   * Resta el tiempo de una instancia de la clase Tiempo a otra instancia.
   * 
   * @param tiempo  Recibe una instancia de la clase tiempo.
   */
  void resta(Tiempo tiempo) {
    
    /*
     * Si la cantidad de segundos de la instancia que deseamos modificar es superior 
     * a la de la instancia que le pasamos como parámetro haz una resta normal:
     */    
    if (this.segundos>tiempo.segundos) {      
      this.segundos -= tiempo.segundos;      
    } else {                              //Si no, haz la resta, suma a los segundos 60" y quita 1 minuto      
      this.segundos -= tiempo.segundos;      
      this.segundos += 60;      
      this.minutos -= 1;
    }
    
    /*
     * Si la cantidad de minutos de la instancia que deseamos modificar es superior 
     * a la de la instancia que le pasamos como parámetro haz una resta normal:
     */
    if (this.minutos>tiempo.minutos) {      
      this.minutos -= tiempo.minutos;      
    } else {                            //Si no, haz la resta, suma a los minutos 60' y quita 1 hora      
      this.minutos -= tiempo.minutos;      
      this.minutos += 60;      
      this.horas -= 1;
    }
    
    /*
     * Si la cantidad de horas de la instancia que deseamos modificar es superior 
     * a la de la instancia que le pasamos como parámetro haz una resta normal:
     */
    if (this.horas>tiempo.horas) {      
      this.horas -= tiempo.horas;      
    } else {                          //Si no, haz la resta, y suma a las horas de la instancia 24      
      this.horas -= tiempo.horas;      
      this.horas += 24;
    }    
  }
  
  /*
  public void setTiempo(int horas, int minutos, int segundos) {
    
  }
  */
  
  /**
   * Solicita al usuario el número de horas, mientras 
   * el número de horas sea inferior a 0 o superior a 23 
   * volverá a pedir el número de horas.
   * 
   * @return    Horas (int).
   */
  public int leeHoras(Scanner s) {    
    int horas = 24;
    
    do {      
      System.out.println("Introduzca un número de horas comprendido entre [0-23]:");
      horas = s.nextInt();      
    } while(horas < 0 || horas > 23);
    
    return horas;    
  }
  
  /**
   * Solicita al usuario el número de minutos, mientras 
   * el número de minutos sea inferior a 0 o superior a 59 
   * volverá a pedir el número de minutos.
   * 
   * @return    Minutos (int).
   */
  public int leeMinutos(Scanner s) {    
    int minutos = 60;
    
    do {      
      System.out.println("Introduzca un número de minutos comprendido entre [0-59]:");
      minutos = s.nextInt();      
    } while(minutos < 0 || minutos > 59);
    
    return minutos;    
  }
  
  
  /**
   * Solicita al usuario el número de segundos, mientras 
   * el número de segundos sea inferior a 0 o superior a 59 
   * volverá a pedir el número de segundos.
   * 
   * @return    Segundos (int).
   */
  public int leeSegundos(Scanner s) {    
    int segundos = 60;
    
    do {      
      System.out.println("Introduzca un número de segundos comprendido entre [0-59]:");
      segundos = s.nextInt();      
    } while(segundos < 0 || segundos > 59);
    
    return segundos;    
  }
  
}

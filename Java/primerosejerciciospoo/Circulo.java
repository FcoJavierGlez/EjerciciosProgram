package primerosejerciciospoo;

import javax.swing.*;

/**
 * Clase Circulo permite crear instancias de un círculo y trabajar con su radio, área y perímetro.
 * 
 * @author Francisco Javier González Sabariego
 *
 */
public class Circulo {  
  public static final double PI = 3.14159265359; //Constante PI.  
  double radio;
  
  
  //#############################     CONSTRUCTOR     #############################\\
  
  public Circulo() {    
    radio=2;
  }
  
  
  //#############################     MÉTODOS     #############################\\
  
  /**
   * Aumenta el valor del radio, en caso de introducir un valor inferior el cambio no se realiza.
   * 
   * @param valor El tamaño que se desea que tenga el radio.
   */
  void aumentaRadio(double valor) {    
    if (valor>radio) {
      setRadio(valor);
    } else {
      System.out.print("\nEl valor introducido " + valor + " no es superior a mi radio actual " + radio + ".\n\n");
    }    
  }
  
  /**
   * Reduce el valor del radio, en caso de introducir un valor superior el cambio no se realiza.
   * 
   * @param valor El tamaño que se desea que tenga el radio.
   */
  void reducirRadio(double valor) {   
    if (valor<radio) {
      setRadio(valor);
    } else {
      System.out.print("\n\nLo siento no puedo menguar. El valor introducido no es inferior a mi radio actual " + radio + ".");
    }
    
    if (valor==0) {
      JOptionPane.showMessageDialog(null, "Soy un mísero punto sin área.");
    }    
  }
  
  
  //#############################     SETTERS     #############################\\
  
  /**
   * Asigna un nuevo valor al radio.
   * 
   * @param valor Valor (double) que asignamos al radio.
   */
  private void setRadio(double valor) {
    radio = valor;
  }
  
  
  //#############################     GETTERS     #############################\\
  
  /**
   * Retorna el valor del área del círculo.
   * 
   * @return Área (double).
   */
  public double getArea() {    
    return (PI*Math.pow(radio,2));    
  }
  
  /**
   * Retorna el valor del perímetro del círculo.
   * 
   * @return  Perímetro (double).
   */
  public double getPerimetro() {    
    return (2*PI*radio);    
  }
  
  
  //#############################     TOSTRING     #############################\\
  
  /**
   * Método toString de la Clase Círculo. Muestra el estado actual del objeto círculo.
   */
  public String toString() {    
    return "Soy un círculo de " + Double.toString(radio) + 
        " metros de radio. Ocupo un área de " + 
        Double.toString(PI*Math.pow(radio,2)) + 
        " metros cuadrados.\n\n";    
  }
  
//  public void mensaje() {
//    
//    mensaje=JOptionPane.showInputDialog("Soy un mísero punto sin área.");
//    
//    if (radio==0) {
//      String mensaje=JOptionPane.showInputDialog("Soy un mísero punto sin área.");
//    }
//    
//  }
  
}

package primerosejerciciospoo;

import java.util.Scanner;

public class Fraccion {
  
  //Scanner:
  Scanner s = new Scanner(System.in);
  
  //Atributos:
  int numerador;  
  int denominador;
  
  
  //Constructor
  public Fraccion(int entrada1, int entrada2) {    
    numerador=entrada1;    
    denominador=entrada2;
  }
  
  
  //Métodos:
  /**
   * Retorna el numerador de la instancia de la clase fracción en forma de entero.
   * 
   * @return
   */
  public int getNumerador() {    
    return this.numerador;    
  }
  
  /**
   * Permite cambiar el numerador de la fracción.
   * 
   * @param valor
   */
  public void setNumerador(int valor) {    
    this.numerador = valor;    
  }
  
  /**
   * Retorna el denominador de la fracción en forma de int.
   * 
   * @return
   */
  public int getDenominador() {    
    return this.denominador;    
  }
  
  /**
   * Permite cambiar el denominador de la fracción.
   * 
   * Si el valor de entrada es 0 vuelve a pedir el valor del denominador.
   * 
   * @param valor
   */
  public void setDenominador(int valor) {    
    do {      
      this.denominador = valor;      
      if (valor==0) {        
        System.out.print("\n\nLo siento el denominador no puede ser igual a cero. Introduzca otro número.");
        this.denominador = s.nextInt();        
      }      
    } while (this.denominador==0);    
  }
  
  /**
   * Retorna el valor real (double) de la división entre numerador y denominador.
   * 
   * @return
   */
  public double obtenerResultadoFraccion() {    
    return ((double)this.numerador/this.denominador);        
  }
  
  /**
   * Retorna en String el resultado de multiplicar la fraccion por un número entero.
   * 
   * @param valor
   * @return
   */
  public String multiplicaPorNumero(int valor) {    
    return (this.numerador*valor + "/" + this.denominador);    
  }
  
  
  /**
   * Suma dos fracciones y retorna un String.
   * 
   * Si ambos denominadores son iguales el método solo suma los denominadores.
   * 
   * En caso de que ambos sean diferentes se realiza un denominador común multiplicando ambos denominadores,
   * luego opera dividiendo el denominador común entre el denominador de una fracción y el resultado
   * lo multiplica por el numerador de dicha fracción. Idem con la otra fracción. Después realiza la suma.
   * 
   * Además hace uso del método: simplificaFraccion().
   * 
   * @param fraccion
   * @return
   */
  public String sumaFraccion(Fraccion fraccion) {    
    int denominadorComun=this.denominador*fraccion.denominador; 
    
    if (this.denominador==fraccion.denominador) {      
      return "Resultado suma: " + (this.numerador+fraccion.numerador) + "/" + this.denominador;      
    } else {      
      return "Resultado suma: " + 
          simplificaFraccion((this.numerador*(denominadorComun/this.denominador)+fraccion.numerador*
              (denominadorComun/fraccion.denominador)), denominadorComun);      
    }    
  }
  
  /**
   * Resta dos fracciones y retorna un String.
   * 
   * Si ambos denominadores son iguales el método solo resta los denominadores.
   * 
   * En caso de que ambos sean diferentes se realiza un denominador común multiplicando ambos denominadores,
   * luego opera dividiendo el denominador común entre el denominador de una fracción y el resultado
   * lo multiplica por el numerador de dicha fracción. Idem con la otra fracción. Después realiza la resta.
   * 
   * Además hace uso del método: simplificaFraccion().
   * 
   * @param fraccion
   * @return
   */
  public String restaFraccion(Fraccion fraccion) {    
    int denominadorComun=this.denominador*fraccion.denominador;  
    
    if (this.denominador==fraccion.denominador) {      
      return "Resultado resta: " + (this.numerador-fraccion.numerador) + "/" + this.denominador;      
    } else {      
      return "Resultado resta: " + 
          simplificaFraccion((this.numerador*(denominadorComun/this.denominador)-fraccion.numerador*
              (denominadorComun/fraccion.denominador)), denominadorComun);      
    }
    
  }
  
  
  /**
   * 
   * @param valorNumerador
   * @param valorDenominador
   * @return
   */
  public String simplificaFraccion(int valorNumerador, int valorDenominador) {    
    int numeroDivisor=2;    
    do {      
      if (valorNumerador%numeroDivisor==0 && valorDenominador%numeroDivisor==0) {
        valorNumerador/=numeroDivisor;
        valorDenominador/=numeroDivisor;
      } else {
        numeroDivisor++;
      }      
    } while(valorNumerador!=1 && valorDenominador!=1 && 
        !(numeroDivisor>valorNumerador || numeroDivisor>valorDenominador));
    
    return valorNumerador + "/" + valorDenominador;    
  }
  
  /**
   * 
   * @return
   */
  public String simplificar() {    
    int numeroDivisor=2;    
    do {      
      if (this.numerador%numeroDivisor==0 && this.denominador%numeroDivisor==0) {
        this.numerador/=numeroDivisor;
        this.denominador/=numeroDivisor;
      } else {
        numeroDivisor++;
      }      
    } while(this.numerador!=1 && this.denominador!=1 && 
        !(numeroDivisor>this.numerador || numeroDivisor>this.denominador));
    
    return this.numerador + "/" + this.denominador;    
  }
  
  /**
   * 
   * @param fraccion
   * @return
   */
  public String multiplicaFraccion(Fraccion fraccion) {
    return "Resultado multiplicación: " + 
  simplificaFraccion(this.numerador*fraccion.numerador, this.denominador*fraccion.denominador);    
  }
  
  /**
   * 
   * @param fraccion
   * @return
   */
  public String divideFraccion(Fraccion fraccion) {    
    return "Resultado división: " + 
        simplificaFraccion(this.numerador*fraccion.denominador, this.denominador*fraccion.numerador);    
  }
  
  
  /**
   * Método toString que imprime el estado actual de la fracción.
   * 
   * @return
   */
  public String toString() {    
    return this.numerador + "/" + this.denominador;    
  }
  
}

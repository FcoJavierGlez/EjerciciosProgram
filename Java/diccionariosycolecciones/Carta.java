package diccionariosycolecciones;

import javax.print.attribute.standard.NumberOfDocuments;

/**
 * Clase carta
 * 
 * @author Francisco Javier González Sabariego
 *
 */
public class Carta {
  
  //Variables:
  private String palo;
  private int numero;
  private String figura;
  private boolean haSalido=false;
  private int puntosBrisca;
  private double puntosSieteMedia;
  private static int numDeCartas = 1;
  
  /**
   * Constructor.
   */
  public Carta() {    
    asignaPalo();    
    asignaNumero();    
    asignaFigura();    
    asignaPuntosBrisca();    
    asignaPuntosSieteMedia();
    numDeCartas++;        //Pendiente de revisión
  }


  /**
   * Asigna los puntos correspondientes a cada carta en función del juego de la siete y media.
   */
  private void asignaPuntosSieteMedia() {
    switch (this.numero) {       //Asignamos puntos del juego de la Siete y media
      case 1:
        this.puntosSieteMedia=1;
        break;
      case 2:
        this.puntosSieteMedia=2;
        break;
      case 3:
        this.puntosSieteMedia=3;
        break;
      case 4:
        this.puntosSieteMedia=4;
        break;
      case 5:
        this.puntosSieteMedia=5;
        break;
      case 6:
        this.puntosSieteMedia=6;
        break;
      case 7:
        this.puntosSieteMedia=7;
        break;
      case 8:
        this.puntosSieteMedia=0.5;
        break;
      case 9:
        this.puntosSieteMedia=0.5;
        break;
      default:
        this.puntosSieteMedia=0.5;
    }
  }


  /**
   * Asigna los puntos a la carta según el juego de la Brisca:
   * <ul>
   * <li>As = 11 puntos</li>
   * <li>3 = 10 puntos</li>
   * <li>Sota = 2 puntos</li>
   * <li>Caballo = 3 puntos</li>
   * <li>Rey = 4 puntos</li>
   * </ul>
   */
  private void asignaPuntosBrisca() {
    switch (this.numero) {       //Asignamos puntos del juego de la Brisca
      case 1:
        this.puntosBrisca=11;
        break;
      case 2:
        this.puntosBrisca=0;
        break;
      case 3:
        this.puntosBrisca=10;
        break;
      case 4:
        this.puntosBrisca=0;
        break;
      case 5:
        this.puntosBrisca=0;
        break;
      case 6:
        this.puntosBrisca=0;
        break;
      case 7:
        this.puntosBrisca=0;
        break;
      case 8:
        this.puntosBrisca=2;
        break;
      case 9:
        this.puntosBrisca=3;
        break;
      default:
        this.puntosBrisca=4;
    }
  }


  /**
   * 
   */
  private void asignaFigura() {
    switch (this.numero) {       //Asignamos figura
      case 1:
        this.figura = "As";
        break;
      case 8:
        this.figura = "Sota";
        break;
      case 9:
        this.figura = "Caballo";
        break;
      case 10:
        this.figura = "Rey";
        break;
      default:
        this.figura = "n/d";
    }
  }


  /**
   * 
   */
  private void asignaNumero() {
    if (numDeCartas%10==0) {        //Asignamos número de carta
      numero = 10;
    } else {
      numero = numDeCartas%10;        
    }
  }


  /**
   * 
   */
  private void asignaPalo() {
    if (numDeCartas<11) {           //Asignamos palo
      this.palo = "bastos";
    } else if (numDeCartas<21) {
      this.palo = "copas";
    } else if (numDeCartas<31) {
      this.palo = "espadas";
    } else {
      this.palo = "oros";
    }
  }
  
  
  public void setHaSalido() {
    this.haSalido = true;
  }
  
  
  public boolean getHaSalido() {
    return this.haSalido;
  }
  
  public String getPalo() {
    return this.palo;
  }
  
  
  public int getNumero() {
    return this.numero;
  }
  
  
  /**
   * 
   * @return
   */
  int getPuntosBrisca() {
    return this.puntosBrisca;
  }
  
  
  public String toString() {
    
    if (this.figura.equals("n/d")) {
      return Integer.toString(this.numero) + " de " + this.palo;
    } else {
      return this.figura + " de " + this.palo;
    }
    
  }
  
  
}

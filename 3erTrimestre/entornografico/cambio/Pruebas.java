package entornografico.cambio;

public class Pruebas {

  public static void main(String[] args) {
    try {
      System.out.println(CambioIdeal.devuelveCambio("600.76"));
    } catch (NumeroIncorrecto e) {
      System.err.println("Número inválido.");
    }

  }

}

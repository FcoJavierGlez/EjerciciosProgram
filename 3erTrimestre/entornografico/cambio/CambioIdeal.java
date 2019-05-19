package entornografico.cambio;


/**
 * 
 * 
 * 
 * @author Francisco Javier González Sabariego
 *
 */
public class CambioIdeal {
  private static final int BILLETES []= {50000, 20000, 10000, 5000, 2000, 1000, 500};
  private static final int MONEDAS []= {200, 100, 50, 20, 10, 5, 2, 1};
  
  private static String resultado;
  
  /**
   * Devuelve el cambio ideal, billetes y monedas exactos,
   * de la cifra (String) que le pasamos como parámetro.
   * 
   * Ante posibles valores incorrectos este método puede lanzar una excepción.
   * 
   * @param entrada  Cantidad de dinero a devolver.
   * @return Devuelve el total de billetes y monedas idóneos para el cambio.
   * 
   * @throws NumeroIncorrecto  Lanza esta excepción cuando el número de entrada no puede ser
   *                           convertido de String a double.
   */
  public static String devuelveCambio(String entrada) throws NumeroIncorrecto {
    resultado = "";
    return calculaMonedas(calculaBilletes(convierteANumero(entrada)));
  }
  
  /**
   * Calcula el total de monedas a devolver, en un cambio ideal,
   * tanto en monedas de euro como de céntimos.
   * 
   * @param cambio  El total de dinero a cambiar en monedas.
   * @return  Devuelve el resultado (String) a ser mostrado.
   */
  private static String calculaMonedas(int cambio) {
    resultado+="\nMonedas:\n========\n";
    for (int i=0; i<MONEDAS.length; i++) {
      asignaTipoMoneda(cambio, i);
      cambio%=MONEDAS[i];
    }
    return resultado;
  }

  /**
   * Asigna el tipo de moneda (euros o céntimos) mientras haya una cantidad superior a 0 de ese tipo de moneda.
   * 
   * @param cambio  La cantidad de dinero (int) en monedas.
   * @param i Variable de control
   */
  private static void asignaTipoMoneda(int cambio, int i) {
    resultado+=(MONEDAS[i]>50 && Math.abs(cambio/MONEDAS[i])!=0) ? "Moneda de " + MONEDAS[i]/100 + "€: " + Math.abs(cambio/MONEDAS[i]) + "\n" : "";
    resultado+=(MONEDAS[i]<=50 && Math.abs(cambio/MONEDAS[i])!=0) ? "Moneda de " + MONEDAS[i] + "¢: " + Math.abs(cambio/MONEDAS[i]) + "\n" : "";
  }
  
  /**
   * Calcula el total de biletes a devolver en un cambio ideal.
   * 
   * @param cambio  El total de dinero a devolver.
   * @return  Devuelve la cantidad de dinero restante en monedas.
   */
  private static int calculaBilletes(int cambio) {
    resultado+="Billetes:\n=========\n";
    for (int i=0; i<BILLETES.length; i++) {
      asignaTipoBillete(cambio, i);
      cambio%=BILLETES[i];
    }
    return cambio;
  }

  /**
   * Asigna el tipo de billete mientras haya una cantidad superior a 0 de ese tipo de billete.
   * 
   * @param cambio La cantidad de dinero (int) total.
   * @param i Variable de control
   */
  private static void asignaTipoBillete(int cambio, int i) {
    resultado+=(Math.abs(cambio/BILLETES[i])!=0) ? "Billete de " + BILLETES[i]/100 + "€: " + Math.abs(cambio/BILLETES[i]) + "\n" : "";
  }


  /**
   * Convierte la cadena de entrada en double, incrementa su valor en 100,
   * posteriormente lo redondea y finalmente lo convierte en un número entero.
   * 
   * @param entrada  Número de entrada en forma de cadena.
   * @return  Devuelve el número de entrada incrementado x100 y convertido en entero.
   * 
   * @throws NumeroIncorrecto Lanza esta excepción cuando el número de entrada no puede ser
   *                           convertido de String a double
   */
  private static int convierteANumero(String entrada) throws NumeroIncorrecto {
    try {
      return Integer.parseInt(String.valueOf(Math.round(Double.parseDouble(entrada)*100)));
    } catch (NumberFormatException e) {
      throw new NumeroIncorrecto();
    }
  }
}

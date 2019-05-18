package entornografico.dni;

import java.util.regex.Pattern;

public class Dni {
  
  private final static String LETRA_FINAL="TRWAGMYFPDXBNJZSQVHLCKE";
  
  /**
   * Valida que el DNI sea correcto.
   * 
   * @param dni DNI a validar (String)
   * @return True si es correcto, false si no lo es.
   */
  public static boolean validaDni (String dni) {
    return (validaDigitos(dni) && validaLetra(dni));
  }
  
  /**
   * Valida que los digitos (números y letras) estén en la posición correcta.
   * 
   * @param dni DNI a validar (String)
   * @return  True si es correcto, false si no lo es.
   */
  private static boolean validaDigitos (String dni) {
    return Pattern.matches("^[0-9]{8}[A-Z]$", dni);
  }
  
  /**
   * Valida que la letra del DNI sea la correcta para dicho DNI.
   * 
   * @param dni DNI a validar (String)
   * @return  True si es correcto, false si no lo es.
   */
  private static boolean validaLetra (String dni) {
    return (LETRA_FINAL.substring(Integer.parseInt(dni.substring(0, 8))%23, 
        (Integer.parseInt(dni.substring(0, 8))%23)+1).equals(dni.substring(8, 9)));
  }
  
  /**
   * Devuelve la letra correcta para el DNI introducido.
   * 
   * @param dni DNI a validar (String)
   * @return  True si es correcto, false si no lo es.
   */
  public String getLetra (String dni) {
    return LETRA_FINAL.substring(Integer.parseInt(dni.substring(0, 8))%23, 
        (Integer.parseInt(dni.substring(0, 8))%23)+1);
  }
}

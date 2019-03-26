package excepciones;

public class GatoSimple {
  //##############   Atributos   ##############\\
  String color, raza, sexo;
  int edad;
  double peso;
  int numCrias = 0;
  
  //##############   Método   ##############\\
  
//constructor
  GatoSimple () {
    this.sexo = "";
  }
  
  //constructor
  GatoSimple (String s) {
    this.sexo = s;
  }
  
  
  //getter
  String getSexo() {
    return this.sexo;
  }
  
  
  /**
  * Hace que el gato maulle
  */
  void maulla() {
    System.out.println("Miauuuu");
  }
  
  
  /**
  * Hace que el gato ronronee
  */
  void ronronea() {
    System.out.println("mrrrrrr");
  }
  
  
  /**
  * Hace que el gato coma.
  * A los gatos les gusta el pescado, si le damos otra comida
  * la rechazará.
  *
  Programación orientada a objetos 123
  * @param comida la comida que se le ofrece al gato
  */
  void come(String comida) {
    if (comida.equals("pescado")) {
      System.out.println("Hmmmm, gracias");
    } else {
      System.out.println("Lo siento, yo solo como pescado");
    }
  }
  
  
  /**
  * Pone a pelear dos gatos.
  * Solo se van a pelear dos machos entre sí.
  *
  * @param contrincante es el gato contra el que pelear
  */
  void peleaCon(GatoSimple contrincante) {
    if (this.sexo.equals("hembra")) {
      System.out.println("No me gusta pelear");
    } else {
      if (contrincante.getSexo().equals("hembra")) {
        System.out.println("No peleo con gatitas");
      } else {
        System.out.println("Ven aquí que te vas a enterar");
      }
    }
  }
  
  
  /**
   * Permite aparearse a dos gatos de diferente sexo.
   * 
   * @param gato  Instancia de gato con el que el
   * @throws ExcepcionApareamientoImposible
   */
  void apareaCon(GatoSimple gato) throws ExcepcionApareamientoImposible{
    if(this.getSexo().equals(gato.getSexo())) {
      throw new ExcepcionApareamientoImposible();
    } else {
      System.out.println("Acaba de nacer una cría. Enhorabuena!!");
    }
  }
  
}

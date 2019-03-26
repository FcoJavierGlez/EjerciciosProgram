package primerosejerciciospoo;

public class TestCirculo {
  public static void main(String[] args) {
    //Objeto circulo:
    
    Circulo circulo1 = new Circulo();
    
    
    
    //Inicio del test:
    
    System.out.print(circulo1.toString());
    
    System.out.print("\n\nAumentamos el radio 27 veces.");
    
    circulo1.aumentaRadio(2*27);
    
    System.out.print(circulo1.getArea());
    
    System.out.print("\n\nMenguamos el radio 10 veces.");
    
    circulo1.reducirRadio(circulo1.radio/10);
    
    System.out.print(circulo1.toString());
    
    
    
    
    
  }

}

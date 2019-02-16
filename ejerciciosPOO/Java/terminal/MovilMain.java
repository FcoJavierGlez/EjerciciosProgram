package terminal;

public class MovilMain {
  public static void main(String[] args) {
    
    Movil m1 = new Movil("667 20 16 94", "rata");
    Movil m2 = new Movil("677 31 54 77", "mono");
    Movil m3 = new Movil("670 46 22 12", "bisonte");
    
    System.out.println(m1.toString());
    System.out.println(m2.toString());
    
    m1.llama(m2, 320);
    m1.llama(m3, 200);
    m2.llama(m3, 550);
    
    System.out.println(m1.toString());
    System.out.println(m2.toString());
    System.out.println(m3.toString());
        
  }
}

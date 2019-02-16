package terminal;

public class TerminalMain {
  public static void main(String[] args) {
    
    //Objetos:
    Terminal t1 = new Terminal("667 90 46 22");    
    Terminal t2 = new Terminal("667 50 12 73");
    Terminal t3 = new Terminal("670 51 02 30");    
    Terminal t4 = new Terminal("697 20 91 57");
    
    System.out.println(t1.toString());
    System.out.println(t2.toString());
    
    t1.llama(t2, 320);
    t1.llama(t3, 200);
    
    System.out.println(t1.toString());
    System.out.println(t2.toString());
    System.out.println(t3.toString());
    System.out.println(t4.toString());
    
  }
}

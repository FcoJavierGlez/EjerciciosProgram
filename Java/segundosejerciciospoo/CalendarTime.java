package segundosejerciciospoo;

import java.time.Instant;

public class CalendarTime {
  public static void main(String[] args) {
    //PENDIENTE DE REALIZAR
    
    Instant tiempo = Instant.ofEpochSecond(3600);
    
    System.out.println(tiempo);
    
  }
  
  public String toString(Instant t) {
    return Long.toString((long)t.getEpochSecond()/3600);
  }

  
}

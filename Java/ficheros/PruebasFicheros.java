package ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PruebasFicheros {
  public static void main(String[] args) {
    //
    
//    try {
//      BufferedReader r = new BufferedReader(new FileReader("ejemplo.txt"));
//    } catch (FileNotFoundException e) {
//      System.out.println("No se ha encontrado el archivo " + "ejemplo.txt");
//    }
    
    try {
      BufferedWriter w = new BufferedWriter(new FileWriter("ejemplo.txt"));
      
      w.write("Esto es un ejemplo");
      
      w.close();
      
    } catch (IOException e) {}
    
    
    
  }
}

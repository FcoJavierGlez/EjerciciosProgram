package entornografico.dni;

import javax.swing.JFrame;

import entornografico.areas.Ventana;

public class Test {
  public static void main(String [] args) {
    VentanaDni v = new VentanaDni();
    v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    v.setVisible(true);
  }
}

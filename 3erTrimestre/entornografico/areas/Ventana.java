package entornografico.areas;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * Calcular el perímetro y área de un rectángulo dada su base y su altura.
 * 
 * 
 * @author Francisco Javier González Sabariego
 *
 */
public class Ventana extends JFrame {
  private JTextField textField_resultado;
  public Ventana() {
    super("Calcular área");
    setBounds(500, 300, 300, 200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(false);
    
    
    Container cp = getContentPane();
    
    JLabel etiquetaBase = new JLabel("Base:  ");
    etiquetaBase.setBounds(10, 8, 45, 14);
    JTextField base = new JTextField(20);
    base.setBounds(65, 8, 213, 20);
    JTextField altura = new JTextField(20);
    altura.setBounds(65, 34, 213, 20);
    getContentPane().setLayout(null);
    cp.add(etiquetaBase);
    cp.add(base);
    
    JLabel etiquetaAltura = new JLabel("Altura: ");
    etiquetaAltura.setBounds(10, 31, 45, 14);
    cp.add(etiquetaAltura);
    cp.add(altura);
    
    JButton botonCalcular = new JButton("Calcular");
    botonCalcular.setBounds(106, 76, 84, 36);
    cp.add(botonCalcular);
    botonCalcular.addActionListener(new BotonCalcular(base, altura));
    
    textField_resultado = new JTextField();
    textField_resultado.setEditable(false);
    textField_resultado.setBounds(136, 124, 104, 20);
    getContentPane().add(textField_resultado);
    textField_resultado.setColumns(10);
    
    JLabel lblNewLabel = new JLabel("Resultado:");
    lblNewLabel.setBounds(65, 123, 61, 21);
    getContentPane().add(lblNewLabel);
  }
  
  
  class BotonCalcular implements ActionListener {
    private JTextField cuadroBase;
    private JTextField cuadroAltura;
    
    public BotonCalcular(JTextField cuadroBase, JTextField cuadroAltura) {
      this.cuadroBase = cuadroBase;
      this.cuadroAltura = cuadroAltura;
    }
    
    public void actionPerformed(ActionEvent e) {
      try {
        double base = Double.parseDouble(cuadroBase.getText());
        double altura = Double.parseDouble(cuadroAltura.getText());
        
        textField_resultado.setText(Double.toString(base*altura));
      } catch (NumberFormatException e1) {
        JOptionPane.showMessageDialog(null, "Debes introducir un número.",
            "Error", JOptionPane.ERROR_MESSAGE);}
      
    }
  }
}



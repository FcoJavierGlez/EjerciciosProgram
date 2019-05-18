package entornografico.vector;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame {

  private JPanel contentPane;
  private JTextField textX1;
  private JTextField textY1;
  private JTextField textY2;
  private JTextField textX2;
  private JTextField resultado;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          Ventana frame = new Ventana();
          frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the frame.
   */
  public Ventana() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 450, 300);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);
    
    JLabel lblX = new JLabel("X1");
    lblX.setBounds(124, 23, 29, 24);
    contentPane.add(lblX);
    
    JLabel lblY = new JLabel("Y1");
    lblY.setBounds(124, 79, 29, 24);
    contentPane.add(lblY);
    
    JLabel lblX_1 = new JLabel("X2");
    lblX_1.setBounds(319, 23, 29, 24);
    contentPane.add(lblX_1);
    
    JLabel lblY_1 = new JLabel("Y2");
    lblY_1.setBounds(319, 79, 29, 24);
    contentPane.add(lblY_1);
    
    textX1 = new JTextField();
    textX1.setBounds(66, 48, 120, 20);
    contentPane.add(textX1);
    textX1.setColumns(10);
    
    textY1 = new JTextField();
    textY1.setColumns(10);
    textY1.setBounds(66, 104, 120, 20);
    contentPane.add(textY1);
    
    textY2 = new JTextField();
    textY2.setColumns(10);
    textY2.setBounds(268, 104, 120, 20);
    contentPane.add(textY2);
    
    textX2 = new JTextField();
    textX2.setColumns(10);
    textX2.setBounds(268, 48, 120, 20);
    contentPane.add(textX2);
    
    JButton btnDistancia = new JButton("Distancia");
    btnDistancia.addActionListener(new BotonDistancia(textX1, textX2, textY1, textY2));
    btnDistancia.setBounds(181, 147, 89, 23);
    contentPane.add(btnDistancia);
    
    resultado = new JTextField();
    resultado.setBounds(163, 201, 185, 20);
    contentPane.add(resultado);
    resultado.setColumns(10);
    
    JLabel lblDistancia = new JLabel("Distancia:");
    lblDistancia.setBounds(87, 204, 66, 14);
    contentPane.add(lblDistancia);
  }
  
  
  class BotonDistancia implements ActionListener {
    private JTextField textX1;
    private JTextField textX2;
    private JTextField textY1;
    private JTextField textY2;
    
    public BotonDistancia(JTextField textX1, JTextField textX2, JTextField textY1, JTextField textY2) {
      this.textX1 = textX1;
      this.textX2 = textX2;
      this.textY1 = textY1;
      this.textY2 = textY2;
    }
    
    
    public void actionPerformed(ActionEvent e) {
      try {
        int x1 = Integer.parseInt(textX1.getText());
        int x2 = Integer.parseInt(textX2.getText());
        int y1 = Integer.parseInt(textY1.getText());
        int y2 = Integer.parseInt(textY2.getText());
        
        resultado.setText(Double.toString(Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2))));
      } catch (NumberFormatException e1) {
        JOptionPane.showMessageDialog(null, "Debes introducir un número.",
            "Error", JOptionPane.ERROR_MESSAGE);}
      
    }
  }
  
  
  
}

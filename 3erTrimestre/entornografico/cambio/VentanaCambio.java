package entornografico.cambio;

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
import javax.swing.JTextPane;

public class VentanaCambio extends JFrame {
  private JPanel contentPane;
  private JTextField textFieldEntrada;
  private JTextPane txtpnSalida;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          VentanaCambio frame = new VentanaCambio();
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
  public VentanaCambio() {
    super("Calcula cambio");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 450, 480);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);
    
    JLabel lblNewValor = new JLabel("Ingrese el cambio");
    lblNewValor.setBounds(164, 11, 105, 30);
    contentPane.add(lblNewValor);
    
    textFieldEntrada = new JTextField();
    textFieldEntrada.setBounds(145, 41, 142, 30);
    contentPane.add(textFieldEntrada);
    textFieldEntrada.setColumns(10);
    
    JButton btnResultado = new JButton("RESULTADO");
    btnResultado.addActionListener(new BotonResultado(textFieldEntrada));
    btnResultado.setBounds(164, 75, 105, 37);
    contentPane.add(btnResultado);
    
    txtpnSalida = new JTextPane();
    txtpnSalida.setEditable(false);
    txtpnSalida.setBounds(108, 123, 210, 300);
    contentPane.add(txtpnSalida);
    
    JButton btnBorrar = new JButton("BORRAR");
    btnBorrar.addActionListener(new BotonBorrar());
    btnBorrar.setBounds(335, 386, 89, 37);
    contentPane.add(btnBorrar);
  }
  
  public class BotonResultado implements ActionListener {
    JTextField textFieldEntrada;
    
    public BotonResultado(JTextField textFieldEntrada) {
      this.textFieldEntrada = textFieldEntrada;
    }
    
    public void actionPerformed(ActionEvent e) {
      try {
        txtpnSalida.setText("");
        txtpnSalida.setText(CambioIdeal.devuelveCambio(textFieldEntrada.getText()));
      } catch (NumeroIncorrecto e1) {
        JOptionPane.showMessageDialog(null, "Número inválido.",
          "Error", JOptionPane.ERROR_MESSAGE);
      }
    }
  }
  
  public class BotonBorrar implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      textFieldEntrada.setText("");
      txtpnSalida.setText("");
    }
  }
}

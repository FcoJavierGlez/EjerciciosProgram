package entornografico.dni;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class VentanaDni extends JFrame {

  private JPanel contentPane;
  private JTextField textFieldEntrada;
  private JTextField textFieldSalida;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          VentanaDni frame = new VentanaDni();
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
  public VentanaDni() {
    super("Validador de DNI");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 450, 300);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);
    
    textFieldEntrada = new JTextField();
    textFieldEntrada.setBounds(147, 61, 155, 28);
    contentPane.add(textFieldEntrada);
    textFieldEntrada.setColumns(10);
    
    JLabel lblIntroduzcaSuDni = new JLabel("Introduzca su DNI");
    lblIntroduzcaSuDni.setBounds(181, 29, 109, 21);
    contentPane.add(lblIntroduzcaSuDni);
    
    JButton btnValidar = new JButton("VALIDAR");
    btnValidar.addActionListener(new BotonValidar(textFieldEntrada));
    btnValidar.setBounds(181, 121, 89, 35);
    contentPane.add(btnValidar);
    
    textFieldSalida = new JTextField();
    textFieldSalida.setEditable(false);
    textFieldSalida.setBounds(147, 182, 155, 35);
    contentPane.add(textFieldSalida);
    textFieldSalida.setColumns(10);
    
    JButton btnBorrar = new JButton("BORRAR");
    btnBorrar.addActionListener(new BotonBorrar());
    btnBorrar.setBounds(335, 11, 89, 35);
    contentPane.add(btnBorrar);
  }
  
  
  public class BotonValidar implements ActionListener {
    private JTextField textFieldEntrada;  
    
    public BotonValidar(JTextField textFieldEntrada) {
      this.textFieldEntrada = textFieldEntrada;
    }
    
    public void actionPerformed(ActionEvent e) {
      if (textFieldEntrada.getText().equals("")) {
        textFieldSalida.setText("");
        JOptionPane.showMessageDialog(null, "Introduzca un DNI.",
            "Error", JOptionPane.ERROR_MESSAGE);
      } else if (Dni.validaDni(textFieldEntrada.getText().toUpperCase())) {
        textFieldSalida.setText("DNI válido.");
      } else {
        textFieldSalida.setText("");
        JOptionPane.showMessageDialog(null, "DNI incorrecto.",
          "Error", JOptionPane.ERROR_MESSAGE);
      }
    }
  }
  
  
  public class BotonBorrar implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      textFieldEntrada.setText("");
      textFieldSalida.setText("");
    }
  }
}

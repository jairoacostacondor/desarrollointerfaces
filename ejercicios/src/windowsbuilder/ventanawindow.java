package windowsbuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import java.awt.Window.Type;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JToolBar;

public class ventanawindow {

	private JFrame frmVentana;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//
					ventanawindow window = new ventanawindow();
					window.frmVentana.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}); //esto es para llamar a la interfaz metemos con un metodo abstracto
	}

	/**
	 * Create the application.
	 */
	public ventanawindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmVentana = new JFrame();
		frmVentana.setIconImage(Toolkit.getDefaultToolkit().getImage(ventanawindow.class.getResource("/resources/x.png")));
		frmVentana.setForeground(new Color(255, 255, 255));
		frmVentana.getContentPane().setForeground(new Color(205, 187, 253));
		frmVentana.setTitle("Registro");
		frmVentana.setBounds(100, 100, 450, 300);
		frmVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmVentana.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(72, 25, 46, 14);
		frmVentana.getContentPane().add(lblNewLabel);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(72, 50, 46, 14);
		frmVentana.getContentPane().add(lblApellidos);
		
		textField = new JTextField();
		textField.setBounds(225, 22, 86, 20);
		frmVentana.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(225, 47, 86, 20);
		frmVentana.getContentPane().add(textField_1);
		
		JButton btnNewButton = new JButton("Cancelar");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setForeground(new Color(205, 187, 253));
		btnNewButton.setBounds(52, 175, 89, 23);
		frmVentana.getContentPane().add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(225, 78, 86, 20);
		frmVentana.getContentPane().add(passwordField);
		
		JLabel lblNewLabel_1 = new JLabel("Contraseña");
		lblNewLabel_1.setBounds(72, 75, 69, 14);
		frmVentana.getContentPane().add(lblNewLabel_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("masculino");
		rdbtnNewRadioButton.setBounds(169, 105, 109, 23);
		frmVentana.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnFemenino = new JRadioButton("Femenino");
		rdbtnFemenino.setBounds(304, 105, 124, 23);
		frmVentana.getContentPane().add(rdbtnFemenino);
		
		JButton btnNewButton_1 = new JButton("Siguiente");
		btnNewButton_1.setBounds(286, 175, 89, 23);
		frmVentana.getContentPane().add(btnNewButton_1);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 0, 87, 16);
		frmVentana.getContentPane().add(toolBar);
	}
}

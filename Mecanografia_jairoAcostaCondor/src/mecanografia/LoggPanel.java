package mecanografia;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoggPanel {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoggPanel window = new LoggPanel();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoggPanel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnIniciarSesion = new JButton("Iniciar Sesión");
		btnIniciarSesion.setBounds(53, 146, 113, 23);
		frame.getContentPane().add(btnIniciarSesion);

		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.setBounds(288, 146, 89, 23);
		frame.getContentPane().add(btnRegistrarse);

		JLabel lblBienvenido = new JLabel("Bienvenido");
		lblBienvenido.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblBienvenido.setBounds(167, 60, 113, 23);
		frame.getContentPane().add(lblBienvenido);

		// ActionListener para "Iniciar Sesión"
		btnIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Cambiar a la ventana de IniciarSesion
				IniciarSesion iniciarSesion = new IniciarSesion();
				iniciarSesion.getFrame().setVisible(true);
				frame.dispose(); // Cerrar la ventana actual
			}
		});

		// ActionListener para "Registrarse"
		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Cambiar a la ventana de Registro
				Registro registro = new Registro();
				registro.getFrame().setVisible(true);
				frame.dispose(); // Cerrar la ventana actual
			}
		});
	}
}

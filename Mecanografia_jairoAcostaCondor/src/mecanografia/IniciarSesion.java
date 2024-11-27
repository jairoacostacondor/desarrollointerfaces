package mecanografia;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class IniciarSesion {
	private JFrame frame;

	public IniciarSesion() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblIniciarSesion = new JLabel("Iniciar Sesión");
		lblIniciarSesion.setBounds(150, 50, 150, 30);
		frame.getContentPane().add(lblIniciarSesion);
	}

	public JFrame getFrame() {
		return frame;
	}
}

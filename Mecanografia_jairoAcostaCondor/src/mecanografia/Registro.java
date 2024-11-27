package mecanografia;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Registro {
	private JFrame frame;

	public Registro() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblRegistro = new JLabel("Formulario de Registro");
		lblRegistro.setBounds(150, 50, 150, 30);
		frame.getContentPane().add(lblRegistro);
	}

	public JFrame getFrame() {
		return frame;
	}
}

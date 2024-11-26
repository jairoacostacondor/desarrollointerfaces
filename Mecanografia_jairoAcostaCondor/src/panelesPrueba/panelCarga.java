package panelesPrueba;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JProgressBar;
import javax.swing.Timer;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.ImageIcon;

public class panelCarga {

	private JFrame frame;
	
	private static Timer crono;
	private static int i = 6;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					panelCarga window = new panelCarga();
					window.frame.setVisible(true);
					crono.start();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public panelCarga() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setUndecorated(true);
		frame.setResizable(false);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(panelCarga.class.getResource("/panelesPrueba/teclado2.png")));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bienvenid@");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(155, 50, 127, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(128, 137, 177, 14);
		frame.getContentPane().add(progressBar);
		
		
		crono = new Timer(1000, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				i--;
				
				if(i == 0) {
					crono.stop();
				}
				progressBar.setValue(progressBar.getValue()+17);
				
			}
		});
		
		
		
	}
}

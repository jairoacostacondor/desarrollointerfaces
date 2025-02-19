package moscas;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.event.MouseMotionAdapter;
import java.util.Random;
import java.awt.event.MouseEvent;

public class atrapaMoscas {

	private JFrame frame;
	Random aleatorio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					atrapaMoscas window = new atrapaMoscas();
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
	public atrapaMoscas() {
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
		
		JLabel lblMOSCA = new JLabel("");
		ImageIcon miniMosca = new ImageIcon (atrapaMoscas.class.getResource("/moscas/mosca-domestica-640x400.jpg"));
		Image miniMoscaRed=miniMosca.getImage().getScaledInstance(50, 50, Image.SCALE_FAST);
		lblMOSCA.setIcon(new ImageIcon(miniMoscaRed));
		lblMOSCA.setBounds(0, 0, 50, 50);
		frame.getContentPane().add(lblMOSCA);
		
		JLabel lblPosMos = new JLabel("Posición de la mosca: ");
		lblPosMos.setBounds(10, 236, 104, 14);
		frame.getContentPane().add(lblPosMos);
		
		JLabel lblPosRat = new JLabel("Posición del Puntero: ");
		lblPosRat.setBounds(245, 236, 103, 14);
		frame.getContentPane().add(lblPosRat);
		
		JLabel lblCoorMos = new JLabel("");
		lblCoorMos.setBounds(121, 236, 89, 14);
		frame.getContentPane().add(lblCoorMos);
		
		JLabel lblCoorRat = new JLabel("");
		lblCoorRat.setBounds(345, 236, 79, 14);
		frame.getContentPane().add(lblCoorRat);
		
		frame.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				int Xpuntero = e.getX();
				int Ypuntero = e.getY();
				
				int Xlabel = lblMOSCA.getX();
				int Ylabel = lblMOSCA.getY();
				
				int tamX= lblMOSCA.getWidth();
				int tamY = lblMOSCA.getHeight();
				
				lblCoorMos.setText("X= "+Xlabel+ "Y= "+Ylabel);
				lblCoorRat.setText("X="+Xpuntero+ "Y= "+Ypuntero);
				
				int distanX = Math.abs(Ylabel-Xpuntero);
				int distanY = Math.abs(Ylabel-Ypuntero);
				
				
				int radio=50;
				if (distanX<radio || distanY<radio) {
					
					int moverX = aleatorio.nextInt(101)-50;
					int moverY = aleatorio.nextInt(101)-50;
					
					int nuevaX=Math.max(0, Math.min(Xlabel+moverX, frame.getWidth()-2*tamX));
					int nuevaY=Math.max(0, Math.min(Ylabel + moverY, frame.getHeight()-2*tamY));
					
					lblMOSCA.setLocation(moverX, moverY);
				}
				
			}
		});
		
		
	}
}

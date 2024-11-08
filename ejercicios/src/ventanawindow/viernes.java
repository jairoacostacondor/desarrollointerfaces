package ventanawindow;

import java.awt.Component;

import java.awt.EventQueue;

import java.awt.Graphics;

import java.awt.Image;

import java.awt.image.BufferedImage;

import java.io.*;

import javax.imageio.ImageIO;

import javax.swing.JFrame;

import javax.swing.JPanel;
import java.awt.GridLayout;

public class viernes {

	private JFrame frame;

	/*
	 * 
	 * Launch the application.
	 * 
	 */

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			public void run() {

				try {

					viernes window = new viernes();

					window.frame.setVisible(true);

				} catch (Exception e) {

					e.printStackTrace();

				}

			}

		});

	}

	/*
	 * 
	 * Create the application.
	 * 
	 */

	public viernes() {

		initialize();

	}

	/*
	 * 
	 * Initialize the contents of the frame.
	 * 
	 */

	private void initialize() {

		frame = new JFrame();

		frame.setBounds(100, 100, 450, 300);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));

		frame.getContentPane().add(createContenPanelConFondo());

	}

	private Component createContenPanelConFondo() {

		final Image imagenFondo = requestImage();

		JPanel miPanel = new JPanel() {

			@Override

			protected void paintComponent(Graphics g) {

				super.paintComponent(g);

				g.drawImage(imagenFondo,0,0, frame.getWidth(), frame.getHeight(), null);

			};

		};
		
		
		return miPanel;

	}

	private Image requestImage() {

		BufferedImage imagen = null;

		try {

			imagen = ImageIO.read(new File("src\\ventanawindow\\kitty1.jpg"));

		} catch (IOException e) {

			e.printStackTrace();

		}

		return imagen;

	}

}

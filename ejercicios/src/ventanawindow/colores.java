package ventanawindow;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;

public class colores {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					colores window = new colores();
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
	public colores() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0, 2, 6, 9));
		// PANEL000000000000000
		JPanel panel = new JPanel();
		panel.setBackground(new Color(64, 128, 128));
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("0");
		lblNewLabel.setBounds(95, 11, 19, 37);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel);

		JButton btnNewButton = new JButton("MOSTAR PANEL 1");
		btnNewButton.setBounds(46, 63, 117, 23);
		btnNewButton.setVerticalAlignment(SwingConstants.BOTTOM);
		panel.add(btnNewButton);
		// PANEL1111111111111111111111111111
		JPanel panel_1 = new JPanel();
		panel_1.setVisible(false);
		panel_1.setRequestFocusEnabled(false);
		panel_1.setBackground(new Color(255, 0, 255));
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JButton btnNewButton_1 = new JButton("MOSTRAR EL PANEL 2");
		btnNewButton_1.setBounds(31, 70, 139, 23);
		panel_1.add(btnNewButton_1);

		JLabel lblNewLabel_1_2 = new JLabel("1");
		lblNewLabel_1_2.setBounds(95, 11, 19, 37);
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_1.add(lblNewLabel_1_2);
		// PANEL222222222222222222222222222
		JPanel panel_2 = new JPanel();
		panel_2.setVisible(false);
		panel_2.setBackground(new Color(255, 128, 64));
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);

		JButton btnNewButton_2 = new JButton("MOSTRAR EL PANEL 3");
		btnNewButton_2.setBounds(28, 68, 139, 23);
		panel_2.add(btnNewButton_2);

		JLabel lblNewLabel_1 = new JLabel("2");
		lblNewLabel_1.setBounds(92, 20, 19, 37);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_2.add(lblNewLabel_1);
		// PANEL33333333333333333333333333333333333
		JPanel panel_3 = new JPanel();
		panel_3.setVisible(false);
		panel_3.setBackground(new Color(255, 255, 128));
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);

		JButton btnNewButton_3 = new JButton("OCULTAR TODO");
		btnNewButton_3.setBounds(40, 65, 111, 23);
		panel_3.add(btnNewButton_3);

		JLabel lblNewLabel_1_1 = new JLabel("3");
		lblNewLabel_1_1.setBounds(92, 17, 19, 37);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_3.add(lblNewLabel_1_1);

		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				panel_1.setVisible(true);

			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				panel_2.setVisible(true);

			}
		});
		btnNewButton_2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				panel_3.setVisible(true);

			}
		});
		btnNewButton_3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				panel_3.setVisible(false);
				panel_2.setVisible(false);
				panel_1.setVisible(false);

			}
		});

	}

}

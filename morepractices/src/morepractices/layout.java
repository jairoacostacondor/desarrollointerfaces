package morepractices;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import java.awt.Toolkit;

public class layout {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					layout window = new layout();
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
	public layout() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\CFGS\\Documents\\Desarrollo de Interfaz\\morepractices\\src\\morepractices\\Heart_corazón.svg.png"));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 255, 0));
		frame.getContentPane().add(panel, "name_13082455283000");
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PAGINA1");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(182, 101, 72, 14);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton(" PAG2");
		btnNewButton.setBounds(171, 138, 89, 23);
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 0, 255));
		frame.getContentPane().add(panel_1, "name_13102392760200");
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("PAGINA2");
		lblNewLabel_1.setBounds(175, 81, 70, 19);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_1.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("PAG 3");
		btnNewButton_1.setBounds(163, 139, 89, 23);
		panel_1.add(btnNewButton_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 0, 128));
		frame.getContentPane().add(panel_2, "name_13125528443900");
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("PAG 3");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(191, 107, 46, 14);
		panel_2.add(lblNewLabel_2);
		
		JButton btnNewButton_2 = new JButton("PAG 1");
		btnNewButton_2.setBounds(170, 143, 89, 23);
		panel_2.add(btnNewButton_2);
		
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				panel_1.setVisible(true);

			}
			
		});
		
		btnNewButton_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				panel_1.setVisible(false);
				panel_2.setVisible(true);

			}
			
		});
		
		btnNewButton_2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				panel_2.setVisible(false);
				panel.setVisible(true);

			}
			
		});
	
	
}
}

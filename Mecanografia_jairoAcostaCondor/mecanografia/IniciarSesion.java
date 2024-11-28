package mecanografia;

import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class IniciarSesion {
    private JFrame frame;
    private JTextField textFieldUsuario;
    private JPasswordField passwordField;

    public IniciarSesion() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblUsuario = new JLabel("Usuario");
        lblUsuario.setBounds(150, 50, 150, 30);
        frame.getContentPane().add(lblUsuario);

        textFieldUsuario = new JTextField();
        textFieldUsuario.setBounds(150, 90, 150, 30);
        frame.getContentPane().add(textFieldUsuario);
        textFieldUsuario.setColumns(10);

        JLabel lblContraseña = new JLabel("Contraseña");
        lblContraseña.setBounds(150, 130, 150, 30);
        frame.getContentPane().add(lblContraseña);

        passwordField = new JPasswordField();
        passwordField.setBounds(150, 170, 150, 30);
        frame.getContentPane().add(passwordField);

        JButton btnIniciarSesion = new JButton("Iniciar Sesión");
        btnIniciarSesion.setBounds(150, 210, 150, 30);
        frame.getContentPane().add(btnIniciarSesion);

        btnIniciarSesion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String usuario = textFieldUsuario.getText();
                String contraseña = new String(passwordField.getPassword());

                // Llamar al método para comprobar si el usuario existe
                if (verificarUsuario(usuario, contraseña)) {
                    JOptionPane.showMessageDialog(frame, "Inicio de sesión exitoso.");
                    // Aquí puedes continuar con el siguiente paso (redirigir o mostrar la ventana principal)
                } else {
                    JOptionPane.showMessageDialog(frame, "Usuario o contraseña incorrectos.");
                }
            }
        });
    }

    // Método para verificar si el usuario existe en el archivo
    private boolean verificarUsuario(String usuario, String contraseña) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("usuarios.txt"));
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(":");
                if (datos[0].equals(usuario) && datos[1].equals(contraseña)) {
                    br.close();
                    return true; // Usuario encontrado
                }
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false; // Usuario no encontrado
    }

    public JFrame getFrame() {
        return frame;
    }
}

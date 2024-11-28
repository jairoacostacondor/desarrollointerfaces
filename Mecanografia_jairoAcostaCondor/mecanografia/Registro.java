package mecanografia;

import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class Registro {
    private JFrame frame;
    private JTextField textFieldUsuario;
    private JPasswordField passwordField;

    public Registro() {
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

        JButton btnRegistrar = new JButton("Registrarse");
        btnRegistrar.setBounds(150, 210, 150, 30);
        frame.getContentPane().add(btnRegistrar);

        btnRegistrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Obtener los datos del formulario
                String usuario = textFieldUsuario.getText();
                String contraseña = new String(passwordField.getPassword());

                // Llamar al método para guardar el nuevo usuario
                registrarUsuario(usuario, contraseña);
            }
        });
    }

    // Método para registrar al usuario en el archivo de texto
    private void registrarUsuario(String usuario, String contraseña) {
        try {
            // Abrir el archivo en modo de escritura
            FileWriter fw = new FileWriter("usuarios.txt", true); // 'true' para añadir al final
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(usuario + ":" + contraseña); // Escribir el nombre de usuario y la contraseña
            bw.newLine(); // Nueva línea
            bw.close();
            JOptionPane.showMessageDialog(frame, "¡Registro exitoso!");
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(frame, "Error al registrar el usuario.");
        }
    }

    public JFrame getFrame() {
        return frame;
    }
}

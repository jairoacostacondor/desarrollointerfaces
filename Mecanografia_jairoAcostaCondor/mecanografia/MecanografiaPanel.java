package mecanografia;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class MecanografiaPanel {

    private JFrame frame;
    private JTextArea textoAEscribir;
    private JTextField textoUsuario;
    private JLabel lblTexto;
    private String textoParaEscribir = "Este es el texto de ejemplo para practicar la mecanografía.";
    private int textoIndex = 0;

    // Lista de botones del teclado
    private ArrayList<JButton> tecladoBotones;

    public MecanografiaPanel() {
        // Inicializar la ventana
        frame = new JFrame("Mecanografía");
        frame.setBounds(100, 100, 600, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        // Etiqueta que muestra el texto a escribir
        lblTexto = new JLabel("Texto a escribir:");
        lblTexto.setFont(new Font("Arial", Font.PLAIN, 14));
        lblTexto.setBounds(20, 20, 200, 30);
        frame.getContentPane().add(lblTexto);

        // Texto a escribir (no editable, solo para mostrar el texto)
        textoAEscribir = new JTextArea();
        textoAEscribir.setText(textoParaEscribir);
        textoAEscribir.setFont(new Font("Courier New", Font.PLAIN, 16));
        textoAEscribir.setBounds(20, 60, 550, 50);
        textoAEscribir.setEditable(false);
        textoAEscribir.setBackground(Color.LIGHT_GRAY);
        frame.getContentPane().add(textoAEscribir);

        // Área de texto donde el usuario escribirá
        textoUsuario = new JTextField();
        textoUsuario.setFont(new Font("Courier New", Font.PLAIN, 16));
        textoUsuario.setBounds(20, 130, 550, 30);
        frame.getContentPane().add(textoUsuario);
        textoUsuario.setEditable(true);

        // Lista de botones para las letras del teclado
        tecladoBotones = new ArrayList<>();
        String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        // Crear los botones para el teclado
        int xPos = 20, yPos = 200;
        for (char letra : alfabeto.toCharArray()) {
            JButton boton = new JButton(String.valueOf(letra));
            boton.setBounds(xPos, yPos, 40, 40);
            boton.setFont(new Font("Arial", Font.PLAIN, 18));
            boton.setBackground(Color.LIGHT_GRAY);
            boton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    char tecla = boton.getText().charAt(0);  // Obtenemos la letra del botón
                    textoUsuario.setText(textoUsuario.getText() + tecla);  // Añadimos la letra al texto del usuario
                    verificarTexto(tecla, boton); // Comprobamos si la letra es correcta
                }
            });
            frame.getContentPane().add(boton);
            tecladoBotones.add(boton);

            // Ajustar la posición de los botones
            xPos += 50;
            if (xPos > 500) {
                xPos = 20;
                yPos += 50;  // Nueva fila
            }
        }

        // Botón para reiniciar la práctica
        JButton btnReiniciar = new JButton("Reiniciar");
        btnReiniciar.setBounds(250, 400, 100, 30);
        frame.getContentPane().add(btnReiniciar);

        btnReiniciar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textoIndex = 0;
                textoUsuario.setText("");  // Limpiar el texto del usuario
                textoAEscribir.setText(textoParaEscribir);  // Resetear el texto a escribir
                resetearBotones();  // Resetear el color de los botones
            }
        });
    }

    // Método para verificar si el texto es correcto
    private void verificarTexto(char letra, JButton boton) {
        if (textoIndex < textoParaEscribir.length() && letra == textoParaEscribir.charAt(textoIndex)) {
            textoIndex++;
            boton.setBackground(Color.GREEN);  // Ilumina el botón en verde si es correcto
        } else {
            boton.setBackground(Color.RED);  // Ilumina el botón en rojo si es incorrecto
        }

        // Verificar si el usuario completó todo el texto
        if (textoIndex == textoParaEscribir.length()) {
            JOptionPane.showMessageDialog(frame, "¡Felicidades! Has completado el texto.");
        }
    }

    // Método para resetear el color de todos los botones
    private void resetearBotones() {
        for (JButton boton : tecladoBotones) {
            boton.setBackground(Color.LIGHT_GRAY);
        }
    }

    // Mostrar la ventana
    public void mostrar() {
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Ejecutar la interfaz en el hilo de eventos
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MecanografiaPanel ventana = new MecanografiaPanel();
                    ventana.mostrar();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}

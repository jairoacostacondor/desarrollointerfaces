package mecanografia;

import javax.swing.*;
import java.awt.*;

public class barraCarga {

    private JFrame frame;
    private JProgressBar progressBar;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                barraCarga window = new barraCarga();
                window.frame.setVisible(true);
                window.simularCarga();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    /**
     * Create the application.
     */
    public barraCarga() {
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

        JLabel lblCargando = new JLabel("Cargando contenidos...");
        lblCargando.setBounds(164, 236, 150, 14);
        frame.getContentPane().add(lblCargando);

        progressBar = new JProgressBar();
        progressBar.setBounds(112, 202, 219, 23);
        frame.getContentPane().add(progressBar);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 434, 147);
        frame.getContentPane().add(panel);
    }

    /**
     * Simula la barra de carga durante 6 segundos.
     */
    private void simularCarga() {
        new Thread(() -> {
            for (int i = 0; i <= 100; i++) {
                try {
                    Thread.sleep(60); // Incremento uniforme para simular los 6 segundos
                    progressBar.setValue(i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            abrirLoggPanel(); // Cambiar a LoggPanel después de completar la barra de carga
        }).start();
    }

    /**
     * Abre la ventana LoggPanel y cierra la barra de carga.
     */
    private void abrirLoggPanel() {
        EventQueue.invokeLater(() -> {
            LoggPanel loggPanel = new LoggPanel(); // Asegúrate de importar LoggPanel en tu proyecto
            loggPanel.getFrame().setVisible(true);
            frame.dispose(); // Cerrar la ventana actual
        });
    }
}

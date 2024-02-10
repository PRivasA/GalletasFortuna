import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MensajeFortuna extends JFrame implements ActionListener {
    private String[] mensajes = {
            "Cada día es una nueva oportunidad para alcanzar tus sueños.",
            "El éxito no es un destino, es un camino que se recorre con esfuerzo y constancia.",
            "La felicidad se encuentra en las pequeñas cosas de la vida.",
            "A veces, las respuestas están dentro de nosotros mismos.",
            "Los errores son parte del aprendizaje, no te rindas si fracasas.",
            "La vida es un regalo, disfrútala al máximo cada día.",
            "La paciencia es la clave para alcanzar grandes logros.",
            "Si quieres algo, lucha por ello hasta conseguirlo.",
            "El éxito no es la clave de la felicidad, la felicidad es la clave del éxito.",
            "No te rindas nunca, incluso en los momentos más difíciles.",
            "No importa cuántas veces caigas, lo importante es levantarse y seguir adelante.",
            "La confianza en ti mismo es la clave para enfrentar el futuro con seguridad.",
            "El  amor  es  la  fuerza  que  mueve  el  mundo.",
    };

    private JLabel lblTitulo;
    private JButton btnObtenerMensaje;
    private JLabel lblMensaje;

    public MensajeFortuna() {
        setTitle("Mensajes de Fortuna");
        setSize(700, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setLayout(new FlowLayout());


        lblTitulo = new JLabel("Galleta de la fortuna");
        lblTitulo.setAlignmentX(Component.CENTER_ALIGNMENT);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 31));
        lblTitulo.setForeground(Color.BLUE);

        btnObtenerMensaje = new JButton("Presiona aquí");
        btnObtenerMensaje.setFont(new Font("Arial", Font.BOLD, 13));
        btnObtenerMensaje.setForeground(Color.DARK_GRAY);

        lblMensaje = new JLabel();
        lblMensaje.setAlignmentX(Component.CENTER_ALIGNMENT);
        lblMensaje.setFont(new Font("Arial", Font.ITALIC, 17));
        lblMensaje.setForeground(Color.MAGENTA);


        add(lblTitulo);
        add(btnObtenerMensaje);
        add(lblMensaje);


        btnObtenerMensaje.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        btnObtenerMensaje.setEnabled(false);
        Random random = new Random();
        int indiceAleatorio = random.nextInt(mensajes.length);

        lblMensaje.setText(mensajes[indiceAleatorio]);
    }
}
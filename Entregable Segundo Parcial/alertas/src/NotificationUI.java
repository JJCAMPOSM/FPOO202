import javax.swing.*;
import java.awt.*;

public class NotificationUI extends JFrame {

    public NotificationUI() {
        setTitle("Gestión de Notificaciones");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Panel lateral
        JPanel sidebar = new JPanel();
        sidebar.setLayout(new GridLayout(4, 1, 10, 10));
        sidebar.setBackground(new Color(30, 30, 30));

        JButton btnBell = new JButton("🔔");
        JButton btnList = new JButton("📋");
        JButton btnSettings = new JButton("⚙");
        JButton btnExit = new JButton("↩");

        sidebar.add(btnBell);
        sidebar.add(btnList);
        sidebar.add(btnSettings);
        sidebar.add(btnExit);

        // Estilo de los botones del menú lateral
        for (Component c : sidebar.getComponents()) {
            if (c instanceof JButton) {
                JButton btn = (JButton) c;
                btn.setFont(new Font("Arial", Font.BOLD, 20));
                btn.setBackground(new Color(50, 50, 50));
                btn.setForeground(Color.WHITE);
                btn.setFocusPainted(false);
            }
        }

        // Panel principal de notificaciones
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(20, 20, 20));

        JLabel title = new JLabel("Gestión de Notificaciones", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 18));
        title.setForeground(Color.WHITE);

        JButton btnAddNotification = new JButton("+ Generar notificación");
        btnAddNotification.setBackground(new Color(0, 120, 255));
        btnAddNotification.setForeground(Color.WHITE);
        btnAddNotification.setFocusPainted(false);

        // Lista de notificaciones
        JPanel notificationsPanel = new JPanel();
        notificationsPanel.setLayout(new GridLayout(3, 1, 10, 10));
        notificationsPanel.setBackground(new Color(20, 20, 20));

        notificationsPanel.add(createNotification("Mouse inalámbrico está agotado", "3 Febrero 2025 - 6:00 PM", "❗", Color.RED));
        notificationsPanel.add(createNotification("Orden #7676 - Listo para recolección", "2 Febrero 2025 - 11:00 AM", "✔", Color.GREEN));
        notificationsPanel.add(createNotification("Solicitud #7878 - Pendiente", "3 Febrero 2025 - 12:00 PM", "⚠", Color.YELLOW));

        // Añadir elementos al panel principal
        mainPanel.add(title, BorderLayout.NORTH);
        mainPanel.add(btnAddNotification, BorderLayout.SOUTH);
        mainPanel.add(notificationsPanel, BorderLayout.CENTER);

        // Agregar los paneles al frame
        add(sidebar, BorderLayout.WEST);
        add(mainPanel, BorderLayout.CENTER);
    }

    private JPanel createNotification(String text, String date, String icon, Color iconColor) {
        JPanel notification = new JPanel();
        notification.setLayout(new BorderLayout());
        notification.setBackground(new Color(40, 40, 40));
        notification.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel lblText = new JLabel(text);
        lblText.setForeground(Color.WHITE);
        lblText.setFont(new Font("Arial", Font.BOLD, 14));

        JLabel lblDate = new JLabel(date);
        lblDate.setForeground(Color.LIGHT_GRAY);
        lblDate.setFont(new Font("Arial", Font.PLAIN, 12));

        JLabel lblIcon = new JLabel(icon);
        lblIcon.setFont(new Font("Arial", Font.BOLD, 20));
        lblIcon.setForeground(iconColor);

        JPanel textPanel = new JPanel(new BorderLayout());
        textPanel.setBackground(new Color(40, 40, 40));
        textPanel.add(lblText, BorderLayout.NORTH);
        textPanel.add(lblDate, BorderLayout.SOUTH);

        notification.add(textPanel, BorderLayout.CENTER);
        notification.add(lblIcon, BorderLayout.EAST);

        return notification;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new NotificationUI().setVisible(true);
   });
}
}
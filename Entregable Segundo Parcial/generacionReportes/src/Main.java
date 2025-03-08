import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Main extends JFrame {
    public Main() {
        setTitle("Filtros y Reportes");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout(10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JPanel topPanel = new JPanel();
        topPanel.setLayout(new GridLayout(1, 4, 10, 10)); // 1 fila, 4 columnas
        topPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JPanel blueBox1 = createBlueBox("Inventario Actual");
        JPanel blueBox2 = createBlueBox("Movimiento Inventario");
        JPanel blueBox3 = createBlueBox("Solicitudes");
        JPanel blueBox4 = createBlueBox("Articulos con stock critico");

        topPanel.add(blueBox1);
        topPanel.add(blueBox2);
        topPanel.add(blueBox3);
        topPanel.add(blueBox4);

        JPanel filterPanel = new JPanel();
        filterPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));

        JPanel fechaFilterPanel = new JPanel(new BorderLayout());
        fechaFilterPanel.setBorder(BorderFactory.createTitledBorder("Filtro por Fecha"));
        fechaFilterPanel.setPreferredSize(new Dimension(500, 100));
        JComboBox<String> fechaComboBox = new JComboBox<>(new String[]{"iPhone Select", "iPhone Select"});
        fechaFilterPanel.add(fechaComboBox, BorderLayout.CENTER);

        JPanel usuarioFilterPanel = new JPanel(new BorderLayout());
        usuarioFilterPanel.setBorder(BorderFactory.createTitledBorder("Filtro por Usuario"));
        usuarioFilterPanel.setPreferredSize(new Dimension(500, 100)); // Tamaño más pequeño
        JComboBox<String> usuarioComboBox = new JComboBox<>(new String[]{"iPhone Select"});
        usuarioFilterPanel.add(usuarioComboBox, BorderLayout.CENTER);

        filterPanel.add(fechaFilterPanel);
        filterPanel.add(usuarioFilterPanel);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        JButton generarReporteButton = new JButton("Generar Reporte");
        buttonPanel.add(generarReporteButton);


        JPanel reportPanel = new JPanel(new BorderLayout());
        reportPanel.setBorder(BorderFactory.createTitledBorder("Reportes Históricos"));

        String[] columnNames = {"ID", "Tipo", "Fecha"};
        Object[][] data = {
                {"IP001", "Inventario Actual", "03/02/25"},
                {"IP002", "Movimiento Inventario", "02/02/25"},
                {"IP003", "Movimiento Inventario", "01/02/25"},
                {"IP004", "Solicitud", "03/10/25"},
                {"IP005", "Artístico Stock ortato", "09/01/25"}
        };

        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);

        reportPanel.add(scrollPane, BorderLayout.CENTER);

        mainPanel.add(topPanel, BorderLayout.NORTH);
        mainPanel.add(filterPanel, BorderLayout.CENTER);
        mainPanel.add(reportPanel, BorderLayout.SOUTH);

        add(mainPanel);
    }

    private JPanel createBlueBox(String text) {
        JPanel panel = new JPanel();
        panel.setBackground(new Color(0, 102, 204));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel.setLayout(new BorderLayout());

        JLabel label = new JLabel(text, SwingConstants.CENTER);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Arial", Font.BOLD, 14));

        panel.add(label, BorderLayout.CENTER);
        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Main frame = new Main();
            frame.setVisible(true);
   });
}
}
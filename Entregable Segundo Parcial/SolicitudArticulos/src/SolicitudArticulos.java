import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class SolicitudArticulos {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SolicitudArticulos().createAndShowGUI());
    }

    private void createAndShowGUI() {
        JFrame frame = new JFrame("Solicitud de Artículos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 500);
        frame.setLayout(new BorderLayout());

        JPanel sidebar = new JPanel();
        sidebar.setBackground(new Color(33, 72, 190));
        sidebar.setLayout(new GridLayout(5, 1, 10, 10));
        sidebar.setPreferredSize(new Dimension(100, frame.getHeight()));

        String[] sidebarOptions = {"Inicio", "Ventas", "Inventario", "Usuarios", "Reportes"};
        for (String option : sidebarOptions) {
            JButton button = new JButton(option);
            button.setForeground(Color.WHITE);
            button.setBackground(new Color(33, 72, 190));
            button.setBorderPainted(false);
            sidebar.add(button);
        }

        JPanel mainPanel = new JPanel(new BorderLayout());

        JLabel titleLabel = new JLabel("Solicitud de Artículos");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);

        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JTextField searchField = new JTextField(20);
        JButton searchButton = new JButton("🔍");
        JComboBox<String> filterBox = new JComboBox<>(new String[]{"Todos", "Pendiente", "Completado"});

        JButton addButton = new JButton("+ Nueva Solicitud");
        addButton.setBackground(new Color(33, 72, 190));
        addButton.setForeground(Color.WHITE);

        topPanel.add(new JLabel("Buscar:"));
        topPanel.add(searchField);
        topPanel.add(searchButton);
        topPanel.add(filterBox);
        topPanel.add(addButton);

        String[] columnNames = {"", "Orden ID", "Producto", "Cantidad", "Departamento", "Fecha", "Estatus"};
        Object[][] data = {
                {false, "#7676", "Resma de Papel A4", 2, "Almacén", "01/02/2025", "Completado"},
                {false, "#7676", "Carpeta Oficio", 10, "Compras", "01/02/2025", "Pendiente"},
                {false, "#7676", "Bolígrafo Azul BIC", 67, "Producción", "01/02/2025", "Completado"},
                {false, "#7675", "Mouse Inalámbrico HP", 2, "Logística", "01/02/2025", "Completado"},
                {false, "#7676", "Teclado Mecánico RGB", 5, "Recursos Humanos", "01/02/2025", "Completado"}
        };

        DefaultTableModel tableModel = new DefaultTableModel(data, columnNames) {
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return columnIndex == 0 ? Boolean.class : Object.class;
            }
        };

        JTable table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);

        table.getColumnModel().getColumn(6).setCellRenderer(new StatusCellRenderer());

        mainPanel.add(titleLabel, BorderLayout.NORTH);
        mainPanel.add(topPanel, BorderLayout.CENTER);
        mainPanel.add(scrollPane, BorderLayout.SOUTH);

        frame.add(sidebar, BorderLayout.WEST);
        frame.add(mainPanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    static class StatusCellRenderer extends DefaultTableCellRenderer {
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            JLabel label = new JLabel(value.toString());
            label.setOpaque(true);
            label.setHorizontalAlignment(SwingConstants.CENTER);
            if ("Pendiente".equals(value)) {
                label.setBackground(new Color(173, 255, 47)); // Verde claro
                label.setForeground(Color.BLACK);
            } else {
                label.setBackground(new Color(0, 150, 0)); // Verde oscuro
                label.setForeground(Color.WHITE);
            }
            return label;
        }
    }
}

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class InventoryApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new InventoryApp().createAndShowGUI());
    }

    private void createAndShowGUI() {
        JFrame frame = new JFrame("Administración de Artículos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 500);
        frame.setLayout(new BorderLayout());

        // Barra lateral
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

        JLabel titleLabel = new JLabel("Administración de Artículos");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);

        String[] columnNames = {"", "Nombre", "Descripción", "Cantidad", "Precio"};
        Object[][] data = {
                {false, "Resma de Papel A4", "Paquete de 500 hojas tamaño A4", 50, "$80"},
                {false, "Bolígrafo Azul BIC", "Bolígrafo tinta azul de 1mm", 200, "$5"},
                {false, "Carpeta Oficio", "Carpeta plástica tamaño oficio", 76, "$18"},
                {false, "Mouse Inalámbrico HP", "Mouse óptico con conexión USB", 30, "$150"},
                {false, "Teclado Mecánico RGB", "Teclado con retroiluminación", 20, "$500"}
        };

        DefaultTableModel tableModel = new DefaultTableModel(data, columnNames) {
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return columnIndex == 0 ? Boolean.class : Object.class;
            }
        };

        JTable table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);

        JPanel buttonPanel = new JPanel();
        JButton deleteButton = new JButton("Eliminar Artículo");
        JButton modifyButton = new JButton("Modificar Artículo");
        JButton addButton = new JButton("+ Nuevo Artículo");

        addButton.setBackground(new Color(33, 72, 190));
        addButton.setForeground(Color.WHITE);

        buttonPanel.add(deleteButton);
        buttonPanel.add(modifyButton);
        buttonPanel.add(addButton);

        mainPanel.add(titleLabel, BorderLayout.NORTH);
        mainPanel.add(scrollPane, BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);


        frame.add(sidebar, BorderLayout.WEST);
        frame.add(mainPanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}

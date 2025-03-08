import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.*;

public class GestionUsuarios {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(GestionUsuarios::createAndShowGUI);
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("User Management");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(950, 550);
        frame.setLayout(new BorderLayout());
        frame.setLocationRelativeTo(null);

        // Top Panel with Filters and Buttons
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        topPanel.setBackground(new Color(50, 50, 50)); // Dark background

        JTextField searchField = new JTextField(15);
        JComboBox<String> permissionsBox = new JComboBox<>(new String[]{"All", "Admin", "User"});
        JComboBox<String> joinedBox = new JComboBox<>(new String[]{"Anytime", "Last Year", "Last Month"});
        JButton exportButton = new JButton("Exportar");
        JButton addUserButton = new JButton("Nuevo Usuario");

        searchField.setBackground(new Color(230, 230, 230));
        permissionsBox.setBackground(new Color(230, 230, 230));
        joinedBox.setBackground(new Color(230, 230, 230));
        exportButton.setBackground(new Color(255, 140, 0));
        addUserButton.setBackground(new Color(255, 140, 0));
        exportButton.setForeground(Color.WHITE);
        addUserButton.setForeground(Color.WHITE);

        topPanel.add(new JLabel("Buscar:"));
        topPanel.add(searchField);
        topPanel.add(new JLabel("Permisos:"));
        topPanel.add(permissionsBox);
        topPanel.add(new JLabel("Se unió:"));
        topPanel.add(joinedBox);
        topPanel.add(exportButton);
        topPanel.add(addUserButton);

        // Table with Data
        String[] columnNames = {"Nombre Completo", "E-Mail", "Localización", "Se unió en", "Departamento"};
        Object[][] data = {
                {"Leslie Maya", "leslie@gmail.com", "Los Angeles, CA", "October 2, 2010", "Almacén"},
                {"Josie Deck", "josie@gmail.com", "Cheyenne, WY", "October 3, 2011", "Almacén"},
                {"Alex Pfeiffer", "alex@gmail.com", "Cheyenne, WY", "May 20, 2015", "Almacén"},
                {"Mike Dean", "mike@gmail.com", "Syracuse, NY", "July 14, 2015", "Compras"},
                {"Mateus Cunha", "cunha@gmail.com", "Luanda, AN", "October, 2016", "Producción"},
                {"Nzola Uemo", "nzola@gmail.com", "Lagos, NG", "June 5, 2016", "Producción"},
                {"Antony Mack", "mack@gmail.com", "London, ENG", "June 15, 2015", "Logística"},
                {"Andre da Silva", "andre@gmail.com", "São Paulo, BR", "March 13, 2018", "Recursos Humanos"},
                {"Jorge Ferreira", "jorge@gmail.com", "Huambo, Angola", "March 14, 2018", "Recursos Humanos"}
        };

        DefaultTableModel tableModel = new DefaultTableModel(data, columnNames);
        JTable table = new JTable(tableModel);
        table.setBackground(new Color(30, 30, 150)); // Dark blue background
        table.setForeground(Color.WHITE); // White text
        table.setSelectionBackground(new Color(255, 140, 0));
        table.setSelectionForeground(Color.BLACK);
        table.setRowHeight(25);

        // Styling table header
        JTableHeader header = table.getTableHeader();
        header.setBackground(new Color(50, 50, 50));
        header.setForeground(Color.WHITE);
        header.setFont(new Font("Arial", Font.BOLD, 14));

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Set general background color
        frame.getContentPane().setBackground(new Color(30, 30, 30));

        // Add components to frame
        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);

        frame.setVisible(true);
}
}
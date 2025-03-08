import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Main extends JFrame {
    public Main() {
        setTitle("Merks and Spen");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.WHITE);
                int circleDiameter = 20;
                int totalWidth = 2 * circleDiameter + 10;
                int startX = (getWidth() - totalWidth) / 2;
                int y = 100;
                g.drawOval(startX, y, circleDiameter, circleDiameter);
                g.drawOval(startX + circleDiameter + 10, y, circleDiameter, circleDiameter);
            }
        };
        panel.setLayout(new GridBagLayout());
        panel.setBackground(new Color(38, 77, 200));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        JLabel marksLabel = new JLabel("Merks and Spen");
        marksLabel.setFont(new Font("SansSerif", Font.BOLD, 30));
        marksLabel.setForeground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        panel.add(marksLabel, gbc);

        JTextField departamentoField = new JTextField("Departamento", 20);
        departamentoField.setPreferredSize(new Dimension(300, 40));
        departamentoField.setFont(new Font("SansSerif", Font.PLAIN, 16));
        departamentoField.setForeground(Color.GRAY);
        departamentoField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (departamentoField.getText().equals("Departamento")) {
                    departamentoField.setText("");
                    departamentoField.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (departamentoField.getText().isEmpty()) {
                    departamentoField.setForeground(Color.GRAY);
                    departamentoField.setText("Departamento");
                }
            }
        });
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        panel.add(departamentoField, gbc);

        JPasswordField passwordField = new JPasswordField("Contraseña", 20);
        passwordField.setPreferredSize(new Dimension(300, 40));
        passwordField.setFont(new Font("SansSerif", Font.PLAIN, 16));
        passwordField.setForeground(Color.GRAY);
        passwordField.setEchoChar((char) 0);
        passwordField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (String.valueOf(passwordField.getPassword()).equals("Contraseña")) {
                    passwordField.setText("");
                    passwordField.setForeground(Color.BLACK);
                    passwordField.setEchoChar('*');
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (String.valueOf(passwordField.getPassword()).isEmpty()) {
                    passwordField.setForeground(Color.GRAY);
                    passwordField.setEchoChar((char) 0);
                    passwordField.setText("Contraseña");
                }
            }
        });
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        panel.add(passwordField, gbc);

        JButton loginButton = new JButton("LOGIN");
        loginButton.setBackground(Color.WHITE);
        loginButton.setForeground(new Color(38, 77, 200));
        loginButton.setPreferredSize(new Dimension(300, 40));
        loginButton.setFont(new Font("SansSerif", Font.BOLD, 16));
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        panel.add(loginButton, gbc);

        JButton registerButton = new JButton("REGISTER");
        registerButton.setBackground(Color.WHITE);
        registerButton.setForeground(new Color(38, 77, 200));
        registerButton.setPreferredSize(new Dimension(300, 40));
        registerButton.setFont(new Font("SansSerif", Font.BOLD, 16));
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        panel.add(registerButton, gbc);

        JLabel questionLabel = new JLabel("Olvidaste tu Contraseña?");
        questionLabel.setForeground(Color.WHITE);
        questionLabel.setFont(new Font("SansSerif", Font.PLAIN, 14));
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 2;
        panel.add(questionLabel, gbc);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}
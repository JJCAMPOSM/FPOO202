import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Generador de Contraseñas Automáticas");

        Generador generador = new Generador();
        String contraseña = generador.generarContraseña();
        String fortaleza = generador.evaluarFortaleza(contraseña);

        JOptionPane.showMessageDialog(null, "Contraseña generada: " + contraseña + "\nFortaleza: " + fortaleza);
    }
}

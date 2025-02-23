import javax.swing.*;
import java.util.Random;

public class Generador {
    private int longitud;
    private boolean incluirMayus;
    private boolean incluirEspeciales;

    public Generador() {
        this.longitud = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la longitud de la contraseña (mínimo 8):"));
        if (this.longitud < 8) this.longitud = 8;

        int opcionMayus = JOptionPane.showConfirmDialog(null, "¿Desea incluir mayúsculas?", "Configuración", JOptionPane.YES_NO_OPTION);
        this.incluirMayus = (opcionMayus == JOptionPane.YES_OPTION);

        int opcionEspeciales = JOptionPane.showConfirmDialog(null, "¿Desea incluir caracteres especiales?", "Configuración", JOptionPane.YES_NO_OPTION);
        this.incluirEspeciales = (opcionEspeciales == JOptionPane.YES_OPTION);
    }

    public String generarContraseña() {
        Random rnd = new Random();
        StringBuilder password = new StringBuilder();
        String minúsculas = "abcdefghijklmnopqrstuvwxyz";
        String mayúsculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String números = "0123456789";
        String especiales = "!@#$%^&*()-_=+<>?";

        String caracteresPermitidos = minúsculas + números;
        if (incluirMayus) caracteresPermitidos += mayúsculas;
        if (incluirEspeciales) caracteresPermitidos += especiales;

        for (int i = 0; i < longitud; i++) {
            char caracter = caracteresPermitidos.charAt(rnd.nextInt(caracteresPermitidos.length()));
            password.append(caracter);
        }
        return password.toString();
    }

    public String evaluarFortaleza(String contraseña) {
        boolean tieneMayus = false, tieneNumeros = false, tieneEspeciales = false;

        for (char c : contraseña.toCharArray()) {
            if (Character.isUpperCase(c)) tieneMayus = true;
            if (Character.isDigit(c)) tieneNumeros = true;
            if ("!@#$%^&*()-_=+<>?".contains(String.valueOf(c))) tieneEspeciales = true;
        }

        if (contraseña.length() < 10 || (!tieneMayus && !tieneNumeros && !tieneEspeciales)) {
            return "🔴 Débil";
        } else if (tieneNumeros && (tieneMayus || tieneEspeciales)) {
            return "🟡 Media";
        } else if (tieneMayus && tieneNumeros && tieneEspeciales) {
            return "🟢 Fuerte";
        } else {
            return "🟡 Media";
        }
    }
}

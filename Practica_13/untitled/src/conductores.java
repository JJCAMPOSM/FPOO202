import javax.swing.*;

public class conductores {
    private static String nombre;
    private static String identificacion;
    private static String licencia;

    public conductores(String nombre, String identificacion, String licencia) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.licencia = licencia;
    }

    public static String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public static String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public void registrarConductor(String nombre, String identificacion, String licencia) {
        this.nombre = JOptionPane.showInputDialog("Ingrese el nombre del conductor:");
        this.identificacion = JOptionPane.showInputDialog("Ingrese la identificacion del conductor:");
        this.licencia = JOptionPane.showInputDialog("Ingrese la licencia del conductor:");

    }
}

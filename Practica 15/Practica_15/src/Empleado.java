import javax.swing.*;

public class Empleado {
    private String nombre;
    private int id;
    private double salario;

    public Empleado(String nombre, int id, double salario) {
        this.nombre = nombre;
        this.id = id;
        this.salario = salario;
    }

    void mostrarInformacion() {
        JOptionPane.showMessageDialog(null, "Nombre: " + this.nombre + "\nID: " + this.id + "\nSalario: " + this.salario);
    }

    void registrarEmpleado() {
        this.nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado");
        this.id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del empleado"));
        this.salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario del empleado"));
    }
}

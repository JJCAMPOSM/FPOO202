import javax.swing.*;

public class Administrativo extends Empleado{
    private String departamento;

    public Administrativo(String nombre, int id, double salario, String departamento) {
        super(nombre, id, salario);
        this.departamento = departamento;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        JOptionPane.showMessageDialog(null, "Departamento: " + this.departamento);
    }
    public void registrarAdministrativo() {
        super.registrarEmpleado();
        this.departamento = JOptionPane.showInputDialog("Ingrese el departamento del administrativo:");
    }}

import javax.swing.*;

public class Conductor extends Empleado {
    private String licencia;

    public Conductor(String nombre, int id, double salario, String licencia) {
        super(nombre, id, salario);
        this.licencia = licencia;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        JOptionPane.showMessageDialog(null, "Licencia: " + this.licencia);
    }


    public void registrarConductor() {
        super.registrarEmpleado();
        this.licencia = JOptionPane.showInputDialog("Ingrese la licencia del conductor: ");

    }
}

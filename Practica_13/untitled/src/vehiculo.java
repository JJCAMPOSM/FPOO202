import javax.swing.JOptionPane;

public class vehiculo {
    private String placa;
    private String modelo;
    private double capacidadCarga;
    private String conductorAsignado;

    public vehiculo(String placa, String modelo, double capacidadCarga) {
        this.placa = placa;
        this.modelo = modelo;
        this.capacidadCarga = capacidadCarga;
        this.conductorAsignado = null;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public void registrarVehiculo (String placa, String modelo, double capacidad) {
        this.placa = JOptionPane.showInputDialog("Ingrese la placa del vehículo:");
        this.modelo = JOptionPane.showInputDialog("Ingrese el modelo del vehículo:");
        this.capacidadCarga = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la capacidad de carga (kg):"));
    }

    public void asignarConductor(String identificacion, String placa) {
        this.conductorAsignado = identificacion;
        JOptionPane.showMessageDialog(null, "Conductor con identificación " + identificacion + " asignado al vehículo con placa " + this.placa);
    }

    public String getConductorAsignado() {
        return conductorAsignado;
    }
}

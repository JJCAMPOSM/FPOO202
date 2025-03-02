import javax.swing.*;

public class entregas {
    private int numeroGuia;
    private String estado;

    public entregas(int numeroGuia, String estado) {
        this.numeroGuia = numeroGuia;
        this.estado = "pendiente";
    }
    public int getNumeroGuia() {
        return numeroGuia;
    }
    public void setNumeroGuia(int numeroGuia) {
        this.numeroGuia = numeroGuia;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }


    public void crearEntrega(String numeroGuia, String estado) {
        this.numeroGuia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo de envio:"));
        this.estado = JOptionPane.showInputDialog("Ingrese el destino:");
    }
    }



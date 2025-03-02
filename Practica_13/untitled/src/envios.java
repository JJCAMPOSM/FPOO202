import javax.swing.*;

public class envios {
    private String codigoEnvio;
    private String destino;
    private int peso;

    public envios(String codigoEnvio, String destino, int peso) {
        this.codigoEnvio = codigoEnvio;
        this.destino = destino;
        this.peso = peso;
    }

    public String getCodigoEnvio() {
        return codigoEnvio;
    }

    public String getDestino() {
        return destino;
    }
    public int getPeso() {
        return peso;
    }
    public void setCodigoEnvio(String codigoEnvio) {
        this.codigoEnvio = codigoEnvio;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void crearEnvio1(String codigoEnvio, String destino) {
        this.codigoEnvio = JOptionPane.showInputDialog("Ingrese el codigo de envio:");
        this.destino = JOptionPane.showInputDialog("Ingrese el destino:");
    }
    public void crearEnvio2(String codigoEnvio, String destino, int peso) {
        this.codigoEnvio = JOptionPane.showInputDialog("Ingrese el codigo de envio:");
        this.destino = JOptionPane.showInputDialog("Ingrese el destino:");
        this.peso = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el peso:"));
    }
}

import javax.swing.*;
import java.util.ArrayList;

public class Inventario {
    private ArrayList<Electrodomestico> lista = new ArrayList<>();

    public void registrarElectrodomestico() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del electrodoméstico:");
        String marca = JOptionPane.showInputDialog("Ingrese la marca:");
        String color = JOptionPane.showInputDialog("Ingrese el color:");
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso en kg:"));
        double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio:"));

        Electrodomestico nuevo = new Electrodomestico(nombre, marca, color, peso, precio);
        lista.add(nuevo);
        JOptionPane.showMessageDialog(null, "Electrodoméstico registrado con éxito.");
    }

    public void consultarElectrodomesticos() {
        if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay electrodomésticos registrados.");
        } else {
            StringBuilder sb = new StringBuilder("Lista de Electrodomésticos:\n");
            for (int i = 0; i < lista.size(); i++) {
                sb.append(i).append(". ").append(lista.get(i).nombre).append(" - ").append(lista.get(i).marca).append("\n");
            }
            JOptionPane.showMessageDialog(null, sb.toString());
        }
    }

    public void apartarElectrodomestico() {
        consultarElectrodomesticos();
        int index = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número del electrodoméstico a apartar:"));
        if (index >= 0 && index < lista.size()) {
            if (!lista.get(index).apartado) {
                lista.get(index).apartado = true;
                JOptionPane.showMessageDialog(null, "Electrodoméstico apartado con éxito.");
            } else {
                JOptionPane.showMessageDialog(null, "Este electrodoméstico ya está apartado.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Número no válido.");
        }
    }

    public void venderElectrodomestico() {
        consultarElectrodomesticos();
        int index = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número del electrodoméstico a vender:"));
        if (index >= 0 && index < lista.size()) {
            lista.remove(index);
            JOptionPane.showMessageDialog(null, "Electrodoméstico vendido con éxito.");
        } else {
            JOptionPane.showMessageDialog(null, "Número no válido.");
        }
    }
}

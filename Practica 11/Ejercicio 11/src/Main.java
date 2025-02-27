import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        int opcion;

        do {
            String menu = "1. Registrar Electrodoméstico\n2. Consultar Electrodomésticos\n3. Apartar Electrodoméstico\n4. Vender Electrodoméstico\n5. Salir";
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcion) {
                case 1:
                    inventario.registrarElectrodomestico();
                    break;
                case 2:
                    inventario.consultarElectrodomesticos();
                    break;
                case 3:
                    inventario.apartarElectrodomestico();
                    break;
                case 4:
                    inventario.venderElectrodomestico();
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        } while (opcion != 5);
    }
}

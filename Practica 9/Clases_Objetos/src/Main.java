import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {


        JOptionPane.showMessageDialog(null, "Bienvenido a Portal en línea BBVA");

        int noCuenta = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número de cuenta:"));
        String titular = JOptionPane.showInputDialog(null, "Ingrese el nombre del titular:");
        int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad del titular:"));
        double saldo = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el saldo inicial:"));

        Cuentas usuario_1 = new Cuentas(noCuenta, titular, edad, saldo);
        JOptionPane.showMessageDialog(null, "1)Detalles cuenta 2)Transferencia 3)Retiro 4)Deposito");
        int seleccion = Integer.parseInt(JOptionPane.showInputDialog(null, "Selccione una opcion:"));


        switch (seleccion) {
            case 1:
                usuario_1.mostrarCuentas();
                break;
            case 2:
                usuario_1.transferencia();
                break;
            case 3:
                usuario_1.retiro();
                break;
            case 4:
                usuario_1.deposito();
                break;
            default:
        }
    }
}

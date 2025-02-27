import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bienvenido a Portal en línea BBVA");

        int noCuenta = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número de cuenta:"));
        String titular = JOptionPane.showInputDialog(null, "Ingrese el nombre del titular:");
        int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad del titular:"));
        double saldo = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el saldo inicial:"));

        Cuentas usuario_1 = new Cuentas(noCuenta, titular, edad, saldo);

        JOptionPane.showMessageDialog(null, "1)Detalles cuentas 2)Modificar datos 3)Consultar saldo 4)Actualizar saldo");
        int seleccion = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccione una opción:"));

        switch (seleccion) {
            case 1:
                usuario_1.mostrarCuentas();
                break;
            case 2:
                usuario_1.setTitular(JOptionPane.showInputDialog(null, "Ingrese el nuevo nombre del titular:"));
                usuario_1.setEdad(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la nueva edad:")));
                JOptionPane.showMessageDialog(null, "Datos actualizados.");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Saldo actual: " + usuario_1.getSaldo());
                break;
            case 4:
                double nuevoSaldo = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el nuevo saldo:"));
                usuario_1.setSaldo(nuevoSaldo);
                JOptionPane.showMessageDialog(null, "Saldo actualizado a: " + usuario_1.getSaldo());
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción inválida.");
        }
    }
}

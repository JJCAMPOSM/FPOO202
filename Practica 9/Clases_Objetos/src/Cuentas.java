import javax.swing.*;

public class Cuentas {
    public int noCuenta;
    public int edad, noCuentaex;
    public double saldo, monto, montoRetiro, montoDeposito;
    public String titular;


    public Cuentas(int noCuenta, String titular, int edad, double saldo) {
        this.noCuenta = noCuenta;
        this.titular = titular;
        this.edad = edad;
        this.saldo = saldo;
    }

    public void mostrarCuentas() {
        System.out.println("Tu número de cuenta es: " + noCuenta);
        System.out.println("El titular es: " + titular);
        System.out.println("La edad del titular es: " + edad);
        System.out.println("El saldo del titular es: " + saldo);
    }

    public void transferencia() {
        this.noCuentaex = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número de cuenta externa:"));
        this.monto = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el monto a mandar:"));

        System.out.println("Detalles sobre depósito a cuenta externa: ");
        System.out.println("Cuenta Externa: " + this.noCuentaex);
        System.out.println("Con un monto de: " + this.monto);
    }

    public void retiro() {
        this.montoRetiro = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el monto a retirar:"));

        if (this.montoRetiro > this.saldo) {
            System.out.println("Error: Fondos insuficientes.");
        } else {
            this.saldo -= this.montoRetiro;
            System.out.println("Retiro exitoso. Su nuevo balance es de: " + this.saldo);
        }
    }
    public void deposito () {
        this.montoDeposito = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el monto a depositar: "));
        this.saldo += this.montoDeposito;
        System.out.println("Su nuevo saldo es de: " + this.saldo);
}
}

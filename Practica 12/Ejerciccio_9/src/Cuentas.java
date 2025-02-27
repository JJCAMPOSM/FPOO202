public class Cuentas {
    private int noCuenta;
    private int edad;
    private double saldo;
    private String titular;

    public Cuentas(int noCuenta, String titular, int edad, double saldo) {
        this.noCuenta = noCuenta;
        this.titular = titular;
        this.edad = edad;
        this.saldo = saldo;
    }

    public int getNoCuenta() {
        return noCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public int getEdad() {
        return edad;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNoCuenta(int noCuenta) {
        this.noCuenta = noCuenta;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        } else {
            System.out.println("La edad no puede ser negativa.");
        }
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Error: No puede asignar un saldo negativo.");
        }
    }

    public void mostrarCuentas() {
        System.out.println("Número de cuenta: " + getNoCuenta());
        System.out.println("Titular: " + getTitular());
        System.out.println("Edad: " + getEdad());
        System.out.println("Saldo: " + getSaldo());
    }
}

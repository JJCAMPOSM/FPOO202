public class Electrodomestico {
    String nombre;
    String marca;
    String color;
    double peso;
    double precio;
    boolean apartado;

    public Electrodomestico(String nombre, String marca, String color, double peso, double precio) {
        this.nombre = nombre;
        this.marca = marca;
        this.color = color;
        this.peso = peso;
        this.precio = precio;
        this.apartado = false;
    }

    public String mostrarInfo() {
        return "Nombre: " + nombre + "\nMarca: " + marca + "\nColor: " + color +
                "\nPeso: " + peso + " kg\nPrecio: $" + precio + "\nApartado: " + (apartado ? "Sí" : "No");
    }
}

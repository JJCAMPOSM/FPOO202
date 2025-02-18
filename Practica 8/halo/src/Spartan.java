public class Spartan {

    public String nombre;
    int escudo, salud;
    String arma_principal;

    public void mostrarInfo() {
        System.out.println("--------------------- Informacion del Spartan --------------------");
        System.out.println("Spartan: " + nombre);
        System.out.println("% de Escudo: " + escudo);
        System.out.println("% de Salud: " + salud);
        System.out.println("Arma disponible: " + arma_principal);

    } //llave mostrar info

    public void atacar(String enemigo) {
        System.out.println(nombre + " ataca a " +  enemigo + " con " + arma_principal);

    }//llave atacar

    public void recargarArma(int municiones) {
        int restantes = 10;
        int total = restantes + municiones;
        System.out.println(arma_principal + " ahora tiene disponible " +  total + " balas");
    }

    public void correr(boolean status) {
        if (status) {
            System.out.println(nombre + " esta corriendo");
        }else{
            System.out.println(nombre + " se detuvo");
        }
    }
} //llave de la clase

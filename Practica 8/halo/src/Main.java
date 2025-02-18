public class Main {
    public static void main(String[] args) {

        //Creacion de un objeto
        Spartan masterChief = new Spartan();

        // usar atibutos de la clase
        masterChief.nombre= "John";
        masterChief.salud= 100;
        masterChief.escudo= 60;
        masterChief.arma_principal= "Rifle de asalto";

        //invocamos los metodos
        masterChief.mostrarInfo();
        masterChief.atacar("Grunt");
        masterChief.recargarArma(75);
        masterChief.correr(true);

        //creamos el segundo objeto
        Spartan locke = new Spartan();

        // usar atibutos de la clase
        locke.nombre= "locke";
        locke.salud= 55;
        locke.escudo= 30;
        locke.arma_principal= "Sniper";

        //invocamos los metodos
        locke.mostrarInfo();
        locke.atacar("jackal");
        locke.recargarArma(10);
        locke.correr(false);
        }
    }
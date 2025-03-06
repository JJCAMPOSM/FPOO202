public class Main {
    public static void main(String[] args) {
        SpartanII jefeMaestro = new SpartanII("Jonh", 90, "Rifle", 0);
        jefeMaestro.mostrarInfo();
        jefeMaestro.usarManejoAvanzado();
        jefeMaestro.atacar("Covenant");
        jefeMaestro.recibirDano(50);
        jefeMaestro.recargarEscudo();

        SpartanIII spartanIII = new SpartanIII("R2D2", 100, "Pistola", 0);
        spartanIII.mostrarInfo();
        spartanIII.camuflajeActivo();
        spartanIII.atacar("Covenant");
        spartanIII.recibirDano(50);

        SpartanIV spartanIV = new SpartanIV("C-3PO", 100, "Pistola", 0);
        spartanIV.mostrarInfo();
        spartanIV.usarPropulsores();
        spartanIV.atacar("Covenant");
        spartanIV.recibirDano(50);

        Soldado soldado = new Soldado("Soldado", 100, "Pistola");
        soldado.mostrarInfo();
        soldado.atacar("Covenant");
        soldado.recibirDano(50);

    }
}
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
    Empleado empleado = new Empleado("" ,0, 0.0);
    Conductor conductor = new Conductor("", 0, 0.0, "");
    Administrativo administrativo = new Administrativo("" ,0, 0.0, "");

    while (true){
        int opcion = JOptionPane.showOptionDialog(
                null,
                "Seleccione una opcion",
                "Aplicacion de entregas",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                new String[]{
                        "Mostrar empleados",
                        "Registrar empleado",
                        "Mostrar conductores",
                        "Registrar conductor",
                        "Mostrar administrativos",
                        "Registrar administrativo",
                        "Salir"
                },
                null
        );
        switch (opcion) {
            case 0 -> empleado.mostrarInformacion();
            case 1 -> empleado.registrarEmpleado();
            case 2 -> conductor.mostrarInformacion();
            case 3 -> conductor.registrarConductor();
            case 4 -> administrativo.mostrarInformacion();
            case 5 -> administrativo.registrarAdministrativo();
            case 6 -> System.exit(0);
        }
    }
}
    }
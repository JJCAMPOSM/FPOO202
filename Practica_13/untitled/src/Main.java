import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        conductores c = new conductores("", "", "");
        vehiculo v = new vehiculo("", "", 0);
        envios e = new envios("", "", 0);
        entregas en = new entregas(0, "");

        while (true) {
            int opcion = JOptionPane.showOptionDialog(
                    null,
                    "Seleccione una opción",
                    "Aplicación de entregas",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    new String[]{
                            "Registrar vehículo",
                            "Registrar conductor",
                            "Asignar conductor a vehículo",
                            "Registrar envío",
                            "Registrar entrega",
                            "Actualizar entrega",
                            "Mostrar Información",
                            "Salir"
                    },
                    null
            );

            switch (opcion) {
                case 0:
                    v.registrarVehiculo("", "", 0);
                    break;
                case 1:
                    c.registrarConductor("", "", "");
                    break;
                case 2:
                    String identificacionConductor = JOptionPane.showInputDialog("Ingrese la identificación del conductor:");
                    String placaVehiculo = JOptionPane.showInputDialog("Ingrese la placa del vehículo:");
                    v.asignarConductor(identificacionConductor, placaVehiculo);
                    break;
                case 3:
                    int decision = Integer.parseInt(JOptionPane.showInputDialog("1) Crear envío sin peso\n 2) Crear envío con peso"));
                    if (decision == 1){
                        e.crearEnvio1("", "");
                    } else if (decision == 2){
                        e.crearEnvio2("", "", 0);
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Opcion no valida");
                    }
                    break;
                case 4:
                    en.crearEntrega(String.valueOf(0), "");
                    break;
                case 5:
                    String nuevoEstado = JOptionPane.showInputDialog("Ingrese el nuevo estado de la entrega:");
                    en.setEstado(nuevoEstado);
                    JOptionPane.showMessageDialog(null, "Estado actualizado a: " + nuevoEstado);
                    break;
                case 6:
                    StringBuilder informacion = new StringBuilder();

                    informacion.append("Información del conductor:\n")
                            .append("Nombre: ").append(conductores.getNombre()).append("\n")
                            .append("Identificación: ").append(conductores.getIdentificacion()).append("\n")
                            .append("Licencia: ").append(conductores.getLicencia()).append("\n\n");

                    informacion.append("Información del vehículo:\n")
                            .append("Placa: ").append(v.getPlaca()).append("\n")
                            .append("Modelo: ").append(v.getModelo()).append("\n")
                            .append("Capacidad de carga: ").append(v.getCapacidadCarga()).append(" kg\n")
                            .append("Conductor asignado: ").append(v.getConductorAsignado()).append("\n\n");

                    informacion.append("Información del envío:\n")
                            .append("Código de envío: ").append(e.getCodigoEnvio()).append("\n")
                            .append("Destino: ").append(e.getDestino()).append("\n")
                            .append("Peso: ").append(e.getPeso()).append(" kg\n\n");

                    informacion.append("Información de la entrega:\n")
                            .append("Número de guía: ").append(en.getNumeroGuia()).append("\n")
                            .append("Estado: ").append(en.getEstado()).append("\n");

                    JOptionPane.showMessageDialog(null, informacion.toString());
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }
}
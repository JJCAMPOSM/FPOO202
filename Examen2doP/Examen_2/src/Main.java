import javax.swing.*;
public class Main {
    public static void main(String[] args) {

        Alumno alumno1 = new Alumno("", "", "", 0, "", 0);

        alumno1.registrarAlumno("", "", "", 0, "", 0);
        JOptionPane.showMessageDialog(null, alumno1.generarMatricula());
    }
}

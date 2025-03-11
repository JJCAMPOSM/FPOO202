import javax.swing.*;

public class Alumno {
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int anioNacimiento;
    private String carrera;

    Alumno(String nombre, String apellidoPaterno, String apellidoMaterno, int anioNacimiento, String carrera) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.anioNacimiento = anioNacimiento;
        this.carrera = carrera;
    }

    public void registrarAlumno(String nombre, String apellidoPaterno, String apellidoMaterno, int anioNacimiento, String carrera) {
    this.nombre = JOptionPane.showInputDialog("Ingrese el nombre del alumno");
    this.apellidoPaterno = JOptionPane.showInputDialog("Ingrese el apellido paterno del alumno");
    this.apellidoMaterno = JOptionPane.showInputDialog("Ingrese el apellido materno del alumno");
    this.anioNacimiento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de nacimiento del alumno"));
    this.carrera = JOptionPane.showInputDialog("Ingrese la carrera del alumno");
    }
    public String generarMatricula() {
        String matricula = "";
        matricula += nombre.substring(0, 2);
        matricula += apellidoPaterno.substring(0, 2);
        matricula += apellidoMaterno.substring(0, 2);
        matricula += String.valueOf(anioNacimiento).substring(0, 2);
        matricula += carrera.substring(0, 2);
        return matricula;
            }
        }


import javax.swing.*;

public class Alumno {
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int anioNacimiento;
    private String carrera;
    private int anioCurso;

    Alumno(String nombre, String apellidoPaterno, String apellidoMaterno, int anioNacimiento, String carrera, int anioCurso) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.anioNacimiento = anioNacimiento;
        this.carrera = carrera;
        this.anioCurso = anioCurso;
    }

    public void registrarAlumno(String nombre, String apellidoPaterno, String apellidoMaterno, int anioNacimiento, String carrera, int anioCurso) {
        this.nombre = JOptionPane.showInputDialog("Ingrese el nombre del alumno");
        this.apellidoPaterno = JOptionPane.showInputDialog("Ingrese el apellido paterno del alumno");
        this.apellidoMaterno = JOptionPane.showInputDialog("Ingrese el apellido materno del alumno");
        this.anioNacimiento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de nacimiento del alumno"));
        this.carrera = JOptionPane.showInputDialog("Ingrese la carrera del alumno");
        this.anioCurso = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año en curso: "));
    }
    public String generarMatricula() {
        String matricula = "";
        String numeros= "0123456789";
        matricula += String.valueOf(anioCurso).substring(2, 4);
        matricula += String.valueOf(anioNacimiento).substring(2, 4);
        matricula += nombre.substring(0, 1);
        matricula += apellidoPaterno.substring(0, 1);
        matricula += apellidoMaterno.substring(0, 1);
        matricula += numeros.charAt((int) (Math.random() * 10));
        matricula += numeros.charAt((int) (Math.random() * 10));
        matricula += numeros.charAt((int) (Math.random() * 10));
        matricula += carrera.substring(0, 3);
        return matricula;
            }
        }


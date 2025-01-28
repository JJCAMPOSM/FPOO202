package org.example;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Ingrese tu completo: ");
        String name = reader.nextLine();

        System.out.println("Ingrese tus apellidos: ");
        String apellido = reader.nextLine();

        String minisuculas = name.toLowerCase();
        String minisuculasa = apellido.toLowerCase();
        String mayus = name.toUpperCase();
        String mayusa = apellido.toUpperCase();

        String mini = name.substring(0, 1).toUpperCase() ;
        String minii = apellido.substring(0, 1).toUpperCase();

        System.out.println(minisuculas + " " + minisuculasa);
        System.out.println(mayus + " " + mayusa);
        System.out.println(mini + minisuculas.substring(1) + " " + minii + minisuculasa.substring(1));


}}
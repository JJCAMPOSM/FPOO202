/*Programa con funciones y un menu que nos permita convertir temperaturas a decicion del usuario:
 G Centigrados=(fahrenheit-32)x5/9, G Fahrenheit = (centigradosx9/5) + 32, G Kelvin=centigrados =273.25*/

package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("En el menu, seleccione el tipo de conversion:");
        System.out.println("1) Convertir de Fahrenheit a Celsius");
        System.out.println("2) Convertir de Celsius a Farenheit");
        System.out.println("3) Convertir de Celsius a Fahrenheit");
        System.out.println("4) Convertir de Celsius a Kelvin");
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1: {
                System.out.println("Ingrese la Temperatura en Fahrenheit");
                double fahrenheit = sc.nextDouble();
                double celsius = (fahrenheit - 32) * 5 / 9;
                System.out.println(fahrenheit + " Fahrenheit is " + celsius + " Celsius.");
                break;
            }
            case 4:{ }

            case 3: {
                System.out.println("Ingrese la Temperatura en Celsius");
                double celsius = sc.nextDouble();
                double fahrenheit = (celsius * 9 / 5) + 32;
                System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit.");

            }
            case 4: {
                System.out.println("Ingrese la Temperatura en Kelvin");
                double kelvin = sc.nextDouble();
                double celsius = kelvin - 273.15;
                System.out.println(kelvin + " Kelvin is " + celsius + " Celsius.");
            }
            default: {
                System.out.println("Opcion invalida");
            }
        }
    }
}
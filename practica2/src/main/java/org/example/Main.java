package org.example;
//Zona de importacion
import java.util.Scanner;

//Clase principal
public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);

                    /*
// 2.Cadenas
            //Concatenar cadenas
            String cadena= "Jesus" + "Campos";

            //conteo de longitud de cadena
            System.out.println(cadena);
            System.out.println(cadena.length());

            //Extraccion de caracteres en base a parametros
            System.out.println(cadena.substring(2,5));
            System.out.println(cadena.substring(2));
            System.out.println(cadena.substring(0,5));

            //3. Variable
            String cadena2 = "333", cadena3, cadena4;
            int entero = 3, entero2, entero3;
            double decimal = 3.35737, decimal2, decimal3;

            //Convertir cadena a int
            entero2= Integer.parseInt(cadena2);
            System.out.println(entero2);

            //Convertir double a int
            entero3= (int) decimal;
            System.out.println(entero3);

            //Convertir double a cadena
            cadena3= String.valueOf(decimal);
            System.out.println(cadena3);

            //Convertir int a double
            decimal2= Double.valueOf(entero);
            System.out.println(decimal2);

            //Convertir implicita
            int o =12;
            double numd= o;
            System.out.println(numd);
*/
/*            //4. solicitud de informacion

            Scanner scn = new Scanner(System.in);

            //Guardar como cadena de texto
            System.out.println("Escribe una cadena: ");
            String cadena= scn.nextLine();

            //Guardar como entero
            System.out.println("Escribe una entero: ");
            int entero= scn.nextInt();

            //Guardar como decimal
            System.out.println("Escribe un numero decimla : ");
            double decimal= scn.nextDouble();

            System.out.println(cadena);
            System.out.println(entero);
            System.out.println(decimal);
            */

            System.out.println(10>9);
            System.out.println(10==9);
            System.out.println(10<9);
            System.out.println(10>=9);
            System.out.println(10<=9);
            System.out.println(10!=9);

            //Operadores logicos
            int x=3;
            System.out.println(x< 5 && x>10);
            System.out.println(x< 5 || x>10);
            System.out.println(!(x< 5 && x>10));
            System.out.println(!(x< 5 || x>10));




        }
    }
}

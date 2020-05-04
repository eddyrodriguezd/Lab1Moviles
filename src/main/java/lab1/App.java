package lab1;

import java.awt.Menu;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        int num;
        int num2;

        while (!salir) {

            System.out.println("1. Verifica si un número es primo");
            System.out.println("2. Calcula el MCD entre dos números");
            System.out.println("3. Halla la serie de Fibonacci hasta el término seleccionado");
            System.out.println("4. Obtiene el factorial de un número");

            try {
                System.out.println("Escribe una de las opciones");
                opcion = scanner.nextInt();


            } catch (Exception e) {
                e.printStackTrace();
            }

            public class MenuJava extends Menu {

                public MenuJava() {
                }

            }

        }
    }
}
package lab1.opcion1;

import lab1.*;
import java.util.InputMismatchException;
import java.util.Scanner;
import static lab1.opcion1.Matematica.numEsPrimo;
import static lab1.opcion1.Matematica.mcd;
import static lab1.opcion1.Matematica.fibonacci;
import static lab1.opcion1.Matematica.factorial;

public class App1 {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        int opcion;
        int num;
        int num2;
        
        while (true) {
 
            System.out.println("1. Verifica si un número es primo");
            System.out.println("2. Calcula el MCD entre dos números");
            System.out.println("3. Halla la serie de Fibonacci hasta el término seleccionado");
            System.out.println("4. Obtiene el factorial de un número");
 
            try { 
                System.out.println("Escribe una de las opciones");
                opcion = scanner.nextInt();
 
                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese el número: ");
                        num = scanner.nextInt();
                        if(numEsPrimo(num)){
                            System.out.println("El número ingresado es primo");
                        }
                        else{
                            System.out.println("El número ingresado no es primo");
                        }
                        break;
                    case 2:
                        System.out.println("Ingrese el primer número: ");
                        num = scanner.nextInt();
                        System.out.println("Ingrese el segundo número: ");
                        num2 = scanner.nextInt();
                        System.out.println("El MCD de los números ingresados es " + mcd(num, num2));
                        break;
                    case 3:
                        System.out.println("Ingrese el número para la serie fibonacci: ");
                        num = scanner.nextInt();
                        System.out.println("La serie Fibonacci para el número es ");
                        fibonacci(num);
                        break;
                    case 4:
                        System.out.println("Ingrese el número: ");
                        num = scanner.nextInt();
                        System.out.println("El factorial de los números ingresados es " + factorial(num));
                        break;
                    default:
                        System.out.println("Solo se cuenta con opciones del 1 al 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Solo se permite el ingreso de números");
                scanner.next();
            }
        }
 
    }
        
}

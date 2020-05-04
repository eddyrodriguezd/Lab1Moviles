package lab1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App implements Menu {
    public static void main(String[] args) {
        App app = new App();
        
        app.mostrarMenu();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        try { 
                System.out.println("Escriba una de las opciones");
                opcion = scanner.nextInt();
 
                app.realizarAccion(opcion);
                
        } catch (InputMismatchException e) {
            System.out.println("Solo se permite el ingreso de números");
            scanner.next();
        }
        
    }
    
    @Override
    public void mostrarMenu() {         
        
        System.out.println("1. Calcular propiedades de números");
        System.out.println("2. Trabajar con personas.json");
 
    }

    @Override
    public void realizarAccion(int numAccion) {
        switch (numAccion) {
            case 1:
                break;
            case 2:
                break;
            default:
                System.out.println("Solo se cuenta con opciones del 1 al 2");
        }
    }


}
package lab1.opcion2;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
import lab1.Menu;

public class App2 implements Menu {
    public static void main(String[] args) {
        App2 app2=new App2();
        
        app2.mostrarMenu();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        try { 
                System.out.println("Escriba una de las opciones");
                opcion = scanner.nextInt();
 
                app2.realizarAccion(opcion);
                
        } catch (InputMismatchException e) {
            System.out.println("Solo se permite el ingreso de números");
            scanner.next();
        }
    }

    @Override
    public void mostrarMenu() {         
        
        System.out.println("1. Listar personas");
        System.out.println("2. Crear persona");
        System.out.println("3. Eliminar personas");
        System.out.println("4. Guardar lista de personas");
        System.out.println("5. Regresar al menú principal");
 
    }

    @Override
    public void realizarAccion(int numAccion) {
        switch (numAccion) {
            case 1:
                String resource = "/personas.json";
                //String fileName = UnitTests.class.getClassLoader().getResource(resource).getFile();
                break;
            case 2:
                Map<String, Object> map = new HashMap<>();
                map.put("name", "John Deo");
                map.put("email", "john.doe@example.com");
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            default:
                System.out.println("Solo se cuenta con opciones del 1 al 5");
        }
    }
        
}

package lab1.opcion2;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) throws JsonProcessingException {
        boolean salir = false;
        Scanner scanner = new Scanner(System.in);
        int opcion;
        Json json = new Json();
        Persona persona2 = new Persona();

        ObjectMapper objectMapper = new ObjectMapper();
        Persona persona = new Persona();

        List<Persona> listapersona = objectMapper.readValue("src/main/java/resources/personas.json",new TypeReference<List<Persona>>(){});


        while (!salir) {

            System.out.println("1. Mostrar Lista");
            System.out.println("2.Crear nueva entrada");
            System.out.println("3. Eliminar");
            System.out.println("4. Guardar");
            System.out.println("5. Salir");

            try {
                System.out.println("Escribe una de las opciones");
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Lista: ");
                        json.listar(listapersona);

                        break;
                    case 2:
                        System.out.println("Ingrese el nombre :");
                        persona2.setNombre(scanner.next());

                        System.out.println("Ingrese el apellido :");
                        persona2.setApellido(scanner.next());

                        System.out.println("Ingrese el Correo :");

                        persona2.setEmail(scanner.next());

                        System.out.println("Ingrese el genero :");
                        persona2.setGenero(scanner.next());

                        System.out.println("Ingrese la ciudad :");
                        persona2.setCiudad(scanner.next());

                        System.out.println("Ingrese la fecha de nacimiento :");
                        persona2.setFecha_nacimiento(scanner.next());

                        System.out.println("Ingrese el peso :");
                        persona2.setPeso(scanner.next());

                        System.out.println("Ingrese la direccion ip :");
                        persona2.setDireccion_ip(scanner.next());

                        listapersona.add(persona2);





                        break;
                    case 3:
                        System.out.println("Eliminar: ");
                        break;



                    case 4:

                        System.out.println("Guardar: ");

                        try {


                            // create object mapper instance
                            ObjectMapper mapper = new ObjectMapper();

                            // convert books object to JSON file
                            mapper.writeValue(Paths.get("books.json").toFile(), listapersona);

                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }

                        break;

                    case 5:

                        System.out.println(" Salir");
                        salir = true;
                        break;

                    default:
                        System.out.println("Solo se cuenta con opciones del 1 al 5");
                }
            } catch (InputMismatchException e) {
                System.out.println("Solo se permite el ingreso de números");
                scanner.next();
            }
        }
    }

}

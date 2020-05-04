package lab1.opcion2;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class json {

    public static void main (){


        ObjectMapper objectMapper = new ObjectMapper();
        Persona persona = new Persona();

        //listar
        try {
            List<Persona> listapersona = objectMapper.readValue("src/main/java/resources/personas.json",new TypeReference<List<Persona>>(){});
            int i = 0;
            for (persona:listapersona
                 ) {
                i = i+1;
                System.out.println(i);
                System.out.println(persona.getNombre());
                System.out.println(persona.getApellido());

            }

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        //crear persona



    }





}

package lab1.opcion2;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class Json {

    public  void  listar (List<Persona> listapersona){


        ObjectMapper objectMapper = new ObjectMapper();
        Persona persona = new Persona();

        //listar
        try {

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
    }





}

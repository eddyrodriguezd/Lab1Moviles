package lab1;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class json {

    public static void main (){


        ObjectMapper objectMapper = new ObjectMapper();
        Persona persona = new Persona();


        try {
            List<Persona> listapersona = objectMapper.readValue("src/main/java/resources/personas.json",new TypeReference<List<Persona>>(){});
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }



    }





}

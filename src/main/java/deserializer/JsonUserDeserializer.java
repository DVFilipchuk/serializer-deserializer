package deserializer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import interfaces.UserDeserializer;
import model.Users;

import java.io.File;
import java.io.IOException;

public class JsonUserDeserializer implements UserDeserializer {
    @Override
    public Users deserialize(String filename) {

        ObjectMapper objectMapper = new ObjectMapper();
        ObjectReader objectReader = objectMapper.readerFor(Users.class);
        Users o = null;
        try {
            o = objectReader.readValue(new File(filename), Users.class);
        } catch (IOException e) {
            e.printStackTrace();
        }


        return o;
    }
}

package deserializer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import interfaces.UserDeserializer;
import model.Users;

import java.io.File;
import java.io.IOException;

public class XmlUserDeserializer implements UserDeserializer {


    @Override
    public Users deserialize(String filename) {
        XmlMapper objectMapper = new XmlMapper();
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


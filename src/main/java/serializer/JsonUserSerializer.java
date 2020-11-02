package serializer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import interfaces.UserSerializer;
import model.User;
import model.Users;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


public class JsonUserSerializer implements UserSerializer {


    public void serialize(Users users, String filename) {

        ObjectMapper mapper = new ObjectMapper();
        ObjectWriter objectWriter = mapper.writerFor(Users.class);
        File file = new File(filename);
        try {
         objectWriter.writeValue(file, users);
        } catch (IOException e) {
            e.printStackTrace();
        }

       // return file;
    }


}

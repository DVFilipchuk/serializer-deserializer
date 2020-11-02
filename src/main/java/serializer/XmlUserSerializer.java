package serializer;


import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import interfaces.UserSerializer;
import model.User;
import model.Users;

import java.io.File;
import java.io.IOException;


public class XmlUserSerializer implements UserSerializer {

    public void serialize(Users users, String filename) {

        XmlMapper mapper = new XmlMapper();
        ObjectWriter objectWriter = mapper.writerFor(Users.class);
        File file = new File(filename);
        try {
            mapper.writerFor(Users.class).writeValue(file, users);
            objectWriter.writeValue(file, users);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //return file;
    }
}

package deserializer;

import model.Users;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class XmlUserDeserializerTest {

    @Test
    void deserialize() {

        XmlUserDeserializer xmlUserDeserializer = new XmlUserDeserializer();
        Users deserialize = xmlUserDeserializer
                .deserialize("C:\\Users\\Дима\\Desktop\\serializerdeserializer\\users.xml");

        Assertions.assertNotNull(deserialize);
    }
    }

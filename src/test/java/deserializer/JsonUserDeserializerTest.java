package deserializer;

import model.Users;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JsonUserDeserializerTest {

    @Test
    void deserialize() {

        JsonUserDeserializer jsonUserDeserializer = new JsonUserDeserializer();
        Users deserialize = jsonUserDeserializer
                .deserialize("C:\\Users\\Дима\\Desktop\\serializerdeserializer\\users.json");

        Assertions.assertNotNull(deserialize);
    }
}
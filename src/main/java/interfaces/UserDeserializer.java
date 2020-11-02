package interfaces;

import model.Users;

public interface UserDeserializer {
    Users deserialize(String filename);

}

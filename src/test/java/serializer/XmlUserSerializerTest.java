package serializer;

import model.User;
import model.Users;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class XmlUserSerializerTest {

    private Users testData(){

        User user1 = new User();
        user1.setId(1);
        user1.setName("Dima");
        user1.setEmail("123@mail.ru");

        User user2 = new User();
        user2.setId(2);
        user2.setName("Ivan");
        user2.setEmail("456@mail.ru");

        User user3 = new User();
        user3.setId(3);
        user3.setName("Ruslan");
        user3.setEmail("789@mail.ru");

        User user4 = new User();
        user4.setId(4);
        user4.setName("Petr");
        user4.setEmail("456@mail.ru");

        User user5 = new User();
        user5.setId(5);
        user5.setName("Mitya");
        user5.setEmail("46@mail.ru");

        User user6 = new User();
        user6.setId(6);
        user6.setName("Igor");
        user6.setEmail("46@mail.ru");

        User user7 = new User();
        user7.setId(7);
        user7.setName("Igor");
        user7.setEmail("46@mail.ru");

        User user8 = new User();
        user8.setId(8);
        user8.setName("Nikolay");
        user8.setEmail("4666@mail.ru");

        User user9 = new User();
        user9.setId(9);
        user9.setName("Tolik");
        user9.setEmail("4666@mail.ru");

        User user10 = new User();
        user10.setId(10);
        user10.setName("Sergei");
        user10.setEmail("4666@mail.ru");


        Users users = new Users();

        users.setUser(new ArrayList<>());
        users.getUser().add(user1);
        users.getUser().add(user2);
        users.getUser().add(user3);
        users.getUser().add(user4);
        users.getUser().add(user5);
        users.getUser().add(user6);
        users.getUser().add(user7);
        users.getUser().add(user8);
        users.getUser().add(user9);
        users.getUser().add(user10);

        return users;


    }

    @Test
    void serialize() {
        Users users = testData();
        XmlUserSerializer xmlUserSerializer = new XmlUserSerializer();
        xmlUserSerializer.serialize(users, "users.xml");


        Assertions.assertTrue(new File("users.xml").exists());
        Assertions.assertNotSame(0, new File("users.xml").length());

    }
}
package model;

import java.io.Serializable;
import java.util.ArrayList;


public class Users implements Serializable {

    private ArrayList<User> user;



    public ArrayList<User> getUser() {
        return user;
    }

    public void setUser(ArrayList<User> user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Users{" +
                "user=" + user +
                '}';
    }












}

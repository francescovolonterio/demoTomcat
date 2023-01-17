package com.volotalksaboutthings.myspringapp.dataObject;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class UsersRepo {
    
    public List<User> getItems() {
        List<User> userList =  new ArrayList<>();

        userList.add(new User(1, "Francesco", "Volonterio", 1234));
        userList.add(new User(2, "Stefano", "Volonterio", 5432));

        return userList;
    }  
}
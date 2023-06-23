package com.geekster.usermanagementsystem.Repo;

import com.geekster.usermanagementsystem.Model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class UserRepo {

    Map<Integer, User> map=new HashMap<>();

    public void addUser(User user) {
        map.put(user.getUserId(),user);
    }

    public User getUserById(Integer id) {
        return map.get(id);
    }
    public List<User > getAll(){
        List<User> userList = new ArrayList<>();
        for(Map.Entry<Integer,User> val :map.entrySet() ){
            userList.add(val.getValue());
        }
        return userList;
    }

    public void remove(Integer id) {
        map.remove(id);
    }
}

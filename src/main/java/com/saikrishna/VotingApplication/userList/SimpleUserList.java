package com.saikrishna.VotingApplication.userList;

import com.saikrishna.VotingApplication.user.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("userList")
public class SimpleUserList implements UserList {

    List<User> listOfUsers;

    public SimpleUserList(){
        this.listOfUsers=new ArrayList<>();
    }

    public void addUser(User user) {
        listOfUsers.add(user);
    }

    public List<User> getUsersList() {
        return this.listOfUsers;
    }
}

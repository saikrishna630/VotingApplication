package com.saikrishna.VotingApplication.userList;

import com.saikrishna.VotingApplication.user.User;

import java.util.List;

public interface UserList {
    void addUser(User user);
    List<User> getUsersList();
}

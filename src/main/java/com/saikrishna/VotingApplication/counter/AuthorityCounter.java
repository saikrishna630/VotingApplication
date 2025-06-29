package com.saikrishna.VotingApplication.counter;

import com.saikrishna.VotingApplication.userList.UserList;

public interface AuthorityCounter {
    void setUserList(UserList userList);
    UserList getUserList();
}

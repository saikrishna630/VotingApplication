package com.saikrishna.VotingApplication.counter;

import com.saikrishna.VotingApplication.userList.UserList;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("authorityCounter")
public class SimpleAuthorityCounter implements AuthorityCounter {

    @PostConstruct
    public void init(){
       System.out.println("Voting Has Began");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Voting Has been Ended");
    }

    @Autowired
    private UserList userList;

    public void setUserList(UserList userList) {
        this.userList=userList;
    }

    public UserList getUserList() {
        return this.userList;
    }
}

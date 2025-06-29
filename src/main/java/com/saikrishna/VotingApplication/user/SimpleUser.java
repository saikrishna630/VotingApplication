package com.saikrishna.VotingApplication.user;

import com.saikrishna.VotingApplication.party.PoliticalParty;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("user")
@Scope("prototype")
public class SimpleUser implements User {

    private String userName;


    private PoliticalParty politicalParty;

    public void setUserName(String userName) {
        this.userName=userName;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setPoliticalParty(PoliticalParty politicalParty) {
        this.politicalParty=politicalParty;
    }

    public PoliticalParty getPoliticalParty() {
        return this.politicalParty;
    }
}

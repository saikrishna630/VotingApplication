package com.saikrishna.VotingApplication.user;

import com.saikrishna.VotingApplication.party.PoliticalParty;

public interface User {
    void setUserName(String userName);
    String getUserName();
    void setPoliticalParty(PoliticalParty politicalParty);
    PoliticalParty getPoliticalParty();
}

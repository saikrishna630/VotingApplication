package com.saikrishna.VotingApplication.party;

import org.springframework.stereotype.Component;

@Component("democratic")
public class DemocraticParty implements PoliticalParty {

    String partyName="Democratic Party";
    public String getPartyName() {
        return this.partyName;
    }
}

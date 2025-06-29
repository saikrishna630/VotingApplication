package com.saikrishna.VotingApplication.party;

import org.springframework.stereotype.Component;

@Component("independent")
public class IndependentParty implements PoliticalParty {

    String partyName="Independent Party";
    public String getPartyName() {
        return this.partyName;
    }
}

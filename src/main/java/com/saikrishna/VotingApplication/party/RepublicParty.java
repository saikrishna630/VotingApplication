package com.saikrishna.VotingApplication.party;

import org.springframework.stereotype.Component;

@Component("republic")
public class RepublicParty implements PoliticalParty {

    String partyName="Republic Party";

    public String getPartyName() {
        return this.partyName;
    }
}

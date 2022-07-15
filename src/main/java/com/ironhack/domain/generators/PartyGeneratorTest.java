package com.ironhack.domain.generators;

import com.ironhack.domain.party.Party;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PartyGeneratorTest {

    @Test
    void test_randomParty() {
        Party p = PartyGenerator.randomParty(10);
        System.out.println(p.toString());
    }
}
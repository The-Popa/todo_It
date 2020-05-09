package se.lexicon.model;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    public static final int personId = 741016;
    public static final String firstName = "Tobias";
    public static final String lastName = "Carlstrom";
    private final Person testPerson;

    public PersonTest(Person testPerson) {
        this.testPerson = testPerson;
    }

    @Test
    public void personId_741016() {
        assertEquals(personId, testPerson.getPersonId());
    }


    @Test
    public void firstName_Tobias() {
        assertEquals(firstName, testPerson.getFirstName());
    }

    @Test
    public void lastName_Carlstrom() {
        assertEquals(lastName, testPerson.getLastName());
    }


}
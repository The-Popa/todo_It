package se.lexicon.data;

import se.lexicon.model.Person;

import java.util.Arrays;

import static se.lexicon.data.PersonSequencer.nextPersonId;

public class People {

    private static Person[] person = new Person[0];

    public int size() {
        return person.length;
    }

    public Person[] findAll() {
        return person;
    }

    public Person findById(final int personId) {
        int personID = 0;
        Person findPerson = new Person(personID);
        for(int i = 0; i < person.length; i++) {
            if(personId == person[i].getPersonID()) {
                findPerson = person[i];
                break;
            }
        }

        return findPerson;
    }

    public Person[] createNewPerson(final String firstName, final String lastName) {
        Person createdPerson = new Person(nextPersonId(), firstName, lastName);
        Person[] createdPersonArray = Arrays.copyOf(person, person.length + 1);
        createdPersonArray[createdPersonArray.length - 1] = createdPerson;
        return createdPersonArray;
    }

    public void clear() {
        person = new Person[0];
    }


}

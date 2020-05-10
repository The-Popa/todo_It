package se.lexicon.data;

import se.lexicon.model.Person;
import java.util.Arrays;
import static se.lexicon.data.PersonSequencer.nextPersonId;


public class People {
    private static Person[] person = new Person[0];
    public People() {

    }

    public People(Person[] person) {
        People.person = person;
    }
    public static Person[] getPerson() {
        return person;
    }
    public static void setPerson(Person[] person) {
        People.person = person;
    }
    public int size() {
        return person.length;
    }

    public Person[] findAll() {
        return person;
    }

    public Person findById(int personId) {
        Person matchPerson = new Person();
        for (Person value : person) {
            if (personId == value.getPersonId()) {
                matchPerson = value;
                break;
            }
        }
        return matchPerson;
    }

    public Person[] addNewPerson(String firstName, String lastName) {
        Person addedPerson = new Person(nextPersonId(), firstName, lastName);
        Person[] addedArray = Arrays.copyOf(person, person.length + 1);
        addedArray[addedArray.length - 1] = addedPerson;
        return addedArray;
    }

    public void clear() {
        person = new Person[0];
    }
}
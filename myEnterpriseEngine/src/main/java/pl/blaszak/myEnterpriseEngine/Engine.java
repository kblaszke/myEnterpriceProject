package pl.blaszak.myEnterpriseEngine;

import pl.blaszak.practise.myEnterpriseProject.domain.Person;

import java.util.ArrayList;
import java.util.List;

public class Engine {

    private final List<Person> persons = new ArrayList<>();

    public Engine registerPerson(Person person) {
        persons.add(person);
        return this;
    }

    public List<Person> getPersons() {
        return persons;
    }
}

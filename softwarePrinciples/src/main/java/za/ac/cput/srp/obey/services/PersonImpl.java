package za.ac.cput.srp.obey.services;

import za.ac.cput.srp.violate.domain.Person;

/**
 * Created by Aphish on 2016/03/27.
 */
public class PersonImpl {

    public Person describePerson(Person student){
    student = new Person("Aphiwe","Blom",24);

        return student;
    }
}

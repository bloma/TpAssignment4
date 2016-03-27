package za.ac.cput.srp.violate.services;

import za.ac.cput.srp.violate.domain.Person;

/**
 * Created by Aphish on 2016/03/27.
 */
public class LecturerImpl implements PersonInterface{
    String name;
    String surname;
    int age;
    public Person getPersonDescription(){
        Person lecturer = new Person(name,surname,age);

        return lecturer;
    }
}

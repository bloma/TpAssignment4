package za.ac.cput.services;

import za.ac.cput.domain.Person;

/**
 * Created by Aphish on 2016/03/24.
 */
public class StudentImpl extends Person implements PersonIdentification{

    public Person describePosition(){
        Person student = new Person();
        student.setName("Aphiwe");
        student.setSurname("Blom");
        student.setAge(25);
        student.setAddress("Khayelitsha");

        return student;
    }

}

package za.ac.cput.lsp.obey.services;

import za.ac.cput.lsp.obey.domain.Student;

/**
 * Created by Aphish on 2016/03/27.
 */
public class StudentImpl implements StudentInterface{

    String name;
    String surname;
    int age;

    public Student getStudent(){
        Student student = new Student(name,surname,age);

        return student;
    }
}

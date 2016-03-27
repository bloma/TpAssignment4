package za.ac.cput.lsp.obey.domain;

import za.ac.cput.lsp.obey.services.ValiadteStudentInterface;


/**
 * Created by Aphish on 2016/03/27.
 */
public class StudentValidation implements ValiadteStudentInterface{

    String name;
    String surname;
    int age;

    public boolean isStudent(){
        Student student = new Student(name,surname,age);

        if (student.getAge()==24){
            return true;
        } else{
            return false;
        }


    }
}

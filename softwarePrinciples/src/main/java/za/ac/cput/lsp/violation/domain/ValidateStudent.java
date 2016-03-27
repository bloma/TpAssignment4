package za.ac.cput.lsp.violation.domain;
import za.ac.cput.lsp.violation.services.IsStudentInterface;

/**
 * Created by Aphish on 2016/03/27.
 */
public class ValidateStudent implements IsStudentInterface {

    String name;
    String surname;
    int age;

    public boolean isStudent(Student student) {

        student = new Student(name,surname,age);

        if (student.getAge()==24){
            return true;
        }else{
            return false;
        }
    }
}

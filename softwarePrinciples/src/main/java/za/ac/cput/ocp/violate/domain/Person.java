package za.ac.cput.ocp.violate.domain;

/**
 * Created by Aphish on 2016/03/27.
 */
public class Person {
    String name;
    String surname;
    int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void describeName(ValidatePersonName validate){
        if (validate.isValidName(name)){
            System.out.println("Name validated you can proceed");
        }else {
            System.out.println("Invalid name sorry you cant proceed");
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}

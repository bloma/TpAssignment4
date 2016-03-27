package dip.obey.domain;

import dip.obey.services.PersonInterface;

/**
 * Created by Aphish on 2016/03/27.
 */
public class Student implements PersonInterface{
    private String name;
    private String role;

    public Student(){}

    public Student(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public String getName() {
        return name;
    }

    public String job() {
        role ="Study and pass";
        return role;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}

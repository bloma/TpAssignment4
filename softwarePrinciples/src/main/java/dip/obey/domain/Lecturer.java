package dip.obey.domain;

import dip.obey.services.PersonInterface;

/**
 * Created by Aphish on 2016/03/27.
 */
public class Lecturer implements PersonInterface{
    String name;
    String role;

    public Lecturer(){}

    public Lecturer(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public String getName() {
        return name;
    }

    public String job(){
        role = "lectures Student";
        return role;
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}

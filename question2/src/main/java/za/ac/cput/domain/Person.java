package za.ac.cput.domain;

/**
 * Created by Aphish on 2016/03/26.
 */
public class Person {

    private String name;
    private String surname;
    private String address;
    private int age;
    private Job job;

    public Person() {
    }

    public Person(String name, String surname, String address, int age, Job job) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.age = age;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public Job getJob() {
        return job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", job=" + job +
                '}';
    }
}

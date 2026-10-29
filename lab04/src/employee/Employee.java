package employee;

import person.Person;

public class Employee extends Person {
    private String position;

    public Employee(String firstName, String lastName, String position) {
        super(firstName, lastName);
        this.position = position;
    }

    public void displayData(){
        //System.out.println(firstName + " " + lastName + " : " + position);
        System.out.println(getFirstName() + " " + lastName + " : " + position);
    }

    public void showInformation(){
        System.out.println(getFirstName() + " " + lastName + " : " + position);
    }
}

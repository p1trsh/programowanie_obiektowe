package zad12A;

public class Employee {
    private String firstName;
    private String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void showInformation(){
        System.out.println(firstName + " " + lastName);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}

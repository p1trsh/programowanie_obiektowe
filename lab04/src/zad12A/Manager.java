package zad12A;

public class Manager extends Employee{

    public Manager(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public void showInformation(){
        super.showInformation();
        System.out.println("Manager");
    }
}

package zad12A;

public class Developer extends Employee{

    public Developer(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public void showInformation(){
        super.showInformation();
        System.out.println("Developer");
    }
}

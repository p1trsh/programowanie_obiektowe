package zad12A;

public class Tester extends Employee{

    public Tester(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public void showInformation(){
        super.showInformation();
        System.out.println("Tester");
    }
}

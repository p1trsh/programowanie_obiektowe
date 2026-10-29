package employee;

public class Manager extends Employee{
    private String dzial;

    public Manager(String firstName, String lastName, String position, String dzial) {
        super(firstName, lastName, position);
        this.dzial = dzial;
    }

    @Override
    public void showInformation(){
        super.showInformation();
        System.out.println("zarządza: " + dzial);
    }
}

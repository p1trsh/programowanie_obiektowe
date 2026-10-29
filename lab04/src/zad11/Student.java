package zad11;

public class Student extends Person {

    private int albumNumber;

    public Student(String name, int albumNumber) {
        super(name);
        this.albumNumber = albumNumber;
    }

    @Override
    public void showInformation() {
        System.out.println(
                name + ", " + albumNumber
        );
    }
}

public class Student {
    private String firstName; //kazdy ma swoje imie
    private String lastName; //kazdy ma swoje nazwisko
    private int albumNumber; //kazdy ma swoj numer albumu
    private static int numberOfStudents; //static liczy ilosc studentow dodajac jeden za kazdym stworzeniem nowego i pomaga automatycznie nadawac numer albumu

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        numberOfStudents++;
        this.albumNumber = numberOfStudents;
    }


    public void showStudent(){
        System.out.println(firstName + " " + lastName);
        System.out.println(albumNumber);
    }

    public void updateStudent(String firstName){
        this.firstName = firstName;
    }

    public void updateStudent(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
}

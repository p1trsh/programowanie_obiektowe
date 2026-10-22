public class Course {
    private String name; //nazwa prywatna instancyjna kazdy kurs ma wlasna
    private final int MAX_STUDENTS = 30; //liczba maksymalna studentow na jednym kursie, ustawiona raz na zawsze
    private static int numberOfCreatedCourses; //statyczna zmienna zwiekszajaca sie z kazda nowa instancja

    public Course(String name) {
        this.name = name;
        numberOfCreatedCourses++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public static int getNumberOfCreatedCourses(){
        return numberOfCreatedCourses;
    }
}

public class Person {
    private String name;
    private int age;
    private String email;

    public Person(String name, int age, String email) {
        if (name != null && !name.isBlank()) this.name = name;
        if (age >= 0 && age <= 150) this.age = age;
        if (email.contains("@")) this.email = email;
    }

    public String getName(){
        return this.name;
    }

    public String getEmail(){
        return this.email;
    }

    public int getAge(){
        return this.age;
    }

    public void setName(String name){
        if (name != null && !name.isBlank()) this.name = name;
    }

    public void setEmail(String email){
        this.name = name;
    }
    //age nie powinno miec settera poniewaz wiek nie jest czyms co mozemy sobie zmienic.
}

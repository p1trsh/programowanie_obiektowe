public class dog {
    String name;
    String breed;
    int age;

    public dog(String name, String breed, int age){
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public void bark(){
        System.out.println("Wow Wow");
    }

    public void showInformation(){
        System.out.println("name: " + name);
        System.out.println("breed: " + breed);
        System.out.println("age: " + age);
    }
}

public class person {
    String name;

    public person(String name) {
        this.name = name;
    }
    public person(person person){
        this.name = person.name;
    }

    public void introduceYourself(){
        System.out.println("I am " + name);
    }
}

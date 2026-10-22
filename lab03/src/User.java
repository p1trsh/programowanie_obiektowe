public class User {

    private String login;
    private String password;
    private int age;
    //te pola powinny byc prywatne

    public User(String login, String password, int age) {
        this.login = login;
        this.password = password;
        if (age >= 0){
            this.age = age;
        }
    }

    public void setLogin(String login){
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void showUser() { //ta funkcja nie moze byc static poniewaz odwoluje sie ona do konkretnego obiektu uzytkownika
        System.out.println(
                "Login: " + login
                        + ", hasło: " + password
                        + ", wiek: " + age
        );
    }
}
public class Klient {
    String imie;
    String nazwisko;
    String adres;

    public Klient(String imie, String nazwisko, String adres){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
    }

    public void ShowClient(){
        System.out.println(imie + " " + nazwisko);
        System.out.println(adres);
    }
}

import java.sql.SQLOutput;

public class Zamowienie {
    int id;
    Produkt zamowionyProdukt;
    Klient klient;

    public Zamowienie(int id, Produkt produkt, Klient klient){
        this.id = id;
        this.zamowionyProdukt = produkt;
        this.klient = klient;
    }

    public void showOrder(){
        System.out.println("Zamówienie numer: " + id);
        System.out.println(klient.imie + " " + klient.nazwisko);
        System.out.println("Produkt: " + zamowionyProdukt.nazwa);
        System.out.println("Cena: " + zamowionyProdukt.cena);
    }
}

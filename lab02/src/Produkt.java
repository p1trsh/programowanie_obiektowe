public class Produkt {
    String nazwa;
    double cena;

    public Produkt(String nazwa, double cena){
            this.nazwa = nazwa;
            this.cena = cena;
    }

    public void showProduct(){
        System.out.println(nazwa + ": " + cena);
    }
}

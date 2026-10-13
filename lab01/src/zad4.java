import java.util.Scanner;

public class zad4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //brak srednika na koncu linijki, program sie nie kompiluje

        System.out.print("Podaj liczbę: ");
        int liczba = scanner.nextInt();

        if (liczba % 2 == 0) { //pojedyncze rowna sie przypisuje wartosc, aby wykonac porownanie musimy uzyc podwojnego znaku rownosci, program sie nie kompiluje
            System.out.println("Liczba jest parzysta");
        }
        else {
            System.out.println("Liczba jest nieparzysta"); //brak srednika, program sie nie kompiluje
        }

        for (int i = 0; i <= 5; i++) { //jezeli i=0 to jesli bedziemy ciagle odejmowac od 0, i zawsze bedzie mniejsze od 5 wiec bedzie to nieskonczona petla, program sie skompiluje ale bedzie ciagle wywolywac instrukcje petli
            System.out.println(i);
        }

        scanner.close();
    }
}
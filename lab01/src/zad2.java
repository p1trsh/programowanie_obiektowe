import java.util.Scanner;

public class zad2 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int n = Integer.parseInt(scanner.nextLine());
        if (n%2==0) System.out.println("liczba jest parzysta");
        else System.out.println("liczba jest nieparzysta");
        if (n%3==0) System.out.println("liczba jest podzielna przez 3");
        else System.out.println("liczba nie jest podzielna przez 3");
        int suma = 0;
        for (int i=1; i <= n; i++){
            suma+=i;
        }
        System.out.println("suma: " + suma);
        int parzyste = 0;
        int i = 2;
        while(i<=n){
            parzyste+=1;
            i+=2;
        }
        System.out.println("Parzyste: " + parzyste);
    }
}

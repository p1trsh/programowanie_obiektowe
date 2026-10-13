import java.util.Scanner;

public class zad3 {
    static void main(String[] args) {
        int[] tab = new int[10];
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<10; i++){
            System.out.printf("Podaj liczbę %d : ", i+1);
            tab[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i=0; i<tab.length-1; i++){
            for (int j=0; j<tab.length-i-1; j++){
                if (tab[j] > tab[j+1]){
                    int temp = tab[j];
                    tab[j] = tab[j+1];
                    tab[j+1] = temp;
                }
            }
        }
        System.out.println("najwieksza wartosc: " + tab[9]);
        System.out.println("najmniejsza wartosc: " + tab[0]);
        int suma = 0;
        for (int i=0; i<10; i++){
            suma+=tab[i];
        }
        System.out.println("suma: " + suma);
        int srednia = suma/tab.length;
        System.out.println("srednia: " + srednia);
        int liczba = 0;
        for (int i=0; i<10; i++){
            if (tab[i] > srednia){
                liczba += 1;
            }
        }
        System.out.println("ilosc liczb wiekszych od sredniej: " + liczba);
        scanner.close();
    }
}

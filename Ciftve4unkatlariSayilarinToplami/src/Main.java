import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int toplam = 0,sayi;
        System.out.println("Sayıları girmeye başlayın :");

        do {
            sayi = inp.nextInt();
            if (sayi % 4 == 0) {
                toplam += sayi;
            }
        } while (sayi%2 == 0);

        System.out.println("Girilen çift ve 4'ün katı olan sayıların toplamı: " + toplam);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Birinci sayıyı girin: ");
        int sayi1 = inp.nextInt();

        System.out.print("İkinci sayıyı girin: ");
        int sayi2 = inp.nextInt();

        int ebob = 1;
        int ekok = (sayi1 * sayi2) / ebob;

        // EBOB
        int min = Math.min(sayi1, sayi2);
        int i = 1;
        while (i <= min) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                ebob = i;
            }
            i++;
        }
        // EKOK
        int max = Math.max(sayi1, sayi2);
        while (ekok % sayi1 != 0 || ekok % sayi2 != 0) {
            ekok += max;
        }
        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);
    }
}

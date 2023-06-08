import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("N sayısını girin: ");
        int n = inp.nextInt();

        System.out.print("R sayısını girin: ");
        int r = inp.nextInt();

        if (n >= r) {
            int faktoriyelN = 1;
            int faktoriyelR = 1;
            int faktoriyelNR = 1;

            for (int i = 1; i <= n; i++) {
                faktoriyelN *= i;
            }

            for (int i = 1; i <= r; i++) {
                faktoriyelR *= i;
            }

            for (int i = 1; i <= n - r; i++) {
                faktoriyelNR *= i;
            }

            int kombinasyon = faktoriyelN / (faktoriyelR * faktoriyelNR);
            System.out.println("C(" + n + ", " + r + ") = " + kombinasyon);
        } else {
            System.err.println("Hatalı giriş! N sayısı R sayısından küçük olmalıdır.");
        }
    }
}

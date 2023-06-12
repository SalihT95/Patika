import java.util.Scanner;

public class Main {

    public static boolean isPrime(int n, int i) {
        if (n <= 2)
            return (n == 2);

        if (n % i == 0) {

            return false;
        }else {
            isPrime(n, i + 1);
            return true;
        }

    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int n = inp.nextInt();

        if (isPrime(n, 2))
            System.out.println(n + " sayısı asaldır.");
        else
            System.out.println(n + " sayısı asal değildir.");

        inp.close();
    }
}

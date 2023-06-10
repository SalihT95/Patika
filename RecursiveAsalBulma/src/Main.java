import java.util.Scanner;

public class Main {
    static void prime() {
        Scanner inp = new Scanner(System.in);

        int n ,count=0;

        System.out.print("Sayıyı giriniz: ");
        n = inp.nextInt();

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        if (count == 0) System.out.println("Sayı asal sayıdır.");
        else System.out.println("Sayı asal sayı değildir.");
        prime();
    }
    public static void main(String[] args) {
        prime() ;
    }
}
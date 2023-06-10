import java.util.Scanner;

public class Main {
    static void pattern(int n) {
        if (n <= 0) {
            System.out.print(n+" ");
            return;
        }

        System.out.print(n+" ");
        pattern(n - 5);
        System.out.print(n+" ");
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int n = inp.nextInt();
        System.out.print("Çıktı : ");
        pattern(n);

    }
}
import java.util.Scanner;
/*
      *
     ***
    *****
   *******
    *****
     ***
      *

 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayi giriniz : ");
        int n=scanner.nextInt();

        for (int i = 0; i <= n/2 ; i++) {
            for (int j = 0; j < ((n/2) - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for (int i = (n/2)-1; i >= 0 ; i--) {
            for (int j = 0; j < ((n/2) - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}

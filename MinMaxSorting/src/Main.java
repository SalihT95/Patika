import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve
        // en büyük en yakın sayıyı bulan programı yazınız.
        int[] list = {56, 34, 1, 8, 101, -2, -33};
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayi Giriniz: ");
        int n= inp.nextInt();

        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        for (int i : list) {
            if (i < n && i > min) {
                min = i;
            } else if (i > n && i < max) {
                max = i;
            }
        }

        for (int j : list) {
            System.out.print(j + ",");
        }

        System.out.println();
        System.out.println("Girilen sayıdan küçük en yakın sayı: " + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + max);

    }
}
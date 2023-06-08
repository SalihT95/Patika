import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int taban ,us,sonuc=1;
        System.out.print("Tabanı girin: ");
        taban = inp.nextInt();

        System.out.print("Üssü girin: ");
        us = inp.nextInt();


        for (int i = 0; i < us; i++) {
            sonuc *= taban;
        }

        System.out.println("Cevap: " + sonuc);
    }
}

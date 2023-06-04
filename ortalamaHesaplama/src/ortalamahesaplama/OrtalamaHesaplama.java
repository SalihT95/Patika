package ortalamahesaplama;

import java.util.Scanner;

/**
 *
 * @author Salih
 */
public class OrtalamaHesaplama {

    public static void main(String[] args) {
        int mat, fizik, kimya, tarih, muzik, turkce;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Matematik Ders Notunu Giriniz : ");
        mat = scanner.nextInt();

        System.out.print("Fizik Ders Notunu Giriniz : ");
        fizik = scanner.nextInt();

        System.out.print("Kimya Ders Notunu Giriniz : ");
        kimya = scanner.nextInt();

        System.out.print("Tarih Ders Notunu Giriniz : ");
        tarih = scanner.nextInt();

        System.out.print("Muzik Ders Notunu Giriniz : ");
        muzik = scanner.nextInt();

        System.out.print("Turkce Ders Notunu Giriniz : ");
        turkce = scanner.nextInt();

        int toplam = (mat + fizik + kimya + tarih + muzik + turkce);
        double sonuc = (toplam / 6.0);

        System.out.printf("Ders ORTALAMANIZ : %.2f " , sonuc);
        System.out.println(sonuc < 60 ? "Sinifta Kaldi :(" : "\nSinifi Gecti");

    }

}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km, years, yolTip;
        double mesKm = 0.10, normalTutar, iTutar, yasiTutar, ggitutar, total;

        Scanner inp = new Scanner(System.in);
        System.out.print("Gidilecek Mesafeyi Giriniz : ");
        km = inp.nextInt();

        System.out.print("Yasiniz : ");
        years = inp.nextInt();

        System.out.print("Yolculuk Tipini Belirtiniz   ");
        System.out.print("Tek Yon icin 1  Gidis Dönüs Icin 2 :");
        yolTip = inp.nextInt();

        if (years > 0 && km > 0) {

            switch (yolTip) {
                case 1 -> {
                    if (years <= 12) {
                        normalTutar = (km * mesKm);
                        yasiTutar = normalTutar * 0.05;
                        iTutar = normalTutar - yasiTutar;
                        System.out.println("Toplam ucret : " + iTutar + "TL");

                    } else if (years <= 24) {
                        normalTutar = (km * mesKm);
                        yasiTutar = normalTutar * 0.1;
                        iTutar = normalTutar - yasiTutar;
                        System.out.println("Toplam ucret : " + iTutar + "Tl");

                    } else if (years <= 65) {
                        normalTutar = (km * mesKm);
                        System.out.println("Toplam ucret : " + normalTutar + "TL");

                    } else {
                        normalTutar = (km * mesKm);
                        yasiTutar = normalTutar * 0.3;
                        iTutar = normalTutar - yasiTutar;
                        System.out.println("Toplam ucret" + iTutar + "TL");
                    }
                }
                case 2 -> {
                    if (years <= 12) {
                        normalTutar = (km * mesKm);
                        yasiTutar = normalTutar * 0.5;
                        iTutar = normalTutar - yasiTutar;
                        ggitutar = iTutar * 0.2;
                        total = (iTutar - ggitutar) * 2;
                        System.out.println("Toplam ucret : " + total + "TL");

                    } else if (years <= 24) {
                        normalTutar = (km * mesKm);
                        yasiTutar = normalTutar * 0.1;
                        iTutar = normalTutar - yasiTutar;
                        ggitutar = iTutar * 0.2;
                        total = (iTutar - ggitutar) * 2;
                        System.out.println("Toplam ucret : " + total + "TL");

                    } else if (years < 65) {
                        normalTutar = (km * mesKm);
                        ggitutar = normalTutar * 0.2;
                        total = normalTutar - ggitutar;
                        System.out.println("Toplam Ucret : " + total + "TL");

                    } else {
                        normalTutar = (km * mesKm);
                        yasiTutar = normalTutar * 0.3;
                        iTutar = normalTutar - yasiTutar;
                        ggitutar = iTutar * 0.2;
                        total = (iTutar - ggitutar);
                        System.out.println("Toplam Ucret : " + total + "TL");
                    }

                }
                default -> System.out.println("Hatali Giris Yaptiniz.");
            }
        } else {
            System.out.println("Gecersiz Deger Girdiniz.");
        }


    }
}
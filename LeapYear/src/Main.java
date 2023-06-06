import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int year=0;
        System.out.print("Yıl Giriniz: ");
        year=inp.nextInt();
        if (year%4==0 && year%100 !=0 || year%400==0){
            System.out.println(year+" Artik Yildir");
        }else {
            System.out.println(year+" artik yil degildir");
        }

    }
}
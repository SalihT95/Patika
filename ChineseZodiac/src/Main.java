import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year,carry;
        Scanner inp = new Scanner(System.in);
        System.out.print("Dogum Yilinizi Giriniz : ");
        year= inp.nextInt();
        carry = year%12;
        switch (carry) {
            case 0 -> System.out.println("Çin Zodyagi Burcunuz : Maymun");
            case 1 -> System.out.println("Çin Zodyagi Burcunuz : Horoz");
            case 2 -> System.out.println("Çin Zodyagi Burcunuz : Köpek");
            case 3 -> System.out.println("Çin Zodyagi Burcunuz : Domuz");
            case 4 -> System.out.println("Çin Zodyagi Burcunuz : Fare");
            case 5 -> System.out.println("Çin Zodyagi Burcunuz : Öküz");
            case 6 -> System.out.println("Çin Zodyagi Burcunuz : Kaplan");
            case 7 -> System.out.println("Çin Zodyagi Burcunuz : Tavşan");
            case 8 -> System.out.println("Çin Zodyagi Burcunuz : Ejderha");
            case 9 -> System.out.println("Çin Zodyagi Burcunuz : Yılan");
            case 10 -> System.out.println("Çin Zodyagi Burcunuz : At");
            case 11 -> System.out.println("Çin Zodyagi Burcunuz : Koyun");
        }



    }
}
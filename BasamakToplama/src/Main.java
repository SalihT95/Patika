import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n,sum=0,temp;
        System.out.print("Sayi : ");
         n= inp.nextInt();

        sum = 0;
        temp = n;

        while (temp != 0) {
            int step = temp % 10;
            sum += step;
            temp /= 10;
        }

        System.out.println("Sayının basamakları toplamı: " + sum);

    }
}
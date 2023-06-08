import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n ;
        System.out.print("Bir sayı giriniz: ");
        n = inp.nextInt();

        System.out.println("Girilen sayıya kadar olan 4'ün kuvvetleri :");
        for(int i=1; i<=n; i*=4){
            System.out.println(i);
        }

        System.out.println("Girilen sayıya kadar olan 5'in kuvvetleri :");
        for(int i=1; i<=n; i*=5){
            System.out.println(i);
        }
    }
}

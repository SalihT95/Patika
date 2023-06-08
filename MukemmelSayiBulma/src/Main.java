import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n,sum=0;
        System.out.print("Sayı giriniz: ");
        n=inp.nextInt();

        for(int i=1; i<n;i++){
            if (n%i==0){
                sum+=i;
                System.err.println(i);
            }
        }
        if (sum==n){
            System.out.println(n+" Mükemmel Sayıdır");
        }else {
            System.out.println(n+" Mükemmel Sayı Değildir");
        }


    }
}
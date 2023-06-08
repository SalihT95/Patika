import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Kaç elemanlı Fibonacci dizisi yazdırmak istersin?: ");
        int n = inp.nextInt();
        int old=0;
        int now=1;
        int temp;
        for (int i=1;i<=n;i++){
            System.out.println(old+"+"+now+"="+(old+now));
            temp=old;
            old=now;
            now=temp+now;
        }
    }
}
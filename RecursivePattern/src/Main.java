import java.util.Scanner;

public class Main {
    static void pattern(){
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int n = inp.nextInt();
        int firstNum = n;
        System.out.print("Çıktı :" +n+" ");

        for (int i=n; i>0;i-=5){
            firstNum-=5;
            System.out.print(firstNum+" ");
        }

        int lastNum =firstNum;
        for (int i=lastNum;i<n;i+=5){
            lastNum+=5;
            System.out.print(lastNum+" ");

        }
        System.out.println();
        pattern();
    }

    public static void main(String[] args) {
        pattern();
    }
}
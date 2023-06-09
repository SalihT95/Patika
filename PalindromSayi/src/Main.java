import java.util.Scanner;

public class Main {
    static boolean isPalindrom(int number){
        int temp=number,reverseNumber = 0,lastNumber;
        while (temp!=0){
            lastNumber = temp%10;
            reverseNumber=(reverseNumber*10)+lastNumber;
            System.out.println(reverseNumber);
            temp/=10;

        }
        return reverseNumber == number;
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n =inp.nextInt();
        if (isPalindrom(n)){
            System.out.println(n+" Palindrom Sayıdır");
        }else {
            System.out.println(n+" Palindrom Sayı Değildir");
        }
    }
}
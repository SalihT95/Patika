import java.util.Scanner;

public class Main {

    static boolean isPalindrome(String word) {
        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);
        }

        if (word.equals(reverse)) {
            System.out.println("Palindromik kelime");
            return true;
        }
        else {
            System.out.println("Palindromik kelime değil");
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Kelime giriniz : ");
        String word = inp.nextLine();
        System.out.println(isPalindrome(word));
    }
}
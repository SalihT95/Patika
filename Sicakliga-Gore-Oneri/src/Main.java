import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int heat;
        System.out.print("Sicaklik giriniz:");
        heat = inp.nextInt();
        if (heat >= 25){
            System.out.println("Yüzmeye gidebilirsin");
        }else if(heat >= 10){
            System.out.println("Piknige gidebilirsin");
        }else if(heat>=5) {
            System.out.println("Sinemaya gidebilirsin");
        }else {
            System.out.println("Kayaga gidebilirsin");
        }


    }
}
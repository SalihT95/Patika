import java.util.Scanner;

public class Main {
    static void power(){
        int base ,power,result=1;
        Scanner inp = new Scanner(System.in);

        System.out.print("Tabanı girin: ");
        base = inp.nextInt();

        System.out.print("Üssü girin: ");
        power = inp.nextInt();

        for (int i = 0; i < power; i++) {
            result *= base;
        }

        System.out.println("Cevap: "+result);

        power();//Recursive yapmak için tekrar çağırıyoruz

    }
    public static void main(String[] args) {
        power();
    }
}
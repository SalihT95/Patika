import java.util.Scanner;

public class Main {
    static int exponentiation(int base,int exponent){
        if (exponent==0){
            return 1;//recursive sonlanması için
        }else {
            return base*(exponentiation(base,exponent-1));
        }

    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int base ,exponent ,result=1;
        System.out.print("Tabanı girin: ");
        base = inp.nextInt();

        System.out.print("Üssü girin: ");
        exponent  = inp.nextInt();

        System.out.println("Cevap: " + exponentiation(base,exponent));
    }
}

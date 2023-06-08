import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int h ,sum=0,count=0;
        Scanner inp = new Scanner(System.in);

        System.out.println("Sayi Giriniz: ");
        h=inp.nextInt();

        for (int i =0;i<=h;i++){
            if (i%3==0&&i%4==0){
                count++;
                sum+=i;
            }
        }
        System.out.println("Ort : "+(double)(sum/count));

    }
}
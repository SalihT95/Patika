import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1,n2,select,result = 0;

        Scanner inp = new Scanner(System.in);
        System.out.println("Ilk Sayiyi Giriniz : ");
        n1 = inp.nextInt();
        System.out.println("Ikinci Sayiyi Giriniz : ");
        n2 = inp.nextInt();

        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        System.out.print("Seciminiz : ");
        select = inp.nextInt();

        switch (select){
            case 1:
                result=n1+n2;
                break;
            case 2:
                result=n1-n2;
                break;
            case 3:
                result=n1*n2;
                break;
            case 4:
                result=n1/n2;
                break;

        }
        System.out.println("Result : "+result);


    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, turkce ,kimya, muzik;
        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        mat= inp.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizik= inp.nextInt();

        System.out.print("Turkce Notunuz : ");
        turkce= inp.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya= inp.nextInt();

        System.out.print("Muzik Notunuz : ");
        muzik= inp.nextInt();

        if(mat < 0 || mat > 100 || fizik < 0 || fizik > 100 || kimya < 0 || kimya > 100 || turkce < 0 || turkce > 100 || muzik < 0 || muzik > 100){
            System.out.println("Yanlış giriş yaptınız. Lütfen 0-100 arasında notlar giriniz.");
        }else {
            double ort = (double) (mat + fizik + turkce + kimya + muzik) /5;
            if (55<=ort){
                System.out.println("Sinifi Gectiniz");

            }else{
                System.out.println("Sinifta Kaldiniz");

            }
            System.out.println("Ortalamaniz : "+ort);
        }



    }
}
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        String username,password,dUsername="SalihT95",dPassword="st123";
        // kullanıcı adı ve şifre alıyoruz
        System.out.print("KullaniciAdi: ");
        username=inp.nextLine();
        System.out.print("Sifre: ");
        password=inp.nextLine();

        //şifre doğru mu kontrolü yapıyoruz
        if (dUsername.equals(username) && dPassword.equals(password)){
            System.out.println("Giris Basarili");
        }else {
            System.out.println("Giris Hatali");

            System.out.print("Sifreni Sifirlamak Istiyor Musun?(Y/N) : ");
            String tmpPasswordRqs=inp.nextLine();
            switch (tmpPasswordRqs) {
                case "Y":
                case "y":
                    System.out.print("Yeni Sifre : ");
                    String newPassword=inp.nextLine();
                    // yeni şifre oluşturmak istiyorsa
                    if (!Objects.equals(password,newPassword)&& !Objects.equals(newPassword,dPassword)){
                        System.out.println("Sifre Olusturuldu");
                    }else {
                        System.out.println("Sifre Olusturulamadi");
                    }
                    break;
                case "N":
                case "n" :
                    System.out.println("Cikis Yapiliyor...");
                    break;
            }


        }

    }
}
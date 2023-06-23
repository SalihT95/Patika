import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //dizideki elemanları küçükten büyüğe sıralayan programı yazınız.
        // Dizinin boyutunu ve dizinin elemanlarını kullanıcıdan alınız.
        Scanner inp = new Scanner(System.in);
        int arrLength;
        System.out.print("Dizi Boyutu : ");
        arrLength= inp.nextInt();//boyut alma

        int[] arr = new int[arrLength];

        for (int i = 0;i <arrLength;i++){//değerleri alma
            System.out.print("A["+i+"] =");
            arr[i]= inp.nextInt();
        }

        System.out.println("Dizi : " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sıralı : " + Arrays.toString(arr));
    }
}
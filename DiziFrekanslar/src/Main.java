import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10,10,10,5,5,5,5,2,1,77,7,77};
        System.out.println("Dizi : "+ Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println("Sıralı : "+ Arrays.toString(arr));
        int counter=1, i;
        System.out.println("Tekrar sayıları");
        for (i = 0;i<arr.length-1;i++){

            if (arr[i]==arr[i+1]) {
                counter++;

            }else {
                System.out.println(arr[i]+" sayısı "+counter+" kere tekrar edildi.");
                counter=1;
            }
        }
        System.out.println(arr[i]+" sayısı "+counter+" kere tekrar edildi.");//son sayı için

    }
}
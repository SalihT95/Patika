public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            sum += numbers[i] /i;
        }
        System.out.println(sum);
    }
}
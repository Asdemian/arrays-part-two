import java.util.Random;

public class Main {

    public static int[] generateRandomArray() {

        Random random = new Random();
        int[] arr = new int[30];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        //task1
        int totalOfAllPayments = 0;
        int[] arr = generateRandomArray();

        for (int i = 0; i <= arr.length - 1; i++) {
            //System.out.println(i + " " + arr[i]);
            totalOfAllPayments = totalOfAllPayments + arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + totalOfAllPayments + " рублей. ");
    }
}
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
        //task2
        int maxWaste = 1_00_000;
        int minWaste = 2_00_000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minWaste) {
                //System.out.println(i);
                minWaste = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " +minWaste + " рублей");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxWaste) {
                //System.out.println(i);
                maxWaste = arr[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила " +maxWaste+ " рублей");
    }
}
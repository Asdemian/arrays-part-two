import java.util.Random;

public class Main {

    public static double[] generateRandomArray() {

        Random random = new Random();
        double[] arr = new double[30];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        //task1
        double totalOfAllPayments = 0;
        double[] arr = generateRandomArray();

        for (int i = 0; i <= arr.length - 1; i++) {
            //System.out.println(i + " " + arr[i]);
            totalOfAllPayments = totalOfAllPayments + arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + totalOfAllPayments + " рублей. ");
        //task2
        double maxWaste = 1_00_000;
        double minWaste = 2_00_000;
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

        //task3
        double a = arr.length;
        double b = 0;
        //System.out.println(a);
        for (int c = 0; c <= arr.length - 1; c++) {
            b = b + arr[c];
        }
        double averageAmount = b / a;
        System.out.println("Средняя сумма трат за месяц составила " +averageAmount+ " рублей");

        //task4

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i > -1; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}
import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        System.out.println("Enter the elements of the array:");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();

        int max = array[0];
        int min = array[0];

        for (int i = 1; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("The maximum value of the array is: " + max);
        System.out.println("The minimum value of the array is: " + min);
    }
}

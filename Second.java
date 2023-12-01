 import java.util.Scanner;
public class Second {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        System.out.println("Enter the elements of the array:");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter the value to search for:");
        int value = scanner.nextInt();
        scanner.close();

        boolean found = false;

        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("The array contains the value " + value + ".");
        } else {
            System.out.println("The array does not contain the value " + value + ".");
        }
    }
}


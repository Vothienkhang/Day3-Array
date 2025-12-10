import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter the size of the array:");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size can not be more than 20");
            }
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Enter the element to be reversed:" + (i+1) + ":");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("The element in array is:");
        for (int j = 0; j < args.length; j++) {
            System.out.print(array[j] + " ");
        }

        for (int j = 0; j < array.length /2; j++) {
            int temp = array[j];
            array[j] = array[size - j - 1];
            array[size - j - 1] = temp;
        }

        System.out.println("The reversed array is:");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j] + " ");
        }
    }
}

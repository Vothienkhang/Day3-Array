import java.lang.module.FindException;
import java.net.BindException;
import java.util.Scanner;
// [Thực hành] Tìm giá trị lớn nhất trong mảng:
// Ứng dụng cho phép người dùng lần lượt nhập vào giá trị tài sản của các tỷ phú thế giới (đơn vị tỉ đô),
// tối đa cho phép nhập 20 giá trị,
// sau đó hiển thị giá trị tài sản lớn nhất và vị trí của nó trong danh sách.

public class MaxElementArray {
    public static void main(String[] args) {

        // Khai báo các biến, nhập và kiểm tra kích thước mảng
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter the size of the array:");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Invalid Input");
            }
        }
            while (size > 20) ;


            // Nhập giá trị cho các phần tử của mảng
            array = new int[size];
            int i = 0;
            while (i < array.length) {
                System.out.println("Enter the element you want to search:");
                array[i] = scanner.nextInt();
                i++;
            }

            // In ra danh sách tài sản đã nhập
            System.out.println("Enter property list: ");
            for (int j = 0; j < array.length; j++) {
                System.out.println(array[j] + "\t");
            }

            // Duyệt các phần tử trong mảng để tìm GTLN và vị trí
            int max = array[0];
            int index = 1;
            for (int j = 1; j < array.length; j++) {
                if (array[j] > max) {
                    max = array[j];
                    index = j + 1;
                }
            }
        System.out.println("The maximum element is " + max);
        }
    }
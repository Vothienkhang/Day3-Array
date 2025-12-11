// Tìm giá trị nhỏ nhất trong mảng không dùng method

import java.util.Scanner;

public class MinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Bước 1: Khai báo mảng số nguyên với SIZE phần tử
        System.out.println("Nhập vào size của mảng");
        int size = sc.nextInt();
        int[] array = new int[size];

        // Bước 2: Nhập giá trị cho các phần tử trong mảng từ bàn phím
        for (int i = 0; i < size; i++) {
            System.out.println(" Nhập giá trị cho phần tử thứ " + i + "trong mảng: ");
            array[i] = sc.nextInt();
        }

        System.out.print(" Mảng sau khi nhap vào: ");
        for (int j = 0; j < size; j++) {
            System.out.print(array[j] + "\t");
        }
        System.out.println();
        // Bước 3: Gọi phần tử đầu tiên trong mảng là phần tử có giá trị nhỏ nhất
        int min = array[0];

        // Bước 4: Duyệt mảng từ phần tử thứ 2 đến hết mang
        for (int i = 1; i < size; i++) {
            // So sánh lần lượt các phần tử tiếp theo với giá trị nhỏ nhất.
            if (array[i] < min) {
                min = array[i];  // Nếu phần tử tiếp theo nhỏ hơn giá trị nhỏ nhất thì gán giá trị nhỏ nhất là phần tử tiếp theo.
            }
        }

        // Bước 5: Kết thúc duyệt mảng. In ra giá trị nhỏ nhất.
        System.out.println("Giá trị nhỏ nhất trong mảng là: "+ min);
    }
}

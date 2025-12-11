import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Bước 1: Tạo 2 mảng số với kích thước cho trước
        int size1, size2;
        System.out.print("Nhập kích thước mảng 1: ");
        size1 = sc.nextInt();
        System.out.print("Nhập kích thước mảng 2: ");
        size2 = sc.nextInt();

        int [] array1 = new int [size1];
        int [] array2 = new int [size2];

        // Bước 2: Sử dụng vòng lặp nhập giá trị cho các phần tử trong mảng
        // Nhập cho mảng 1
        for (int i = 0; i < size1; i++) {
            System.out.print(" Nhập giá trị array 1 vị trí thứ " + i + " = ");
            array1[i] = sc.nextInt();
        }

        // Nhập cho mảng 2
        for (int i = 0; i < size2; i++) {
            System.out.print(" Nhập giá trị array 2 vi trí thứ " + i + " = ");
            array2[i] = sc.nextInt();
        }

        // Bước 3: Tạo mảng thứ 3 có kích thước bằng kích thước mảng 1 + kích thước mảng 2
        int [] array3 = new int[size1+size2];

        // Bước 4: Sử dụng vòng lặp để duyệt các phần tử trong mảng 1. Lấy từng phần tử trong mảng 1 gán vào từng phần tử trong mảng thứ 3, tính từ phần tử đầu tiên.
        for (int i = 0; i < size1; i++) {
            array3[i] = array1[i];
        }


        // Bước 5: Sử dụng vòng lặp để duyệt các phần tử trong mảng 2. Lấy từng phần tử trong mảng 2 gán vào phần tử tiếp theo của mảng 3, tính từ phần tử array3[array2.length]
        for (int i = 0; i < size2; i++) {
            array3[size1+i] = array2[i];
        }

        // In ra mảng sau khi ghep
        System.out.print(" Mảng 3 sau khi gộp là: ");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }

    }
}

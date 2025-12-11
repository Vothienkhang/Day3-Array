// Ứng dụng đếm số lượng sinh viên thi đỗ (v.2023)
// Ứng dụng cho phép nhập vào điểm của tối đa 30 sinh viên, sau đó hiển thị số lượng sinh viên đã thi đỗ.
import java.util.Scanner;

public class CountStudentPass {
    public  static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Khai báo các biến, nhập và kiểm tra kích thước mảng
        int size;
        int [] array;
        do {
            System.out.println("Nhap vao kich thuoc cua mang: ");
            size = sc.nextInt();
            if (size > 30) {
                System.out.println("Mang ko được vượt quá 30 element!");
            }
        }
        while (size > 30);

        array = new int[size];
        // Nhập giá trị cho các phần tử của mảng
        for (int i = 0; i < size; i++) {
            System.out.println("Nhap vao giá trị element thứ " + (i+1) + " của mảng: ");
            array[i] = sc.nextInt();
        }

        // Sử dụng vòng lặp for để in ra danh sách điểm vừa nhập, đồng thời đếm số lượng sinh viên thi đỗ
        int count = 0;
        System.out.print("Mảng danh sách điểm vừa nhập: " + "\t");
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + "\t");
            if (array[i] >=5 && array[i] <=10) {
                count++;
            }
        }
        System.out.print("\nSố lượng SV thi đỗ là: " + count + "\t");
    }
}

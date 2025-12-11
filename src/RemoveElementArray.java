import java.util.Scanner;
// Xoá phần tử khỏi mảng luyện tập sử dụng mảng và cấu trúc lặp.

public class RemoveElementArray {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Khai báo và khởi tạo mảng
        int [] array = {24,5,14,6,23,14,8};

        // In ra mảng trước khi xóa
        System.out.println("In ra mảng trước khi xóa: ");
        for(int i=0;i<array.length;i++) {
            System.out.println(array[i]);
        }
            System.out.println();

        System.out.println("Nhập vào element cần xóa: ");
        int n = scanner.nextInt();

        // Tìm vị trí cần xóa (index_del)
        int index_del = -1; // default -1 là không tìm thấy

        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                index_del = i;
                break;
            }
        }

        // Nếu không tìm thấy vị trí cần xoa
        if (index_del == -1) {
            System.out.println("Phan tu" + n + "không tồn tại trong mang.");
        } else {

            // Thực hiện xoa element ra khoi mảng
            for (int i = index_del; i < array.length -1; i++) {
                array[i] = array[i + 1];
                }
            }

        // In ra mảng sau khi xóa element
        System.out.println("Mảng sau khi xóa: ");
        for (int i = 0; i < array.length -1; i++) {
            System.out.println(array[i] + " ");
        }
    }
}

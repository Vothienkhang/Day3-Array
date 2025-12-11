import java.util.Scanner;

public class AddElementArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Khai báo và khởi tạo mảng số nguyên gồm N phần tử cho trước.
        int [] array = {1,2,3,4,5,6,7,0,0,0};
        int length_real = 7; // số lượng element thực trong mảng

        // In mảng ban đầu
        System.out.println("Mảng trước khi chèn element: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();

        // Bước 2: Nhập X là số cần chèn
        System.out.print("Nhap X la so can chèn: ");
        int X = scanner.nextInt();

        // Bước 3: Nhập vào vị trí index cần chèn X vào trong mảng
        System.out.print("Nhap index là vị trí cần chèn element X: ");
        int index = scanner.nextInt();

        // Bước 4: Nếu index <= -1 và index >= array.length – 1 thì hiển thị không chèn được phần tử vào mảng.
        if (index <= -1 || index >= array.length -1) {
            System.out.println("Không chèn được phần tử vào mảng");
        } else {

            // Bước 5: Thực hiện chèn phần tử X ở vị trí index vào mảng
            for (int i = array.length - 1; i > index; i--) {
                array[i] = array[i - 1];
            }
            // Chèn X vào vi trí index
            array[index] = X;

            // Bước 6: In ra mảng sau khi chèn element
            System.out.println("Mảng sau khi chèn element: ");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }
}

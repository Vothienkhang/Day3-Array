import java.util.Scanner;

public class StudentArray {
    public static void main(String[] args) {

        // Tạo mảng chứa danh sách tên SV
        String[] student = {"Khang", "Thien", "Vo", "Phuong", "Le"};

        // Khai bo biến lưu tên tìm kiếm và gán với giá trị nhập vào
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student Name : ");
        String input_name = scanner.nextLine();

        // Duyệt mảng SV đã khai báo ở trên, tìm phần tử có giá trị bằng với tên đã nhập vào
        boolean isExist = false;
        for (int i = 0; i < student.length; i++) {
            if (input_name.equals(student[i])) {
                System.out.println("Position of the students in the list " + input_name + " is: " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Position of the students in the list " + input_name + " is not exist");
        }
    }
}

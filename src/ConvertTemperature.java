import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;

        //Sử dụng vòng lặp do/while và cấu trúc lựa chọn switch/case để hiển in ra menu
        // lựa chọn cho người dùng.
        do {
            System.out.println("Menu.");
            System.out.println("1. fahrenheit to celsius");
            System.out.println("2. celsius to fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice");
            choice = scanner.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Enter fahrenheit: ");
                    fahrenheit = scanner.nextDouble();
                    System.out.println("farenheit to Celsius: " + farenheitToCelsius(fahrenheit));
                    break;
                }
                case 2: {
                    System.out.println("Enter Celsius: ");
                    celsius = scanner.nextDouble();
                    System.out.println("Celsius to farenheit: " + celsiusToFahrenheit(celsius));
                    break;
                }
                case 0:
                    System.exit(0);
            }
        }
        while (choice != 0);
    }

    // Xây dựng phương thức chuyển đổi từ độ C sang độ F
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0/5) * celsius + 32;
        return fahrenheit;
    }

    // Xây dựng phương thức chuyển đổi từ độ F sang độ C
    public static double farenheitToCelsius(double farenheit) {
        double celsius = (farenheit - 32) * 5 / 9;
        return celsius;
    }
}

public class MinElementArray {
    public static void main(String[] args) {
        int[] array = {10, 35, 235, 26, 23};
        int index = minvalue(array);
        System.out.println("The min element in the array is: " + array[index]);
    }
        // Khai báo phương thức minValue
        public static int minvalue(int[] array) {
            int index = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] < array[index]) {
                    index = i;
                }
            }
            return index;
        }
    }


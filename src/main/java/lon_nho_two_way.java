public class lon_nho_two_way {
    public static void main(String[] args) {

        int numbers[] = new int[]{25, 58, 48, 66, 100, 57, 99, 1, 14, 55};
        int min = numbers[0];
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Số lớn nhất trong mảng là: " + max);
        System.out.println();
        System.out.println("Số nhỏ nhất trong mảng là: " + min);
        System.out.println();
    }
}
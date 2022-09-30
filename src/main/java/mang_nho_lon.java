import java.util.Scanner;

public class mang_nho_lon {
    public static void main(String[] args){
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử cho mảng: ");
        n = input.nextInt();
        int numberArr[] = new int[n];
        for ( int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            numberArr[i] = input.nextInt();
        }
        System.out.println("Các phần tử trong mảng là: ");
        for( int i : numberArr){
            System.out.print(i + ", ");
        }
        int max = numberArr[0];
        for (int num : numberArr) {
            if(max < num) {
                max = num;
            }
        }
        int min = numberArr[0];
        for (int num : numberArr){
            if (min > num) {
                min = num;
            }
        }
        System.out.println();
        System.out.println("Số lớn nhất trong mảng là: " + max);
        System.out.println();
        System.out.println("Số nhỏ nhất trong mảng là: " + min);
        System.out.println();
    }
}

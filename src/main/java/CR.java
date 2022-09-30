import java.util.Scanner;

public class CR {
    public static void main(String[] args) {
        int a, b;
        int tong;

        Scanner input = new Scanner(System.in);
        System.out.print("a = ");
        a = input.nextInt();
        System.out.print("b = ");
        b = input.nextInt();
        tong = a + b;
        System.out.println("tổng a + b = " + tong);
    }
}
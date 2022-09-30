import java.util.Scanner;

public class condition {
    public static void main(String[] args) {
        int a;

        Scanner input = new Scanner(System.in);
        System.out.print("a = ");
        a = input.nextInt();

        if (a > 0) {
            if (a % 2 == 0) {
                System.out.println("a la so duong chan");
            } else {
                System.out.println("a la so duong le");
            }
        } else if (a < 0) {
            System.out.println("a la so am");
        } else {
            System.out.println("a la so khong am khong duong");
        }
    }
}
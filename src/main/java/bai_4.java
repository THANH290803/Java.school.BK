import java.util.Scanner;

public class bai_4 {
    public static void main (String[] args){
        int hight;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào chiều cao của tam giác: ");
        hight = input.nextInt();
        for (int i = 1; i <= hight; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

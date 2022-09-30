import java.util.Scanner;

public class BAI_5 {
    public static void main (String[] args){
        int hight;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào chiều cao của tam giác: ");
        hight = input.nextInt();
        for (int i = hight; i >= 1; --i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

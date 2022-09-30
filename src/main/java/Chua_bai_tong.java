import java.util.Scanner;

public class Chua_bai_tong {
    public static void main(String[] args) {
        // khai bao tong
        int tong = 0;
        int[] mang = new int[10];
        Scanner input = new Scanner(System.in);
        // nhap mang
        for (int i = 0; i < 10; i++) {
            System.out.println("mang[" + i + "] = ");
            mang[i] = input.nextInt();
        }
        // tinh tong
        for (int i = 0; i < 10; i++) {
            tong += mang[i];
        }
        // hien thi tong
        System.out.println("Tong = " + tong);
    }
}

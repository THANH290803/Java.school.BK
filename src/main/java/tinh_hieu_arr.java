import java.util.Scanner;

public class tinh_hieu_arr {
    public static void main(String[] args) {
        // Nhập mảng 15 số thưc. Tính hiệu của các phần tử
        int hieu = 0;
        int[] mang = new int[15];
        Scanner input = new Scanner(System.in);
        // nhap mang
        for (int i = 0; i < mang.length; i++) {
            System.out.println("mang[" + i + "] = ");
            mang[i] = input.nextInt();
        }
        // tinh tong
        for (int i = 0; i < mang.length; i++) {
            hieu -= mang[i];
        }
        // hien thi tong
        System.out.println("Hiệu = " + hieu);
    }
}

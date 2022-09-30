package loop;

import java.util.Scanner;

public class exerciseLv2_loop {
    public static void main(String[] args) {
        // tính tổng só lẻ trong khoảng từ 1 đến 10000
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("n = ");
        n = input.nextInt();
        int tong = 0;
        for (int i = 1; i < n; i++) {
            if (i % 2 != 0) {
                tong += i;
            }
        }
        System.out.println(tong);
    }
}

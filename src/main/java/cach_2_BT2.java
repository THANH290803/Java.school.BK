import java.util.Scanner;

import static java.lang.Math.sqrt;

public class cach_2_BT2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m ;
        System.out.print("m = ");
        m = input.nextInt();
        if (m > 1){
            int n, j;
            int[]a = new int[m] ;
            boolean xacnhan ;
            n = 2;
            j = 0;
            while(n < m){
                if (n<4) {
                    xacnhan = true ;

                }else {
                    int i = 2;
                    xacnhan = true ;
                    while(i<=sqrt(n)){
                        if (n % i == 0){
                            xacnhan = false;
                            break;
                        }else{
                            i++;
                        }
                    }


                }
                if (xacnhan) {
                    a[j] = n;
                    j++;
                }
                n++ ;
            }
            System.out.print("cac so nguyen to trong doan tu 1 den "+m+" la: ");
            int k = 0 ;
            while(k < j){
                System.out.print(a[k]+" ");
                k++;
            }

        }else{
            System.out.print("nhap sai m (!_!)");
        }
    }
}

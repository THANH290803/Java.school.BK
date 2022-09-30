package loop;

public class Exercise_loop_two_way {
    public static void main(String[] args){
        int tong = 0;
        for (int i = 1; i < 10000; i++){
            if(i % 2 != 0){
                tong += i;
            }
        }
        System.out.println("Tổng các số lẻ là " + tong);
    }
}

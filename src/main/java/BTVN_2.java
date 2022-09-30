import java.util.Scanner;

public class BTVN_2 {
    public static void main (String[] args){
        int i = 0;
        int num = 0;
        Scanner input = new Scanner(System.in);
        String  primeNumbers = "";
        System.out.println("Nhập vào số n:");
        int n = input.nextInt();
        input.close();
        for (i = 1; i <= n; i++)
        {
            int counter = 0;
            for(num =i; num>=1; num--)
            {
                if(i%num==0)
                {
                    counter = counter + 1;
                }
            }
            if (counter == 2)
            {
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Các số nguyên tố từ 1 đến "+ n +" là:");
        System.out.println(primeNumbers);
    }
}


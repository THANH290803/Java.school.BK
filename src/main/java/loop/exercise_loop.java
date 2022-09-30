package loop;
public class exercise_loop {
    public static void main(String[] args) {
        // in ra các số nguyên từ 1 dến 1000000
        System.out.println("---------------------for--------------------");
        for (int i = 1; i < 100; i++){
            System.out.println(i);
        }

        System.out.println("---------------------while------------------");
        int i = 1;
        while (i < 100){
            System.out.println(i);
            i++;
        }
        System.out.println("-----------------do---while------------------");
        i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i < 100);
    }
}

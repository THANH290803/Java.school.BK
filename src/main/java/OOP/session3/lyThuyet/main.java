package OOP.session3.lyThuyet;

public class main {
    public static void main(String[] args) {
        Student st1 = new Student("Nguyen Van A", 20, "BKC18563", "0123456789", "Ha Noi");
        st1.output();
        st1.output(st1.name, st1.age);
    }
}

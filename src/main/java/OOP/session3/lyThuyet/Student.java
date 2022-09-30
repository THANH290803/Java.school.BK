package OOP.session3.lyThuyet;

public class Student extends Person {
    public String id;
    public String phone;
    public String address;

    public Student() {
    }

    public Student(String name, int age, String id, String phone, String address) {
        super(name, age);
        this.id = id;
        this.phone = phone;
        this.address = address;
    }
    @Override
    public void output(){
        System.out.println(this.name + " - " + this.id);
    }
    @Override
    public void output(String name, int age){
        System.out.println(this.name + " - " + this.age + " - " + this.id + " - " + this.phone + " - " + this.address);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

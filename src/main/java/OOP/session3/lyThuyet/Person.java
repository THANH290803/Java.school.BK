package OOP.session3.lyThuyet;

public class Person {
    public String name;
    public int age;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void output(){
        System.out.println(this.name);
    }

    public void output(String name, int age){
        System.out.println(this.name + " - " + this.age);
    }
}

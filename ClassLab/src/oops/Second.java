package oops;

public class Second {
    public static void main(String[] args) {
        Student std1 = new Student();
        std1.name = "Ak";
        std1.id = 10;
        std1.marks = 100;
        std1.prints();
    }
}

class Student {
    public int id;
    public String name;
    public double marks;

    public void prints() {
        System.out.println("Name is " + name + ", id is " + id + ", Marks are " + marks);
    }
}


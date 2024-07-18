package oops;
public class ClassesBasic {
    public int id;
    public String name;
    public double marks;

    public void prints(){
        System.out.println("Name is "+ name + " id is " + id + " Marks is " + marks);
    }
    public static void main(String[] args) {
        ClassesBasic std1 = new ClassesBasic();
        std1.name = "Ankit";
        std1.id = 10;
        std1.marks =100.9;
        std1.prints();
    }
}
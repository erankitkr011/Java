package Constructor;

class Students{
    int id;
    String name;
    int marks;

    public Students(){
        System.out.println("Default Constructor");
    }
    public  Students(String name,int id,int marks){
        System.out.println("Parameterized Constructor");
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    public Students(Students std){
        System.out.println("Copy Constructor");
        this.id = std.id;
        this.name = std.name;
        this.marks = std.marks;
    }

    public void getDetails(){
        System.out.println("Id: "+id+" Marks: "+marks);
    }

    public void getDetails(String msg){
        System.out.println("Message : "+ msg);
        System.out.println("Id: "+id+" Marks: "+marks+" Name: "+name);
    }
}

public class Main {
    public static void main(String[] args){
        System.out.println("_____________");
        Students std1 = new Students();

        Students std2 = new Students("Ankit",10,100);

        Students st3 = new Students()
    }
}

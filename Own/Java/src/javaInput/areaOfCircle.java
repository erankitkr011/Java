package javaInput;
import java.util.Scanner;
public class areaOfCircle {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        double pi = 3.14;
        double area = pi * radius * radius;
        System.out.println("The area of Circle is : " + area);
    }
}

package Loop;
import java.util.Scanner;
public class addnum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int j=1,a=0;
        int n = sc.nextInt();
        while(n!=0){
            a=(n%10)+1;
            if(a==10){
                a=0;
            }
            sum=sum+a*j;
            j=j*10; //10
            n=n/10;
        }
        System.out.println(sum);
    }
}

package JackedArray;
import java.util.Scanner;
public class jackedArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //i.e row are fixed and colums are varies according to our choice
        // jaggedArray initilization at declearation time
        int[][] brr={{1,2,3},{1,2,3,4,5}, {9,0,3,4}};
        int[][] crr=new int[][]{{1,2,3},{1,2,3,4,5}, {9,0,3,4}};

        //by user
        int row = sc.nextInt();
        int[][] arr= new int[row][];
        for(int i = 0; i<row; i++) {
            int x = sc.nextInt();
            arr[i] = new int[x];
        }
        for(int i=0;i<row; i++) {
            for(int j=0;j<arr[i].length;j++)
            {
                int x = sc.nextInt();
                arr[i][j]=x;
            }
        }
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[i].length;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

}

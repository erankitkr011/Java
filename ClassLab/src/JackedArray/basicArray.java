package JackedArray;
import java.util.Scanner;
public class basicArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int [][] arr = new int[][]{
                {1,2,3},
                {4,5,6,7},
                {8,9,0,1,2}
        };

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

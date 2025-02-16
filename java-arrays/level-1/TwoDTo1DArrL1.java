import java.util.*;
public class TwoDTo1DArrL1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows :");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns :");
        int col = sc.nextInt();

        int matrix[][] = new int[row][col];   // 2D array

        int array[] = new int[row * col];     // 1D array

        System.out.println("Enter the values in the 2d array ");
        // Adding the elements in the 2d array
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        // Adding 2D array elements in the 1D array 
        int idx = 0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                array[idx++] = matrix[i][j];
            }
        }

        System.out.print("1D array is : ");
        for(int i=0;i<idx;i++){
            System.out.print(array[i]+" ");
        }

        sc.close();
    }
}

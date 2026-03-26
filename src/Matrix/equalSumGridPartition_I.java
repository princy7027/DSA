package Matrix;

import java.util.Scanner;

public class equalSumGridPartition_I {
    public static boolean canPartitionGrid(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;

        long[] rowSum=new long[n];
        long[] colSum=new long[m];

        long tot=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                tot += grid[i][j];

                //row=i
                rowSum[i] += grid[i][j];
                //col=j
                colSum[j] += grid[i][j];
            }
        }

        if(tot %2 != 0) return false;

        long upper=0;
        for(int i=0;i<n-1;i++){
            upper += rowSum[i];
            if(upper == tot - upper) return true;
        }

        long lower=0;
        for(int i=0;i<m-1;i++){
            lower += colSum[i];
            if(lower == tot - lower) return true;
        }

        return false;

    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number of rows you want  : ");
        int rows=sc.nextInt();

        System.out.print("Enter the number of columns you want  : ");
        int cols =sc.nextInt();

        int[][] matrix=new int[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j = 0; j< cols; j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        System.out.println(canPartitionGrid(matrix));
    }
}

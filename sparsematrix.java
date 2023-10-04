import java.util.Scanner;

public class sparsematrix {
    public static void main(String[] args) {
        int i, j,count=0;
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] mat = new int[row][col];
        for (i = 0; i < row; i++)
            for (j = 0; j < col; j++) {
                mat[i][j] = sc.nextInt();
            }
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.print("\n");
        }
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                if (mat[i][j]==0)
                {
                    count++;
                }
            }
        }
        if (count>(row*col)/2)
        {
            System.out.println("Sparse matrix");
        }
        else
        {
            System.out.println("Not a Sparse matrix");
        }
    }
}

import java.util.Scanner;
public class matrix{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int i,j;
        System.out.println("Enter the number of rows and columns of the 1st matrix: ");
        int r1=s.nextInt();
        int c1=s.nextInt();
        System.out.println("Enter the number of rows and columns in the 2nd matrix: ");
        int r2=s.nextInt();
        int c2=s.nextInt();
        int A[][]=new int[r1][c1];
        int B[][]=new int[r2][c2];
        int sum[][]=new int[50][50];
        int trans[][]=new int[50][50];

        if(r1==r2 && c1==c2){
            System.out.println("Enter the elements in the first matrix: ");
            for(i=0;i<r1;i++){
                for(j=0;j<c1;j++){
                    A[i][j]=s.nextInt();
                }
            }
            System.out.println("Enter the elements in the second matrix: ");
            for(i=0;i<r2;i++){
                for(j=0;j<c2;j++){
                    B[i][j]=s.nextInt();
                }
            }
            System.out.println("Sum of the matrices: ");
            for(i=0;i<r1;i++){
                for(j=0;j<c1;j++){
                    sum[i][j]=A[i][j]+B[i][j];
                    System.out.print(sum[i][j]+"\t");
                }
                System.out.println();
            }
            System.out.println("Transpose of the matrix: ");
            for(i=0;i<r1;i++){
                for(j=0;j<c1;j++){
                    System.out.print(sum[j][i]+"\t");
                }
                System.out.println();
            }
        }
    }
}

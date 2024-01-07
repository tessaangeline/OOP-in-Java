import java.util.Scanner;
public class oddorevencount{
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n=s.nextInt();
        int i,ocount=0,ecount=0;
        System.out.println("Enter the elements: ");
        int A[]=new int[n];
        for(i=0;i<n;i++){
            A[i]=s.nextInt();
        }
        for(i=0;i<n;i++){
            if(A[i]%2==0){
                ecount++;
            }
            else{
                ocount++;
            }
        }
        System.out.println("No of even numbers: "+ecount);
        System.out.println("No of odd numbers: "+ocount);
    }
}

package LABS_3;
// sum of natural number
import java.util.Scanner;
public class Q3_naturalNumSum {
    public static void main(String[] args) {
        Scanner aa=new Scanner (System.in);
        System.out.println("Enter the number limit:");
        int n=aa.nextInt();
        aa.close();
        int i,sum=0;
        System.out.println();
        for ( i=1; i<=n; i++){
            System.out.println(i);
            sum=sum+i;
        }
        System.out.println("the sum of "+n+"th number is "+sum);
    }
}

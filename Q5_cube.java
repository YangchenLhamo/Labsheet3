package LABS_3;
// cube of number upto given intergers
import java.util.Scanner;
public class Q5_cube {
    public static void main (String[] args){
        Scanner aa= new Scanner(System.in);
        System.out.println("Enter a number limit:");
        int n=aa.nextInt();
        aa.close();
        for(int i=1; i<=n; i++){
            int a=i*i*i;
            System.out.println("the cube of " +i+" is "+a);
        }
    }  
}

package LABS_3;
import java.util.Scanner;

public class Q24_arbitary{
    public static void main(String[] args) {
        int sum=0;
        Scanner aa=new Scanner(System.in);
        System.out.println("Enter a number limit");
        int n=aa.nextInt();
        System.out.println("Enter your input:");
       for(int i=1; i<=n; i++){
            int input=aa.nextInt();
            if(input>0){
                sum=sum+input;
            }
            else{
                System.out.println("The entered number is in neagtive form.");
            }
            System.out.println("Sum= "+sum);     
        }
        aa.close();
        
    }
}
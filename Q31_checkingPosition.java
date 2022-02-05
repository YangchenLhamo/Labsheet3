package LABS_3;
import java.util.Scanner;
public class Q31_checkingPosition {
    public static void main(String[] args) {
        int num1, num2, n;
        Scanner aa= new Scanner(System.in);
        System.out.println("Enter a number:");
        num1=aa.nextInt();
        System.out.println("Enter another number:");
        num2=aa.nextInt();
        System.out.println("Enter the number of position.");
        n=aa.nextInt();
        aa.close();
        int i, d=0;
        for(i=0; i<n; i++){
            d=10*n;
        }
        double a=num1%d;
        double b=num2%d;
        if (a==b){
            System.out.println("they are same.");
        }else{
            System.out.println("they are different.");
        }

    }
}

package LABS_3;
import java.util.Scanner;

public class Q17_Armstrong {
    public static void main(String[] args) {
        Scanner aa=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=aa.nextInt();
        aa.close();
        int sum=0, rem, temp=num;
        while(temp!=0){
            rem=temp%10;
            sum=sum+(rem*rem*rem);
            temp=temp/10;
        }
        if(sum==num){
            System.out.println(num+" is an armstrong number." );
        }
        else{
            System.out.println(num+" is not an armstrong number.");
        }
    }
}

package LABS_3;
import java.util.Scanner;

public class Q16_prime {
    public static void main(String[] args) {
        Scanner pp=new Scanner(System.in);
        System.out.println("Enter a new number:");
        int num=pp.nextInt();
        pp.close();
        int i;
        for(i=2; i<=num; i++){
            if( num%i==0){
                break;
            }
        }
        if (i==num){
            System.out.println(num +" is a prime number");
        }
        else{
            System.out.println(num+" is not a prime number");
        }  
    }
}

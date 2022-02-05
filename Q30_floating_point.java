package LABS_3;
import java.util.Scanner;
public class Q30_floating_point {
    public static void main(String[] args) {
        double num1, num2;
        Scanner ss= new Scanner (System.in);
        System.out.println("Enter a number:");
        num1=ss.nextDouble();
        System.out.println("Enter another number:");
        num2=ss.nextDouble();
        System.out.println("enter a precision value:");
        int n=ss.nextInt();
        ss.close();
        int i,d=0;
        for(i=0; i<n; i++){
            d=10*n;
        }
        double a=num1*d;
        double b=num2*d;
        if(a==b){
            System.out.println(num1+" and "+num2+" are same.");
        }
        else{
            System.out.println(num1+" and "+num2+" are different.");
        }
        
        
    }
    
}

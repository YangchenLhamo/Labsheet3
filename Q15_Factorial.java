package LABS_3;
import java.util.Scanner;

public class Q15_Factorial {
    public static void main(String[] args) {
        Scanner ff=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=ff.nextInt();
        ff.close();
        int fac=1;
        for(int i=1; i<=n; i++){
            fac=fac*i;
        }
        System.out.println("Factorial of "+n+" is "+ fac);  
    }
}

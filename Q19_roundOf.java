package LABS_3;
import java.util.Scanner;

public class Q19_roundOf {
    public static void main(String[] args) {
        Scanner ff=new Scanner(System.in);
        System.out.println("Enter a number:");
        double num=ff.nextDouble();
        System.out.println("Enter a precesion number:");
        int n=ff.nextInt();
        ff.close();
        int d=1;
        for(int i=0; i<n; i++){
            d=10*d;
        }
        double value=(int)(num*d+0.5);
        value=value/d;
        System.out.println(value);
        
    }
}

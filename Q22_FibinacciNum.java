package LABS_3;
import java.util.Scanner;
public class Q22_FibinacciNum {
    public static void main(String[] args) {
        Scanner ff=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=ff.nextInt();
        ff.close();
        int n1=0,n2=1,n3=0;
        System.out.print(n1+" "+n2);
        for(int i=2; i<=n; i++){// post garda ni hunxa pre garda ni hunxa
        // loop starts from two because 0 and 1
        // are already printed
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
        System.out.println(" ");
        
        // question number 23

        System.out.println("The nth fibincci number of "+n+" is "+n3);
    
    }
    
}

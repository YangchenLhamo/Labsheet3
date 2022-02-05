package LABS_3;
// n term of odd natural number and their sum
import java.util.Scanner;
public class Q7_oddNumberSum {
    public static void main(String[] args) {
        Scanner mm=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n= mm.nextInt();
        mm.close();
        System.out.println();
        int i=1, count=0, sum=0;
        while (count!=n){
            if(i%2!=0){
                System.out.println(i);
                sum=sum+i;
                count++;
               
            }
            i++;
        }
        System.out.println("the summ of "+n+"th odd number is "+sum);
        
    }
    
}

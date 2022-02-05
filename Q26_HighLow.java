package LABS_3;
import java.util.Scanner;
import java.util.Random;

public class Q26_HighLow {
    public static void main (String[] args){
        Scanner aa=new Scanner (System.in);
        Random ran=new Random();
        boolean flag=true;
        int n=ran.nextInt(100);
        for(int i=1; i<=5; i++){
            System.out.println("Guess "+i+" :");
            int b=aa.nextInt();
            if(b<n){
                System.out.println("Hint: higher");
            }
            else if(b>n){
                System.out.println("Hint: lower");
            }
            else{
                flag=false;
                System.out.println("Correct after "+i+" Guess=good::");
                break;
            }
        }
        if (flag)
        System.out.println("Your attempt is finished");
        aa.close();
    }
    
}

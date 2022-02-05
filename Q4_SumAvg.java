package LABS_3;
import java.util.Scanner;
public class Q4_SumAvg {
    public static void main(String[] args) {
        try (Scanner aa = new Scanner(System.in)) {
            System.out.println("Enter any five number:");
            int i, sum=0, avg;
            for( i=0; i<5; i++){
                int num=aa.nextInt();
                 sum=sum+num;
   } 
   avg=sum/5;
   System.out.println("the sum of 5 number is "+sum+" and their average is "+avg);
   aa.close();
        }
}   
}
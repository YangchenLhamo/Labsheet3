package LABS_3;
import java.util.Scanner;
public class Q14_countDigit {
    public static void main(String[] args) {
        Scanner cc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=cc.nextInt();
        cc.close();
        int count=0;
        while(num!=0){
            num= num/10;
            count++;
        }
        System.out.println(count);
        
    }
}

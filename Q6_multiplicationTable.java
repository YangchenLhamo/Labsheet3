package LABS_3;
// multiolication of given integers upto 10
import java.util.Scanner;
public class Q6_multiplicationTable {
    public static void main (String[] args){
        Scanner nn=new Scanner(System.in);
        System.out.println("Enter a number");
        System.out.println();
        int n=nn.nextInt();
        nn.close();
        int i, mul=0;
        for( i=0; i<=10; i++){
             mul=mul*i;
             System.out.println(n+"X"+i+"="+mul);
        }
    }
}

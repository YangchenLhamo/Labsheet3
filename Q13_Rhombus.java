package LABS_3;
import java.util.Scanner;
public class Q13_Rhombus {
    public static void main(String[] args) {
        Scanner aa= new Scanner (System.in);    
        System.out.println("Enter a number:");
        int n=aa.nextInt();
        aa.close();

        // upper part
        for(int i=1; i<=n; i++){
            // space
            for(int space=1; space<=n-i; space++){
                System.out.print(" ");
            }

            for (int j=i; j>=1; j--){
                System.out.print(j);
            }
            for( int k=2; k<=i; k++){
                System.out.print(k);
            }
            System.out.println();
        }

        // lower part
        for(int i=n-1; i>=1; i--){
            // space
            for(int space=1; space<=n-i; space++){
                System.out.print(" ");
            }

            for (int j=i; j>=1; j--){
                System.out.print(j);
            }
            for( int k=2; k<=i; k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
    
}

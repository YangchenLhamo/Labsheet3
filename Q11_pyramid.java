package LABS_3;

public class Q11_pyramid {
    public static void main(String[] args) {
        // for row
        for (int i=1; i<=5; i++){
        
            // // for space
            for (int space=1; space<=5-i; space++){
                System.out.print(" ");
            }

            // for column
            for (int j=1; j<=i; j++){
                System.out.print(i+" ");
                
            }
            System.out.println();
        }
    }   
}

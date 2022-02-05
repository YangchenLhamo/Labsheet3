package LABS_3;
import java.util.Scanner;

public class Q18_CountCase {
    public static void main(String[] args) {
        Scanner ss=new Scanner(System.in);
        System.out.println("Enter the Strings: ");
        String input = ss.next();
        int upper = 0;
        int lower = 0;
        int number = 0;
        int special = 0;
        for(int i=0;i<input.length();i++){
            char an = input.charAt(i);
            if(an>='A' && 'Z'>=an){
                System.out.printf("\n"+"%s is upper case.",an);
                upper++;
            }
            else if(an>='a' && 'z'>=an){
                System.out.printf("\n"+"%s is lower case.",an);
                lower++;
            }
            else if(an>='0' && '9'>=an){
                System.out.printf("\n"+"%s is number.",an);
                number++;
            }
            else {
                System.out.printf("\n"+"%s is special Charater.",an);
                special++;
            }
        } 
        System.out.println("\nThere are "+upper+" Upper cases"+"\nThere are "+lower+" Lower cases. "+"\nThere are "+number+" Numbers. "+"\nThere are "+special+" Special Charaters. ");     
        ss.close();
    }
}

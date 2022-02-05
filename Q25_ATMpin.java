package LABS_3;
import java.util.Scanner;
public class Q25_ATMpin {
    public static void main(String[] args) {
        Scanner ss= new Scanner(System.in);
        int pin=123;
        int total_attempt=3;
        int current_attempt=0;
        int remaining_attempt= total_attempt-current_attempt;
        while(current_attempt !=total_attempt){
            System.out.println("Enter your pin");
            int input_pin=ss.nextInt();

            if(input_pin==pin){
                System.out.println("Correct pin");
                break;
            }else{
                current_attempt++;
                remaining_attempt= total_attempt-current_attempt;
                System.out.println("incorrect pin you have "+remaining_attempt+" attempt left");
            }
        }
        ss.close();
    }
}

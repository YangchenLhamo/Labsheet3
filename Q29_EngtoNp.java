package LABS_3;
import java.util.Scanner;
public class Q29_EngtoNp {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number in english: ");
        String inputNum=sc.next();
        String nepaliFormat="";
        for(int i=0; i<inputNum.length(); i++){
            if(inputNum.charAt(i)=='.'){
                nepaliFormat +=".";
            }else{
                nepaliFormat += (char)(inputNum.charAt(i)+2358);

            } 

        }
        System.out.println("Numbers in nepali: "+ nepaliFormat);
        sc.close();
    }
    
}

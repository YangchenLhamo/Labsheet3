package LABS_3;
import java.util.Scanner;

public class Q20_NepaliFormat {
    public static void main(String[] args) {
        Scanner nn=new Scanner(System.in);
        System.out.println("Enter a number:");
        String inputNum= nn.next();
        StringBuilder StringNum = new StringBuilder(inputNum);
        String num=" ";
        int count=0;
        StringNum.reverse();
        for (int i=0; i<StringNum.length(); i++){
            char ch= StringNum.charAt(i);
            num= num+ch;
            count++;
            if (count!=1 && (count%2)!=0){
                if(count==StringNum.length()){
                     break;
                }
                num=num+",";
            }
        }
        StringBuilder result = new StringBuilder(num);
        System.out.println(result.reverse());
        nn.close();
    }
    
}

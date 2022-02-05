package LABS_3;
import java.util.Scanner;
public class Q28_Format {
    public static void main(String[] args) {
        Scanner aa=new Scanner(System.in);
        System.out.println("Enter a number");
        String inputNum= aa.next();
        StringBuilder StringNum = new StringBuilder(inputNum); 
        String num=" ";
        System.out.println("Enter n for nepali format and e for english format");
        char format=aa.next().charAt(0);
        int count=0;
        StringNum.reverse();
        for (int i=0; i<StringNum.length(); i++){
            char ch= StringNum.charAt(i);
            num= num+ch;
            count++;
            switch (format){
                case'n':
                if (count!=1 && (count%2)!=0){
                    if(count==StringNum.length()){
                        break;
                    }
                    num=num+",";
                }
                break;
                case 'e':
                if ((count%3)==0){
                    if (count==StringNum.length()){
                        break;
                    }
                    num=num+",";
                }
                break;
            }
        }
        if(format=='n'){
            StringBuilder result=new StringBuilder(num);
            System.out.println("Nepali format: "+result.reverse());
        }
        else if (format=='e'){
            StringBuilder result=new StringBuilder(num);
            System.out.println("English format: "+result.reverse());
        }
        aa.close();

    }
    
}

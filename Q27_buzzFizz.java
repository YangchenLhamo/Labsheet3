package LABS_3;
public class Q27_buzzFizz{
    public static void main(String[] args){
        for (int i=1; i<=100; i++){
            if(i%3==0){
                System.out.println("Fizz");
            }
            else if(i%5==0){
                System.out.println("Buzz");
            }
            else if(i%5==0 && i%3==0){
                System.out.println("FizzBuzz");
            }
            else{
                System.out.println(i);
            }
        }
    }

}
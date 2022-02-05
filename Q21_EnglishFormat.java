package LABS_3;
// English Format
public class Q21_EnglishFormat{
    public static void main(String[] args) {
        String FinalNumber = "";
        String inputNum = "1234567";
        int count = 0;
        StringBuilder stringNum = new StringBuilder(inputNum);
        stringNum.reverse();
        for (int i = 0; i < stringNum.length(); i++) {
            char ch = stringNum.charAt(i);
            FinalNumber = FinalNumber + ch;
            count++;
            if (count%3== 0) {
                if (count == stringNum.length()) {
                    break;
                }
                FinalNumber = FinalNumber + ",";
            }
        }
        StringBuilder result = new StringBuilder(FinalNumber);
        System.out.println(result.reverse());
    }
}
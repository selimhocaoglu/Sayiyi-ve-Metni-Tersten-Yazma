import java.util.Scanner;

public class ReverseNumberWithStringAPI {
    public static void reverseNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Terse çevirilmesini istediğiniz sayıyı girin: ");
        int num = scanner.nextInt();
        String numString = String.valueOf(num);
        String reverseNum = "";
        for(int i=1; i <= numString.length(); i++){
            reverseNum =reverseNum + numString.charAt(numString.length()-i);
        }
        System.out.println("Ters hali: " + reverseNum);
    }
}

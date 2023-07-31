import java.util.Scanner;

public class ReverseStringWithStringAPI {
    public static void reverseString(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ters çevrilmesini istediğiniz String'i girin: ");
        String inputString = scanner.nextLine();
        String reverseStr = "";
        for(int i=1; i <= inputString.length(); i++){
            reverseStr = reverseStr + inputString.charAt(inputString.length()-i);
        }
        System.out.println("Ters hali: " + reverseStr);
    }
}

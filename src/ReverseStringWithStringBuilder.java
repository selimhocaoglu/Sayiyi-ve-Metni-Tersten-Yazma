import java.util.Scanner;

public class ReverseStringWithStringBuilder {
    public static void reverseString(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ters çevrilmesini istediğiniz String'i girin: ");
        String inputString = scanner.nextLine();
        StringBuilder reverseStr = new StringBuilder(inputString);
        System.out.println("Ters hali: " + reverseStr.reverse());
    }
}

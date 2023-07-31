import java.util.Scanner;

public class ReverseNumberWithStringBuilder {
    public static void reverseNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Terse çevirilmesini istediğiniz sayıy girin: ");
        int num = scanner.nextInt();
        StringBuilder reverseNum = new StringBuilder(String.valueOf(num));
        System.out.println("Ters hali: " + reverseNum.reverse());
    }
}

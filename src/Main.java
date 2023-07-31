import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //choices();
        int i;
        //i = scanner.nextInt();
        do{
            choices();
            i = scanner.nextInt();
            switch (i){
                case 0:
                    System.out.println("Çıkış.");
                    break;
                case 1:
                    ReverseNumberWithStringBuilder.reverseNumber();
                    break;
                case 2:
                    ReverseNumberWithStringAPI.reverseNumber();
                    break;
                case 3:
                    ReverseStringWithStringBuilder.reverseString();
                    break;
                case 4:
                    ReverseStringWithStringAPI.reverseString();
                    break;
                default:
                    System.out.println("Hatalı giriş. Listedeki sayılardan uygun olanını seçip girin. ");
            }
        }
        while(i != 0);
    }
    public static void choices(){
        System.out.println("Aşağıdaki seçeneklerden istediğinizi seçin");
        System.out.println("0 ile çıkış yapabilirsiniz. ");
        System.out.println("1 ile gireceğiniz sayının rakamlarını StringBuilder ile ters çevirebilirsiniz. ");
        System.out.println("2 ile gireceğiniz sayının rakamlarını String API'si ile ters çevirebilirsiniz. ");
        System.out.println("3 ile gireceğiniz String'in rakamlarını StringBuilder ile terse çevirebilirsiniz. ");
        System.out.println("4 ile gireceğiniz String'in rakanlarını String API'si ile ters çevirebilirsiniz. ");
        System.out.println("");
    }
}
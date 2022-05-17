import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		System.out.println("Lütfen bir String giriniz.");
        Scanner in = new Scanner(System.in);
        String inputString= in.nextLine();
        String reverseString = "" ;
        int lenght = inputString.length();

        for (int index = lenght-1; index >= 0; index--) {
        	reverseString = reverseString + inputString.charAt(index);
		}

        if(inputString.equals(reverseString)) {
       	 System.out.println("Girilen kelime palindormdur");
        }
        else {
       	 System.out.println("Girilen kelime panlindrom deðildir");
        }
	}

}

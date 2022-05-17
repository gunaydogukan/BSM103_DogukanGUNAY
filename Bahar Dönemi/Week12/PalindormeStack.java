import java.util.Scanner;
import java.util.Stack;

public class PalindormeStack {

	public static void main(String[] args) {
         System.out.println("Lütfen bir String giriniz.");
         Scanner in = new Scanner(System.in);
         String inputString= in.nextLine();
         
         Stack stack = new Stack();
         
         for (int index = 0; index < inputString.length(); index++) {
			stack.push(inputString.charAt(index));
		}
         String reverseString = "" ;
         while(!stack.isEmpty()) {
        	 reverseString = reverseString + stack.pop();
         }
         if(inputString.equals(reverseString)) {
        	 System.out.println("Girilen kelime palindormdur");
         }
         else {
        	 System.out.println("Girilen kelime panlindrom deðildir");
         }
	}

}

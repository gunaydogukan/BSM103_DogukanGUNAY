import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PalindormeQueue {

	public static void main(String[] args) {
		System.out.println("Lütfen bir String giriniz.");
        Scanner in = new Scanner(System.in);
        String inputString= in.nextLine();
        
        Queue queue = new LinkedList();
        
        for (int index = inputString.length()-1; index >= 0 ; index--) {
			queue.add(inputString.charAt(index));
		}
        String reverseString = "" ;
        while(!queue.isEmpty()) {
        	reverseString = reverseString + queue.remove();
        }
        
        if(inputString.equals(reverseString)) {
       	 System.out.println("Girilen kelime palindormdur");
        }
        else {
       	 System.out.println("Girilen kelime panlindrom deðildir");
        }
	}

}

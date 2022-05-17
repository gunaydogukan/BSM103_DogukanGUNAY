package proje1;

import java.util.*;

public class StackPalindrom {

	public static void main(String[] args) {
		System.out.print("Kelime giriniz: ");
		Scanner input = new Scanner(System.in);
		
		if(palindrom(input)) {
			System.out.println("Girdiðiniz kelime palindrom kelimedir.");
		}
		else {
			System.out.println("Girdiðiniz kelime palindrom kelimesi deðildir.");
		}
		
		}
		
	public static boolean palindrom(Scanner input) {
		 Stack<Character> s = new Stack<Character>();
		 String in=input.next();
		 for (int i = 0; i < in.length(); i++) {
			s.push(in.charAt(i));
		}
		for (int i = 0; i < in.length(); i++) {
			if(in.charAt(i)==s.peek()) {
				s.pop();
			}
			else {
				return false;
			}
		}
		
		return true;
	}

}

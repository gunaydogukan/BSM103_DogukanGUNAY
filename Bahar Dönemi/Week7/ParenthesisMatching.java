package ikinci_week7;

import java.util.*;

public class ParenthesisMatching {

	public static void main(String[] args) {
		// (a+(b*c)-d) -> dengeli
		// (a*((d-e)+b -> dengesiz
		Scanner input = new Scanner(System.in);
		System.out.println("Kontrol etmek istediðiniz ifadeyi giriniz..");

		String exp = input.next();
		if (isMatching(exp)) {
			System.out.println("Ýfade dengelidir.");
		} else {
			System.out.println("Ýfade dengeli deðildir.");
		}
	}

	public static boolean isMatching(String exp) {

		Stack<Character> s = new Stack<Character>();

		for (int i = 0; i < exp.length(); i++) {

			if (exp.charAt(i) == '(') {
				s.push(exp.charAt(i));
			} else if (exp.charAt(i) == ')') {
				if (!s.isEmpty()) {
					s.pop();
				} else {
					return false;
				}
			}
		}
		return (s.isEmpty());
	}

}

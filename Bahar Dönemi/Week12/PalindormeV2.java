import java.util.Scanner;

public class PalindormeV2 {

	public static void main(String[] args) {
		System.out.println("Lütfen bir String giriniz.");
        Scanner in = new Scanner(System.in);
        String inputString= in.nextLine();
        
        System.out.println(isPalindorme(inputString));

	}
	
	public static boolean isPalindorme(String text) {
		if(text == null) {
			return false;
		}
		
		int left = 0 ;
		int right = text.length()-1;
		while(left < right){
			if(text.charAt(left++) != text.charAt(right--)) {
				return false ;
			}
		}
		
		return true;
	}

}

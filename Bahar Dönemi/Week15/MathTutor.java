import java.util.*;
import java.util.function.*;
public class MathTutor {

	public static void main(String[] args) {
	Scanner console=new Scanner(System.in);
	giveProblems(console, 3, "+", (x,y) -> x+y);

	}
	// (parametres) -> exp
	public static void giveProblems(Scanner console , int numProblems,String text,IntBinaryOperator operator) {
		
		Random r = new Random();
		int numRight=0;
		for (int i = 0; i < numProblems; i++) {
			int x=r.nextInt(12)+1; // rastgele sayý ürettiliyor 0-12 arasý
		    int y=r.nextInt(12)+1;
		    System.out.println(x+" "+ text +" "+ y +" = ");
		    int answer=operator.applyAsInt(x, y);
		    int response = console.nextInt();
		    if(response==answer) {
		    	System.out.println("Doðru");
		    	numRight++;
		    }else {
		    	System.out.println("Yanlýþ. Cevap= "+answer);
		    }
		}
		System.out.println(numProblems+" cevaptan "+numRight+" tanesi doðru");
	}

}

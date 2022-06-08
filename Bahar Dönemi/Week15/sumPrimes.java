import java.util.*;
import java.util.stream.IntStream;

public class sumPrimes {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Kaç tane asal sayý toplamak istiyorsun ? ");
		int count = console.nextInt();
		int sum = SumPrimes(count);
		int sum2 = SumPrimes2(count);
		// System.out.println("Sum = "+sum);
		System.out.println("Sum = " + sum2);
	}

	public static int SumPrimes(int count) {
		if (count <= 0) {
			return 0;
		} else {
			long start = System.currentTimeMillis();
			int sum = IntStream.iterate(1, n -> n + 1).filter(sumPrimes::isPrime2)
					.limit(count)
					.sum();
			double elapsed = (System.currentTimeMillis() - start) / 1000.0;
			System.out.println();
			System.out.println("Time = " + elapsed);
			return sum;
			/*
			 * Time = 59.606 Sum = 496165411
			 */
		}
	}

	public static boolean isPrime(int n) {
		return IntStream.range(1, n + 1).filter(x -> n % x == 0).count() == 2;

	}

	public static int SumPrimes2(int count) {
		if (count <= 0) {
			return 0;
		} else {
			long start = System.currentTimeMillis();
			int sum = IntStream.iterate(1, n -> n + 2) // çift sayýlarý görmezden geldik
					.filter(sumPrimes::isPrime2)
					.limit(count - 1)
					.sum() + 2;
			double elapsed = (System.currentTimeMillis() - start) / 1000.0;
			System.out.println();
			System.out.println("Time = " + elapsed);
			return sum;
			/*
			 * Time = 32.462
			 * 
			 * Time = 16.033 Sum = 496165411
			 */
		}
	}
	public static boolean isPrime2(int n) {
	 if(n==1) {
		 return false ;
	 }else {
		 int root =(int)Math.sqrt(n);
		 return IntStream.range(1, root+1)
				 .filter(x -> n%x==0)
				 .count()==1;
	 }
	/*n+1
	 *  *Time = 0.265

Time = 24.412
Sum = 496165411
*/
	 /* n+2 
	  * Time = 0.206

Time = 0.104
Sum = 496165411
	  */

	}

}

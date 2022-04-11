package ikinci_week7;

import java.util.*;
import java.util.concurrent.ForkJoinTask;

public class Stutter {

	public static void main(String[] args) {
		// 3,4,8,9,1
		// 3,3,4,4,8,8,9,9,1,1

		int data[] = { 3, 4, 8, 9, 1 };

		Queue<Integer> q = new LinkedList<Integer>();

		for (int n : data) {
			q.add(n);
		}
	//	System.out.println("Queue: " + q);
	//	stutter(q);
//		System.out.println("Queue: " + q);
		stutter(q);
		System.out.println("Ödev;");
		stutter2(q);
	}

	public static void stutter(Queue<Integer> q) {

		int size = q.size();
		while (size > 0) {
			int temp = q.remove(); // temp=3 Q= 4,8,9,1
			q.add(temp);
			q.add(temp);
			size--;
		}
	}
	public static void stutter2(Queue<Integer> q) {
	int size = q.size();     	
	Stack<Integer> s = new Stack<Integer>();
	
     for (int i = 0; i <q.size() ; i++) {
		int p=q.remove();
    	 s.push(p);
	     size--;
	     i--;
     }
     Stack<Integer> a = new Stack<Integer>();
     for (int i = 0; i < s.size(); i++) {
		a.push(s.pop());	
		i--;
	}

     while(a.size()>0) {
     s.push(a.peek());
     s.push(a.pop());
}
     System.out.println(s);
	}
	
}

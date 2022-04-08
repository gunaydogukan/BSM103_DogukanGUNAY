package ikinci_week7;

import java.util.*;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data[] = { "Java", "php", "python", "C", "c++" };

		Queue<String> q = new LinkedList<String>();

		// stac push pop
		// queue add remove size isEmpty
		for (String word : data) {
			q.add(word);
		}
		System.out.println("queue = " + q);
		System.out.println("peek = " + q.peek());
		System.out.println(q.size());
	}

}

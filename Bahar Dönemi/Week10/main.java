package ikinci_week9;

public class main {

	public static void main(String[] args) {
		LinkedIntList linkList = new LinkedIntList();
		linkList.add(5);
		linkList.add(4);
	//System.out.println(linkList.toString());
//	System.out.println(linkList.indexOf(4));
	linkList.add(9);
	linkList.add(10);
	System.out.println(linkList.toString());
	linkList.remove(0);
	System.out.println(linkList.toString());
linkList.add(0, 11);
System.out.println(linkList.toString());

int count = linkList.size();
System.out.println(count);
	}

	

}

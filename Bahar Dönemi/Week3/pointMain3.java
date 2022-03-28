package ikinci_donem;

public class pointMain3 {

	public static void main(String[] args) {
		
		point3 pnt = new point3(3,4);
		
		System.out.println("point = ("+pnt.x+", "+pnt.y+")");
        System.out.println(pnt.distanceFromOrigin());

   pnt.translate(3, 4);

        System.out.println("point = ("+pnt.x+", "+pnt.y+")");
        System.out.println(pnt.distanceFromOrigin());

	}

}

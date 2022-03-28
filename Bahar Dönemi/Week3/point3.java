package ikinci_donem;

public class point3 {
	
	int x ;
	int y ;
	
	public point3(int x , int y ) {
		this.x=x;
		this.y=y;
	}
	public double distanceFromOrigin() {
		return Math.sqrt(x*x + y*y);
	}
	
	public void translate(int dx , int dy) {
		x += dx;
		y += dy;
	}
}

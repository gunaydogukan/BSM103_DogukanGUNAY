package ikinci_donem;

public class point {

private int x;
private int y;

public point(int initialX , int initialY) {
setLocation(initialX , initialY);	
}

public int getX() {
	return x ;
}

public int getY() {
	return y ;
}

public double distanceFromOrigin() {
	return Math.sqrt(x*x + y*y);
}
public void translate(int dx , int dy) {
    setLocation(x + dx , y+dy);	
}

public void setLocation(int newX , int newY) {
	x = newX;
	y = newY;
	}


}

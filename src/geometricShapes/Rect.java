package geometricShapes;

public class Rect extends Quad {

	public int area() {
		return getSide1() * getSide2();
	}
	
	public Rect(int s1, int s2) {
		super(s1, s2, s1, s2);
	}
	
	public Rect() {
		this(3, 5);
	}
	
}

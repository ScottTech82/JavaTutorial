package geometricShapesConsole;

import geometricShapes.Quad;
import geometricShapes.Sqr;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Quad q1 = new Quad(5, 4, 5, 4);
		System.out.println("Perimeter is " + q1.Perimeter());
		
		Sqr s1 = new Sqr(5);
		System.out.println(s1.area());
		
	}

}

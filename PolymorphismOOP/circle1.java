import java.util.*;
public class circle1 extends shape {
	private double x;
	public void input() {
		
		Scanner sc=new Scanner (System.in);
		System.out.print("x :-  ");
		x=sc.nextDouble();
	}
	public void area() {
//		Scanner sc=new Scanner (System.in);
//		System.out.print("x");
//		int x=sc.nextInt();
		//int area=22/7*x*x;
		double area = 3.14*x*x;
		System.out.print("Area of Circle:-  "+area);
	}

}

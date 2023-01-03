import java.util.*;

abstract public class shape {
	protected double x;
	protected double y;
	public void input() {
		Scanner sc=new Scanner(System.in);
		System.out.print("x: ");
		x=sc.nextInt();
		System.out.print("y: ");
		y=sc.nextInt();
}
	abstract public void area();
//{
//		System.out.println(" ");
//	
//}
}

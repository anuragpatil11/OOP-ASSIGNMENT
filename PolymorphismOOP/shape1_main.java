import java.util.*;
public class shape1_main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int ch;
		//shape s= new shape();
		do {
			System.out.println("1 Circle:");
			System.out.println("2 Triangle");
			System.out.println("3 Rectangle");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				circle1 c=new circle1();
				c.input();
				c.area();
			break;
			case 2:
				triangle1 t =new triangle1();
				t.input();
				t.area();
				break;
				
			case 3:
				rectangle1 r=new rectangle1();
				r.input();
				r.area();
				break;
			}
		}while(ch!=4);
//		circle1 c=new circle1();
//		c.input();
//		c.area();
//		//triangle1 t =new triangle1();
//		//t.area();
//		rectangle1 r=new rectangle1();
//		r.area();

	}

}

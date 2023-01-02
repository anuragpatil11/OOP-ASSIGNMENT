import java.util.*;
public class complex_main {

	public static void main(String[] args) {
		int real,real1,img,img1;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the first real value: ");
		real=sc.nextInt();
		System.out.print("Enter the first imaginary value: ");
		img=sc.nextInt();
		complex c1 =new complex(real,img);
		System.out.print("Enter the Second real value: ");
		real1=sc.nextInt();
		System.out.print("Enter the Second imaginary value: ");
		img1=sc.nextInt();
		complex c2 =new complex(real1,img1);
		//complex c= new complex();
		complex c3 =new complex();
//		c.Display();
//		c.Add();
//		c.Subtract();
//		c.Multiply();
//		c.Division();
		//c3.Display(c1,c2);
		c3.Add(c1,c2);
		c3.Subtract(c1, c2);
		c3.Multiply(c1, c2);
		c3.Division(c1, c2);
	}

}

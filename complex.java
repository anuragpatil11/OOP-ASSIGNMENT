import java.util.*;
public class complex {
	private int real;
	private int img;
//	private int real1;
//	private int img1;
//	private int real2;
//	private int img2;
// ------------ Default constructor --------------------	
//public complex() {
//	Scanner sc= new Scanner(System.in);
//	System.out.print("Enter the first real value: ");
//	real=sc.nextInt();
//	System.out.print("Enter the first imaginary value: ");
//	img=sc.nextInt();
//	
//	System.out.print("Enter the Second real value: ");
//	real1=sc.nextInt();
//	System.out.print("Enter the Second imaginary value: ");
//	img1=sc.nextInt();
//}
	// ---------- Parameterized contructor ----------------
	public complex() {
		real=0;
		img=0;
//		Scanner sc= new Scanner(System.in);
//		System.out.print("Enter the first real value: ");
//		real=sc.nextInt();
//		System.out.print("Enter the first imaginary value: ");
//		img=sc.nextInt();
		
//		
	}
	public complex(int real,int img)
	{
		this.real=real;
		this.img=img;
	}
//	public void Add()	
public void Add(complex c1,complex c2)
{
	//real2=c1.real+c2.real1;
	real=c1.real+c2.real;
//	img2=c1.img+c2.img1;
	img=c1.img+c2.img;
	System.out.println("Addition of 2 complex numbers are: \n"+real+"+"+img+"i");
}
//public void Subtract()
public void Subtract(complex c1,complex c2)
{
	real=c1.real-c2.real;
	img=c1.img-c2.img;
	System.out.println("Subtraction of 2 complex numbers are: \n"+real+"+"+img+"i");
}
//public void Multiply()
public void Multiply(complex c1,complex c2)
{
	// (a + ib) (c + id) = (ac - bd) + i(ad + bc)
	//      (a * c)  - (b * d)
	real=(c1.real*c2.real-c1.img*c2.img);
	//        a * d + b * c
	img=( c1.real*c2.img+c1.img*c2.real);
	System.out.println("Multiplication of 2 complex numbers are: \n"+real+"+"+img+"i");
}
//public void Division() 
public void Division(complex c1,complex c2)
{
	// a+ib/c+id = (ac+bd/c^2+d^2) + i(bc-ad)/c^2+d^2)
	
	real= ((c1.real*c2.real+c1.img*c2.img)/(c2.real*c2.real+c2.img*c2.img));
	img = ((c1.img*c2.real-c1.real*c2.img)/(c2.real*c2.real+c2.img*c2.img));
	System.out.println("Division of 2 complex numbers are: \n"+real+"+"+img+"i");
}
//public void Display()
//public void Display(complex c1,complex c2) {
//	System.out.println("Real and Imaginary:" );
//	System.out.println(real+"+"+img+"i");
//	System.out.println("Real and Imaginary:" );
//	System.out.println(real1+"+"+img1+"i");


}


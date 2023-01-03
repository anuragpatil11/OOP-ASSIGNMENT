import java.util.ArrayList;
import java.util.Scanner;

public class ARRAL_main {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		//System.out.print(ARRAL.pallin("rex"));
//		a.pallin("rex");


		public static void main(String[] args) {
			int ch;
			Scanner sc =new Scanner(System.in);
			ARRAL a=new ARRAL();
			do {
				System.out.println("1.Even and Odd:");
				System.out.println("2.Prime number:");
				System.out.println("3.Pallindrome:");
				System.out.println("4.Exit");
				System.out.println("Enter your choice!!");
				ch=sc.nextInt();
				
				switch(ch) {
				case 1:
					a.even_odd();
					break;
					
				case 2:
					a.prime();
					break;
					
				case 3:
					a.pallindrome();
					break;
				}
			}while(ch!=4);	
		}
}
/* OUTPUT
1.Even and Odd:
2.Prime number:
3.Pallindrome:
4.Exit
Enter your choice!!
1
Enter size of arraylist: 
5
Enter arraylist value: 
1
Enter arraylist value: 
2
Enter arraylist value: 
3
Enter arraylist value: 
4
Enter arraylist value: 
5
[1, 2, 3, 4, 5]
Even numbers list:
[2, 4]
total Even numbers:
2
Odd numbers list:
[1, 3, 5]
total odd numbers:
3
1.Even and Odd:
2.Prime number:
3.Pallindrome:
4.Exit
Enter your choice!!
3
Enter String for Pallindrome: 
ree
String is not pallindrome
1.Even and Odd:
2.Prime number:
3.Pallindrome:
4.Exit
Enter your choice!!
2
Enter arraylist size: 
7
Enter arralist value
12
Enter arralist value
23
Enter arralist value
34
Enter arralist value
45
Enter arralist value
56
Enter arralist value
67
Enter arralist value
78
[12, 23, 34, 45, 56, 67, 78]
prime list:
[23, 67]
total prime numbers are:
2
1.Even and Odd:
2.Prime number:
3.Pallindrome:
4.Exit
Enter your choice!!
4
* 
*/
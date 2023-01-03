import java.util.*;

public class ARRAL {

	Scanner sc = new Scanner(System.in);
//	public void input() {
//		// declareing  arraylist as int1 ; 
//		ArrayList<Integer> int1 = new ArrayList<>();
//		int n, n1;
////		taking input of arraylist class for variable int1;
//		System.out.println("Enter size:");
//		n = sc.nextInt();
//		for (int i = 0; i < n; i++) {
//			System.out.println("Enter array value: ");
//			n1 = sc.nextInt();
//			int1.add(n1);
//		}
//		// Displaying elements of arraylist
//		System.out.println(int1);
//		// }
//	}
	public void even_odd()
	{
		ArrayList<Integer>list=new ArrayList<>();
		ArrayList<Integer>even=new ArrayList<>();
		ArrayList<Integer>odd=new ArrayList<>();
		int num,num1;
		System.out.println("Enter size of arraylist: ");
		num=sc.nextInt();
		for(int i=0;i<num;i++) {
			System.out.println("Enter arraylist value: ");
			num1=sc.nextInt();
			list.add(num1);
		}
		System.out.println("Arraylist values are ");
		System.out.println(list);
		int even1=0;
		int odd1=0;
		
		for(int j=0;j<num;j++) {
			if(list.get(j)%2==0) {
				even.add(list.get(j));
				even1++;
			}
			else
			{
				odd.add(list.get(j));
				odd1++;
			}
		}
		System.out.println("Even numbers list:\n"+even);
		//System.out.println(even);
		System.out.println("total Even numbers:\n"+even1);
		//System.out.println(even1);
		System.out.println("Odd numbers list:\n"+odd);
//		System.out.println(odd);
		System.out.println("total odd numbers:\n"+odd1);
//		System.out.println(odd1);
	}
	public boolean isprime(int num) {
		
		if(num==1) {
			return false;
		}
		else if(num==2)
			return true;
		else {
		for(int i=2;i<=Math.sqrt(num);i++)
		{
			if(num%i==0) {
				return false;
			}
		}
		}
		return true;
	}
	public void prime() {
		ArrayList<Integer>list=new ArrayList<>();
		ArrayList<Integer>prime=new ArrayList<>();
		int num,num1;
		System.out.println("Enter arraylist size: ");
		num=sc.nextInt();
		for(int i=0;i<num;i++) {
			System.out.println("Enter arralist value");
			num1=sc.nextInt();
			list.add(num1);
		}
		System.out.println("Arraylist values are ");
		System.out.println(list);
		int count=0;
		for(int i=0;i<num;i++) {
			if(isprime(list.get(i))) {
				prime.add(list.get(i));
				count++;
			}
		}
		System.out.println("prime list:\n"+prime);
		System.out.println("total prime numbers are:\n"+count);
	}
	public void pallindrome() {
		ArrayList<String> str1=new ArrayList<>();
		ArrayList<String> str2=new ArrayList<>();
		String s1,s2;
		System.out.println("Enter String for Pallindrome: ");
		s1=sc.next();
		str1.add(s1);
		StringBuilder sb=new StringBuilder(s1);
		sb.reverse();
		s2=sb.toString();
		str2.add(s2);
		boolean s3=s1.equals(s2);
		if(s3==true) {
			System.out.println("String is pallindrome");
		}
		else
		{
			System.out.println("String is not pallindrome");
		}
		}
}


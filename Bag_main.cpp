import java.util.*;

public class bag_main {

	public static void main(String[] args) {
		
		String color;
		double weight;
		Scanner sc=new Scanner(System.in);
		bag[] obj=new bag[20];
		
		int ch;
		do {
			System.out.println(" Displaying Total weight and count:");
			System.out.println(" Total count: "+bag.get_count()+" "+"Total weight: "+bag.get_total_weight());
			System.out.println(" 1.Inserting :");
			System.out.println(" 2.Deleting :");
			System.out.println(" 3.Displaying :");
			System.out.println(" 4.Exit:");
			System.out.println(" Enter your choice:");
			ch=sc.nextInt();
			
			switch(ch) {
			case 1:
			//	do {
					System.out.println(" 1.Inserting color:");
					System.out.println(" 2.Inserting weight:");
					System.out.println(" 3.Inserting color and weight:");
					System.out.println(" 4.Inserting None:");
					//System.out.println(" 5.Exit:");
					System.out.println(" Enter your choice:");
					ch=sc.nextInt();
					
					switch(ch) {
					case 1:
						System.out.println(" Inserting color:");
						System.out.println("Enter color:");
						color=sc.next();
						obj[bag.get_count()]=new bag(color);
						break;
						
					case 2:
						System.out.println(" Inserting weight:");
						System.out.println("Enter weight:");
						weight=sc.nextDouble();
						obj[bag.get_count()]=new bag(weight);
						break;
						
					case 3:
						System.out.println(" Inserting color and weight:");
						System.out.println("Enter color:");
						color=sc.next();
						System.out.println("Enter weight:");
						weight=sc.nextDouble();
						obj[bag.get_count()]= new bag(color,weight);
						break;
						
					case 4:
						System.out.println(" Inserting None:");
						obj[bag.get_count()]=new bag();
						ch=1;
						break;
						
//					case 5:
//						break;
					}
			//	}while(ch!=5);
				break;
				
			case 2:
				System.out.println(" Deleting element from bag:");
				//obj[bag.get_count()]--;
				obj[bag.get_count()-1].decrement();
				break;
				
			case 3:
				System.out.println(" Displaying:");
				for(int i=0;i<bag.get_count();i++)
				{
					System.out.println((i+1)+" ");
					obj[i].display();
					System.out.print("----------------------------------");
				}
				break;
				
			case 4:
				break;
			
			}
		}while(ch!=4);

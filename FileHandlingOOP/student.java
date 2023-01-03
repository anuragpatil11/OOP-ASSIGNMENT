import java.io.Serializable;
import java.util.Scanner;

public class student implements Serializable  {
	
	
	private String name;
	private int roll_no;
	private String std;
	private String student_id;
	private String address;
	private int marks;
	static Scanner st=new Scanner(System.in);
	static Scanner int1=new Scanner(System.in);
	
	public student()
	{
		System.out.println("Enter Name: ");
		name=st.next();
		System.out.println("Enter Student Id: ");
		student_id=st.next();
		System.out.println("Enter Class: ");
		std=st.next();
		System.out.println("Enter Roll No: ");
		roll_no=int1.nextInt();
		System.out.println("Enter Marks: ");
		marks=int1.nextInt();
		System.out.println("Enter Address: ");
		address=st.next();	
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getRoll_no() {
		return roll_no;
	}


	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}


	public String getStd() {
		return std;
	}


	public void setStd(String std) {
		this.std = std;
	}


	public String getStudent_id() {
		return student_id;
	}


	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public String toString() {
		return "Name-"+name+"\nStudent Id-"+student_id+"\nRoll No-"+roll_no+"\nClass- "+std+"\nMarks- "+marks+"\nAddress-"+address;
	}
}

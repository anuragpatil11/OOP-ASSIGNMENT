import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
import java.util.Objects;

public class Database {
	static Scanner st = new Scanner(System.in);
	static Scanner int1 = new Scanner(System.in);
	ArrayList<student> stud = new ArrayList<>();
	File file = new File("student.txt");
	ObjectInputStream ois = null;
	ObjectOutputStream oos = null;

	public void insertDatabase() throws Exception {
		student s = new student();
		stud.add(s);
		closefile();
	}

	public void openfile() throws Exception {
		ois = new ObjectInputStream(new FileInputStream(file));
		stud = (ArrayList<student>) ois.readObject();
		ois.close();
	}

	public void closefile() throws Exception {
		oos = new ObjectOutputStream(new FileOutputStream(file));
		oos.writeObject(stud);
		oos.close();
	}

	public void display() throws Exception {
		
		if (file.isFile()) {
			openfile();
			System.out.println("---------------------------------------------------------------------");
			for (int i = 0; i < stud.size(); i++) {
				System.out.println(stud.get(i).toString());
				System.out.println("---------------------------------------------------------------------");
			}
		} else {
			System.out.println("file doesn't exist");
		}
	}

	public void search() throws Exception {
		if (file.isFile()) {
			openfile();
			boolean found = true;
			System.out.println("Enter Student Id: ");
			String Student_id = st.next();
			student temp;
			System.out.println("----------------------------------------------");
			for (int i = 0; i < stud.size(); i++) {
				if (Objects.equals(stud.get(i).getStudent_id(), Student_id)) {
					temp = stud.get(i);
					System.out.println("found..");
					System.out.println(temp.toString());
					found = true;
					closefile();
					System.out.println("---------------------------------------------------");
				} else {
					found = false;
				}
			}
			if (found == false) {
				System.out.println("Record Not found");
			}
		} else {
			System.out.println("file doesnot exist");
		}
	}

	public void delete() throws Exception {
		if (file.isFile()) {
			openfile();
			boolean found = true;
			System.out.println("Enter Student Id: ");
			String Student_id = st.next();
			// student temp;
			for (int i = 0; i < stud.size(); i++) {
				if (Objects.equals(stud.get(i).getStudent_id(), Student_id)) {
					stud.remove(i);
					closefile();
					System.out.println("Deleted successfully");
					found = true;
				} else {
					found = false;
				}
			}
			if (found == false) {
				System.out.println("record not found");
			}
		} else {
			System.out.println("file does not exist");
		}
	}

	public void update() throws Exception {
		if (file.isFile()) {
			openfile();
			boolean found = true;
			System.out.println("Enter Student Id:");
			String Student_id = st.next();
			student temp;
			for (int i = 0; i < stud.size(); i++) {
				if (Objects.equals(stud.get(i).getStudent_id(), Student_id)) {
					temp = stud.get(i);
					System.out.println(temp.toString());
					update_record(temp);
					found = true;
					closefile();
					System.out.println("Updated successfully...");
				} else {
					found = false;
				}
			}
			if (found == false) {
				System.out.println("Record not found");
			}
		} else {
			System.out.println("file does not exist");
		}
	}

	public void update_record(student obj) {
		int ch = -1;
		do {
			System.out.println("1.Name: ");
			System.out.println("2.Student Id: ");
			System.out.println("3.Roll No: ");
			System.out.println("4.Class: ");
			System.out.println("5.Marks: ");
			System.out.println("6.Address: ");
			System.out.println("7.Exit: ");
			System.out.println("Enter you choice for update record.. ");
			ch = int1.nextInt();

			switch (ch) {
			case 1:
				System.out.println("Enter name:");
				String up_name = st.next();
				obj.setName(up_name);
				stud.set(stud.indexOf(obj), obj);
				System.out.println("update success");
				break;

			case 2:
				System.out.println("Enter Student Id: ");
				String up_Student_id = st.next();
				obj.setStudent_id(up_Student_id);
				stud.set(stud.indexOf(obj), obj);
				System.out.println("update success");
				break;
			case 3:
				System.out.println("Enter roll no: ");
				int up_roll_no = int1.nextInt();
				obj.setRoll_no(up_roll_no);
				stud.set(stud.indexOf(obj), obj);
				System.out.println("update success");
				break;
			case 4:
				System.out.println("Enter Class: ");
				String up_std = st.next();
				obj.setStudent_id(up_std);
				stud.set(stud.indexOf(obj), obj);
				System.out.println("update success");
				break;
			case 5:
				System.out.println("Enter Marks: ");
				int up_marks = int1.nextInt();
				obj.setRoll_no(up_marks);
				stud.set(stud.indexOf(obj), obj);
				System.out.println("update success");
				break;
			case 6:
				System.out.println("Enter Address: ");
				String up_address = st.next();
				obj.setStudent_id(up_address);
				stud.set(stud.indexOf(obj), obj);
				System.out.println("update success");
				break;
			case 7:
				System.out.println("Exited..");
				break;
			}
		} while (ch != 7);

	}

	public void select() throws Exception {
		int ch ;//= -1;
		do {
			System.out.println("1.Create: ");
			System.out.println("2.Display: ");
			System.out.println("3.Delete: ");
			System.out.println("4.Update: ");
			System.out.println("5.Search: ");
			System.out.println("6.Exit: ");
			System.out.println("Enter your choice!!");
			ch = int1.nextInt();
			switch (ch) {

			case 1:
				try {
					insertDatabase();
				} catch (Exception e) {
					System.out.println("Error Resolved!");
					select();
				}
				break;
			case 2:
				try {
					display();
				} catch (Exception e) {
					System.out.println("Error Resolved!");
					select();
				}
				break;
			case 3:
				try {
					delete();
				} catch (Exception e) {
					System.out.println("Error Resolved!");
					select();
				}
				break;
			case 4:
				try {
					update();
				} catch (Exception e) {
					System.out.println("Error Resolved!");
					select();
				}
				break;
			case 5:
				try {
					search();
				} catch (Exception e) {
					System.out.println("Error Resolved!");
					select();
				}
				break;
			case 6:
				System.out.println("Exiited..");
				break;
			}
		} while (ch != 6);
	}

}

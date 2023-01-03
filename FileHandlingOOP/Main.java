
public class Main {

	public static void main(String[] args) throws Exception{
		
		Database db =new Database();
		try {
			db.select();
//		db.insertDatabase();
//		db.display();
		}
		catch(Exception e) {
			System.out.println("Enter again");
			db.select();
		}
	}

}

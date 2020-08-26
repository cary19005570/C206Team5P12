import java.util.ArrayList;
import java.util.Random;
public class ParentDB {
	

	public static ArrayList<Parent> parentlist = new ArrayList <Parent>();

	String output = ParentDB.viewAllParent();
	
	public static void addParent(Parent par) {
		if (par != null) {
		parentlist.add(par);
	}
	}

	 
	public static String viewAllParent() {
		String output = "";
		for (int i = 0; i<parentlist.size(); i++ ) {
			output += parentlist.get(i).toString();
			System.out.println(output);
		}
		return output;
	}
	public static void delParent(String name) {
		
		for (int i = 0; i<parentlist.size(); i++)
			if (name == parentlist.get(i).getName()) {
				parentlist.remove(i);
			}
	}
	public static void showParentMenu() {
		String output = String.format("%-10s %-10s %-20s %-10s %-15s %-10s %-10s %-10s\n","CCA Reg ID","Name", "email", "Student ID", "Student Name", "Student Grade"
				,"Classroom", "Teacher");
			System.out.println(output);
			for (int i = 0; i<parentlist.size();i++ ) {
				String output2 = String.format("%-10s %-10s %-20s %-10s %-20s %-10s %-10s %-10s\n", parentlist.get(i).getCCAregid(),parentlist.get(i).getName(),parentlist.get(i).getEmail(),
						parentlist.get(i).getStudentid(),parentlist.get(i).getStudentName(),parentlist.get(i).getStudentGrade(),parentlist.get(i).getClassroom()
						,parentlist.get(i).getTeacher());
				System.out.println(output2);
			}
		}
	public static void updateParent(Parent par, Parent par2) {

		for (int i = 0; i<parentlist.size(); i++)
			if (par == parentlist.get(i)) {
				parentlist.set(i, par2);
			}
	}
	
	public static int IDGenerator(String email) {
		Random rand = new Random();
		Boolean check = false;
		int ID = 0;
		for (int i = 0; i<email.length();i++) {
			char test = email.charAt(i);
			if (test == '@' && check == false) {
				check = true;
				ID = rand.nextInt(1000);
			}
		
	}
		System.out.println("ID = 0 indicates error in email (Missing @ symbol)");
		return ID;

	}
	
	public static void SETID(Parent par, int ID) {
		par.setCCAregid(ID);
		System.out.println(ID);
	}
	
	
	public static boolean logincheck(int ccaregid, String studentid) {
		for (int i = 0; i<parentlist.size();i++ ) {
			if (ccaregid == parentlist.get(i).getCCAregid()) {
				if (studentid == parentlist.get(i).getStudentid()) {
					System.out.println("Login success");
					return true;
				}
			}
		}
		System.out.println("Login failure");
		return false;
	}
}

	
	
import java.util.ArrayList;
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
		String output = String.format("%-10s %-20s %-10s %-15s %-10s %-10s %-10s\n", "Name", "email", "Student ID", "Student Name", "Student Grade"
				,"Classroom", "Teacher");
			System.out.println(output);
			for (int i = 0; i<parentlist.size();i++ ) {
				String output2 = String.format("%-10s %-20s %-10s %-20s %-10s %-10s %-10s\n", parentlist.get(i).getName(),parentlist.get(i).getEmail(),
						parentlist.get(i).getStudentid(),parentlist.get(i).getStudentName(),parentlist.get(i).getStudentGrade(),parentlist.get(i).getClassroom()
						,parentlist.get(i).getTeacher());
				System.out.println(output2);
			}
		}
	}
	
	